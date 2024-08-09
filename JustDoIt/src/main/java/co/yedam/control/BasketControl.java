package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.BasketService;
import co.yedam.service.BasketServiceImpl;
import co.yedam.vo.BasketVO;

public class BasketControl implements Control {
	
@Override
public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// 요청 파라미터 읽기
	String basketColor = req.getParameter("basketColor");
	String basketSize = req.getParameter("basketSize");
	String basketQuantity = req.getParameter("basketQuantity");
	String prodNo = req.getParameter("prodNo");
	// 데이터 변환  
	BasketVO bvo = new BasketVO();
	bvo.setBasketColor(basketColor);
	bvo.setBasketSize(basketSize);
	bvo.setBasketQuantity(Integer.parseInt(basketQuantity));
	bvo.setProdNo(Integer.parseInt(prodNo)); 
	// 장바구니 서비스 호출
	BasketService svc = new BasketServiceImpl();
	boolean result = svc.addBasket(bvo);
	
}
}
