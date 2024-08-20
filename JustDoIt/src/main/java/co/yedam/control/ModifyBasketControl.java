package co.yedam.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
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

public class ModifyBasketControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String productQuantity = req.getParameter("productQuantity");
	    String cartNo = req.getParameter("cartNo");
	    String prodNo = req.getParameter("prodNo");
		// 현재 로그인한 회원의 번호를 세션에서 가져오기
		HttpSession session = req.getSession();

		Integer memberNo = (Integer) session.getAttribute("memberNo"); // 로그인 후 세션에 저장된 memberNo

		// 서비스 객체를 통해 장바구니 품목 수량 업데이트
	    BasketService basketService = new BasketServiceImpl();
	    BasketVO basketVO = new BasketVO();
	    basketVO.setCartNo(Integer.parseInt(cartNo));
	    basketVO.setProdNo(Integer.parseInt(prodNo));
	    basketVO.setMemberNo(memberNo);
	    basketVO.setProductQuantity(Integer.parseInt(productQuantity));
        // 장바구니 서비스 호출
	    boolean result = basketService.modifyBasket(basketVO);

	    Map<String, String> map = new HashMap<>();
	    if (result) {
	        map.put("result", "Success");
	    } else {
	        map.put("result", "Failure");
	    }

	    Gson gson = new GsonBuilder().create();
	    String json = gson.toJson(map);

	    resp.setContentType("application/json");
	    resp.setCharacterEncoding("UTF-8");
	    resp.getWriter().write(json);
	}
	}
