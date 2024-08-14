package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.PageWishlistService;
import co.yedam.service.PageWishlistServiceImpl;
import co.yedam.vo.WishlistVO;

public class PageWishlistControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String loginId = req.getParameter("loginId");
		PageWishlistService svc = new PageWishlistServiceImpl();
		
		//int totalCnt = svc.totalCount(search);
		
		List<WishlistVO> list = svc.wishList(loginId);
		
		req.setAttribute("Wishlist", list);
		
		req.getRequestDispatcher("product/pageWishList.tiles").forward(req, resp); // 페이지 재지정
	}

}
