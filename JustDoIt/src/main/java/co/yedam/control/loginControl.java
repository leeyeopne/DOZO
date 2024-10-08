package co.yedam.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.common.Control;
import co.yedam.service.MemberService;
import co.yedam.service.MemberServiceImpl;
import co.yedam.vo.MemberVO;

public class loginControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// id, pw 파라미터 => 게시글목록 or 로그인화면으로 이동
		String loginId = req.getParameter("loginId");
		String loginPw = req.getParameter("loginPw");

		MemberService svc = new MemberServiceImpl();
		MemberVO loginMember = svc.loginCheck(loginId, loginPw);

		if(loginMember != null) {
			HttpSession session = req.getSession();
			
			session.setAttribute("loginName", loginMember.getMemberNm());
			session.setAttribute("loginId", loginId);
			
			session.setAttribute("memberNo", loginMember.getMemberNo()); // memberNo 저장
			
			resp.sendRedirect("./");
		} else {
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.println("<script>");
			out.println("alert('로그인 실패')");
			out.println("history.back()");
			out.println("</script>");
		}

	}

}
