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

public class AddStyleBookControl implements Control {

	@Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 세션에서 로그인한 사용자의 ID를 가져옴
		
        HttpSession session = req.getSession();
        String loginId = (String) session.getAttribute("loginId"); 

        // 파일 업로드 처리
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
        
        // 폼 데이터 처리
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String image = request.getFilesystemName("img");
        
        // VO 객체에 값 설정
        StyleBookVO bvo = new StyleBookVO();
        bvo.setWriter(loginId);  // 세션에서 가져온 logid를 writer로 설정
        bvo.setContent(content);
        bvo.setTitle(title);
        bvo.setImage(image);
      
        // 서비스 호출하여 데이터 저장
        StyleBookService svc = new StyleBookServiceImpl();
        if (svc.addBoard(bvo)) {
            // 목록 페이지로 이동
            resp.sendRedirect("styleBookList.do");
        } 
    }
}
