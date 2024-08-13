package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import co.yedam.common.Control;
import co.yedam.common.SearchDTO;
import co.yedam.service.ReplyService;
import co.yedam.service.ReplyServiceImpl;
import co.yedam.vo.ReplyVO;

public class ReplyListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/json;charset=utf-8");
		
		String bno = req.getParameter("bno");
		String page = req.getParameter("page");
		
		SearchDTO search = new SearchDTO();
		search.setBno(Integer.parseInt(bno));		
		search.setPage(Integer.parseInt(page));
		
		ReplyService svc = new ReplyServiceImpl();
		List<ReplyVO> list = svc.replyList(search);
		// json문자열.
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(list);
		
		resp.getWriter().print(json);
	}

}
