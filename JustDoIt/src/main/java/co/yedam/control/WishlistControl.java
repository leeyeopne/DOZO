package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.vo.WishlistVO;

public class WishlistControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String wishColor = req.getParameter("wishColor");
		String wishSize = req.getParameter("wishSize");
		String wishQuantity = req.getParameter("wishQuantity");
		String prodNo = req.getParameter("prodNo");
		
		WishlistVO wvo = new WishlistVO();
		wvo.setWishColor(wishColor);
		wvo.setWishSize(wishSize);
		wvo.setWishQuantity(Integer.parseInt(wishQuantity));
		wvo.setProdNo(Integer.parseInt(prodNo));
		
	}

}
