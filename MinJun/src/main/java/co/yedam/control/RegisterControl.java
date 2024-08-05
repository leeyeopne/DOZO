package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.RegisterService;
import co.yedam.service.RegisterServiceImpl;
import co.yedam.vo.MemberVO;

public class RegisterControl implements Control {
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//key=value 처리위한 application/x-www-form-urlencode 방식.
		String memberId = req.getParameter("memberId");
		String memberPw = req.getParameter("memberPw");
		String memberNm = req.getParameter("memberNm");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
				
		MemberVO member = new MemberVO();
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberNm(memberNm);
		member.setPhone(phone);
		member.setEmail(email);
		
		RegisterService svc = new RegisterServiceImpl();
		boolean result = svc.registerMember(member);
		
		
		
	}
}
 
