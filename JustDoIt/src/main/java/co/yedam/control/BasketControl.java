package co.yedam.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.yedam.common.Control;
import co.yedam.service.BasketService;
import co.yedam.service.BasketServiceImpl;
import co.yedam.vo.BasketVO;

public class BasketControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 파라미터 읽기
		String productColor = req.getParameter("productColor");
		String productSize = req.getParameter("productSize");
		String productQuantity = req.getParameter("productQuantity");
		String prodNo = req.getParameter("prodNo");
		
        HttpSession session = req.getSession();
        Integer memberNo = (Integer) session.getAttribute("memberNo"); // 로그인 후 세션에 저장된 memberNo
		
		// 데이터 변환
		BasketVO bvo = new BasketVO();
		bvo.setProductColor(productColor);
		bvo.setProductSize(productSize);
		bvo.setProductQuantity(Integer.parseInt(productQuantity));
		bvo.setProdNo(Integer.parseInt(prodNo));
		bvo.setMemberNo(memberNo);

		// 장바구니 서비스 호출
		BasketService svc = new BasketServiceImpl();
		boolean result = svc.addBasket(bvo);


	}
}