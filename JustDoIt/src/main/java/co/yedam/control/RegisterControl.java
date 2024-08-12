package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.MemberService;
import co.yedam.service.MemberServiceImpl;
import co.yedam.vo.MemberVO;

public class RegisterControl implements Control {
    private MemberService memberService = new MemberServiceImpl();

    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        // key=value 처리위한 application/x-www-form-urlencode 방식.
        String registerId = req.getParameter("registerId");
        String registerPw = req.getParameter("registerPw");
        String registerNm = req.getParameter("registerNm");
        String registerPhone = req.getParameter("registerPhone");
        String registerEmail = req.getParameter("registerEmail");
        String registerAddress = req.getParameter("registerAddress");
        String registerAddress1 = req.getParameter("registerAddress1");
        String registerAddress2 = req.getParameter("registerAddress2");
        String registerAddress3 = req.getParameter("registerAddress3");

        MemberVO registerMember = new MemberVO();
        registerMember.setMemberId(registerId);
        registerMember.setMemberPw(registerPw);
        registerMember.setMemberNm(registerNm);
        registerMember.setPhone(registerPhone);
        registerMember.setEmail(registerEmail);
        registerMember.setAddress(registerAddress);
        registerMember.setAddress1(registerAddress1);
        registerMember.setAddress2(registerAddress2);
        registerMember.setAddress3(registerAddress3);

        System.out.println(registerAddress1 + registerAddress2 + registerAddress3);

        boolean result = memberService.registerMember(registerMember);
        if (result) {
            // 회원 등록 성공 처리
            resp.sendRedirect("/loginForm.do");
        } else {
            // 회원 등록 실패 처리
            req.setAttribute("error", "회원 등록에 실패했습니다.");
            req.getRequestDispatcher("/registerForm.do").forward(req, resp);
        }
    }
}
