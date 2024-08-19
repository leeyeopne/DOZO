package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.StyleBookService;
import co.yedam.service.StyleBookServiceImpl;
import co.yedam.vo.StyleBookVO;

public class UpdateStyleBookFormControl implements Control {
	
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) {
		try {
			
			String bno = req.getParameter("bno");
			
			StyleBookService svc = new StyleBookServiceImpl();
			StyleBookVO board = svc.getBoard(Integer.parseInt(bno));
			
			req.setAttribute("board", board);
			req.getRequestDispatcher("styleBook/styleBookUpdateForm.tiles").forward(req, resp); // 페이지 재지정
			
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
