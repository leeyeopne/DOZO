package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.common.PageDTO;
import co.yedam.common.SearchDTO;
import co.yedam.service.StyleBookService;
import co.yedam.service.StyleBookServiceImpl;
import co.yedam.vo.StyleBookVO;

public class StyleBookListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = req.getParameter("page");
		page = page == null ? "1" : page;
		String sc = req.getParameter("searchCondition");
		String kw = req.getParameter("keyword");
		
		SearchDTO search = new SearchDTO();
		search.setKeyword(kw);
		search.setPage(Integer.parseInt(page));
		search.setSearchCondition(sc);
		
		// req.setAttribute("myName", "홍길동");
		StyleBookService svc = new StyleBookServiceImpl();
		List<StyleBookVO> list = svc.boardList(search); // 서비스 - mapper 구분
		req.setAttribute("boardList", list);
		
		// paging
		int totalCnt = svc.totalCount(search);
		PageDTO pageDTO = new PageDTO(Integer.parseInt(page), totalCnt);
		req.setAttribute("paging", pageDTO);
		// JSP페이지에서 이용하기 위해서 attribute에 전달
		req.setAttribute("searchCondition", sc);
		req.setAttribute("keyword", kw);
		
		req.getRequestDispatcher("styleBook/styleBookList.tiles").forward(req, resp); // 페이지 재지정
	}

}
