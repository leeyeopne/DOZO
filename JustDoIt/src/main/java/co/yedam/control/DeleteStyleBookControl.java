package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.StyleBookService;
import co.yedam.service.StyleBookServiceImpl;

public class DeleteStyleBookControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String bno = req.getParameter("bno");
		String page = req.getParameter("page");
		
		StyleBookService svc = new StyleBookServiceImpl();
		if(svc.removeBoard(Integer.parseInt(bno))) {
			// 목록으로 이동
			resp.sendRedirect("styleBookList.do");
		}
	}

}
