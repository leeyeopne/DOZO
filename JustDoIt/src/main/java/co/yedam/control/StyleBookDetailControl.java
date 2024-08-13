package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.StyleBookService;
import co.yedam.service.StyleBookServiceImpl;
import co.yedam.vo.StyleBookVO;

public class StyleBookDetailControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) {
		// board.do -> WEB-INF/jsp/board.jsp
		try {
			String bno = req.getParameter("bno");
			String page = req.getParameter("page");
			
			StyleBookService svc = new StyleBookServiceImpl();
			StyleBookVO board = svc.getBoard(Integer.parseInt(bno));
			
			req.setAttribute("board", board);
			req.setAttribute("page", page);
			
			req.getRequestDispatcher("styleBook/styleBookDetail.tiles").forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}