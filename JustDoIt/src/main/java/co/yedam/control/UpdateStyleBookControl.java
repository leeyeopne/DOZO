package co.yedam.control;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import co.yedam.common.Control;
import co.yedam.service.StyleBookService;
import co.yedam.service.StyleBookServiceImpl;
import co.yedam.vo.StyleBookVO;

public class UpdateStyleBookControl implements Control {

    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
        	HttpSession session = req.getSession();
            String loginId = (String) session.getAttribute("loginId");
        	String savePath = req.getServletContext().getRealPath("img");
            
            File uploadDir = new File(savePath);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs(); // 디렉토리가 존재하지 않으면 생성
            }
            
            int maxSize = 1024 * 1024 * 5;
            MultipartRequest request = new MultipartRequest(
                req, // 요청 정보
                savePath, // 업로드 경로
                maxSize, // 최대 크기 지정
                "utf-8", // 파일명 해석 인코딩 방식 지정
                new DefaultFileRenamePolicy() // 리네임 정책
            );
            
            String bnoStr = request.getParameter("bno");
            String content = request.getParameter("content");
            String title = request.getParameter("title");
            String image = request.getFilesystemName("img");

            int bno = Integer.parseInt(bnoStr);
            

            StyleBookVO styleBookVO = new StyleBookVO();
            styleBookVO.setBoardNo(bno);
            styleBookVO.setContent(content);
            styleBookVO.setTitle(title);
            styleBookVO.setImage(image);
            

            StyleBookService svc = new StyleBookServiceImpl();
            boolean isUpdated = svc.updateBoard(styleBookVO);

            if (isUpdated) {
                resp.sendRedirect("styleBookList.do");
            } else {
                throw new ServletException("게시글 수정에 실패하였습니다.");
            }

        } catch (NumberFormatException e) {
            throw new ServletException("유효하지 않은 게시글 번호입니다.", e);
        } catch (Exception e) {
            throw new ServletException("게시글 수정 중 오류가 발생했습니다.", e);
        }
    }
}
