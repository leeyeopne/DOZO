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
import co.yedam.control.AddReplyControl;
import co.yedam.control.AddStyleBookControl;
import co.yedam.control.BasketControl;
import co.yedam.control.BasketFormControl;
import co.yedam.control.DeleteBasketControl;
import co.yedam.control.DeleteStyleBookControl;
import co.yedam.control.IdCheckControl;
import co.yedam.control.ImageDownload;
import co.yedam.control.LoginFormControl;
import co.yedam.control.OrderFormControl;
import co.yedam.control.PageWishlistControl;
import co.yedam.control.PagingCount;
import co.yedam.control.ProductControl;
import co.yedam.control.ProductDetailControl;
import co.yedam.control.ProductListControl;
import co.yedam.control.RegisterControl;
import co.yedam.control.RegisterFormControl;
import co.yedam.control.RemoveReplyControl;
import co.yedam.control.ReplyListControl;
import co.yedam.control.StyleBookDetailControl;
import co.yedam.control.StyleBookForm;
import co.yedam.control.StyleBookListControl;
import co.yedam.control.UpdateStyleBookControl;
import co.yedam.control.UpdateStyleBookFormControl;
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
		// 스타일북 게시판 상세
		map.put("/styleBookDetail.do", new StyleBookDetailControl());
		// 스타일북 등록
		map.put("/addStyleBook.do", new AddStyleBookControl());
		map.put("/styleBookForm.do", new StyleBookForm());
		
		// 스타일북 삭제
		map.put("/deleteStyleBook.do", new DeleteStyleBookControl());
		
		
		// 스타일북 수정창 이동
		map.put("/updateStyleBookForm.do", new UpdateStyleBookFormControl());
		
		// 스타일북 수정
		map.put("/updateStyleBook.do", new UpdateStyleBookControl());
		
		// 목록.
		map.put("/replyList.do", new ReplyListControl());
		// 등록.
		map.put("/addReply.do", new AddReplyControl());
		
		
		// 삭제.
		map.put("/removeReply.do", new RemoveReplyControl());
		// 페이징을 위한 전체건수.
		map.put("/pagingCount.do", new PagingCount());
		// 이미지 다운로드
		map.put("/imageDownload.do", new ImageDownload());

		
		// 리스트 출력
		map.put("/productList.do", new ProductListControl());

		// 장바구니 데이터 추가
		map.put("/addBasket.do", new BasketControl()); // 기능
		// 장바구니 페이지
		map.put("/basketForm.do", new BasketFormControl()); //화면

		// 장바구니 삭제
		map.put("/removeBasket.do", new DeleteBasketControl());

		// 위시리스트 페이지
		map.put("/wishList.do", new PageWishlistControl());
		// 위시리스트 데이터 추가
		map.put("/addWishlist.do", new WishlistControl());
	
		// 주문 페이지
		map.put("/orderForm.do", new OrderFormControl());

	
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String context = req.getContextPath();
		String path = uri.substring(context.length());

		Control sub = map.get(path);
		sub.exec(req, resp);
	}

} // end of class
