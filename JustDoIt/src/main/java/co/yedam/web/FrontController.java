package co.yedam.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.control.IdCheckControl;
import co.yedam.control.LoginFormControl;
import co.yedam.control.ProductDetailControl;
import co.yedam.control.RegisterControl;
import co.yedam.control.RegisterFormControl;
import co.yedam.control.loginControl;

public class FrontController extends HttpServlet {

	Map<String, Control> map;

	public FrontController() {
		map = new HashMap<>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		map.put("/productDetailInfo.do", new ProductDetailControl());

		// 회원가입 창 이동
		map.put("/registerForm.do", new RegisterFormControl());

		// 회원가입 기능
		map.put("/register.do", new RegisterControl());

		// 로그인 창 이동
		map.put("/loginForm.do", new LoginFormControl());

		// 로그인 기능
		map.put("/login.do", new loginControl());
		
		// 아이디 중복 기능
		map.put("/idCheck.do", new IdCheckControl());


	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		String uri = req.getRequestURI();
		String context = req.getContextPath();
		String path = uri.substring(context.length());

		Control sub = map.get(path);
		sub.exec(req, resp);

	}
}
