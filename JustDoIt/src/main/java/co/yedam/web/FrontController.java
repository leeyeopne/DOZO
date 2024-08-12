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
import co.yedam.control.BasketControl;
import co.yedam.control.BasketFormControl;
import co.yedam.control.DeleteBasketControl;
import co.yedam.control.IdCheckControl;
import co.yedam.control.LoginFormControl;
import co.yedam.control.ProductDetailControl;
import co.yedam.control.RegisterControl;
import co.yedam.control.RegisterFormControl;
import co.yedam.control.StyleBookListControl;
import co.yedam.control.WishlistControl;
import co.yedam.control.loginControl;
import co.yedam.control.logoutControl;

public class FrontController extends HttpServlet {

	Map<String, Control> map;

	public FrontController() {
		map = new HashMap<>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		// 상품목록.
		map.put("/productList.do", new ProductListControl());
		// 상품상세.
		map.put("/productInfo.do", new ProductControl());

		
		// 상품 상세페이지
		map.put("/productDetailInfo.do", new ProductDetailControl());

		// 회원가입 창 이동
		map.put("/registerForm.do", new RegisterFormControl());

		// 회원가입 기능
		map.put("/register.do", new RegisterControl());

		// 로그인 창 이동
		map.put("/loginForm.do", new LoginFormControl());

		// 로그인 기능
		map.put("/login.do", new loginControl());
		// 리스트 출력
		map.put("/productList.do", new ProductListControl());
	
		
		// 로그아웃 기능
		map.put("/logout.do", new logoutControl());
		
		// 아이디 중복 기능
		map.put("/idCheck.do", new IdCheckControl());
		
		// 스타일북 창 이동
		map.put("/styleBookList.do", new StyleBookListControl());
		map.put("/idCheck.do", new IdCheckControl());


		// 장바구니 데이터 추가
		map.put("/addBasket.do", new BasketControl());
		// 장바구니 페이지
		map.put("/basketForm.do", new BasketFormControl());
		 
		// 장바구니 삭제
		map.put("/removeBasket.do", new DeleteBasketControl());

		
		
		
		// 위시리스트 데이터 추가
		map.put("/addWishlist.do", new WishlistControl());

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
	
	
} // end of class

