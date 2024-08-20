package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.common.Control;
import co.yedam.service.OrderService;
import co.yedam.service.OrderServiceImpl;
import co.yedam.vo.BasketVO;

public class OrderFormControl implements Control {

    @Override
    public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           	// 현재 로그인한 회원의 번호를 세션에서 가져오기

    	        HttpSession session = req.getSession();
        Integer memberNo = (Integer) session.getAttribute("memberNo"); // 로그인 후 세션에 저장된 memberNo

    	
//    	String prodNo = req.getParameter("prodNo");
//		String productQuantity = req.getParameter("productQuantity");
//		String prodPrice = req.getParameter("prodPrice");
//    	
//
//        BasketVO bvo = new BasketVO();
//        bvo.setProdNo(Integer.parseInt(prodNo));
//        bvo.setProductQuantity(Integer.parseInt(productQuantity));
//        bvo.setProdPrice(Integer.parseInt(prodPrice));
//        
//        
//        
        // 오더 서비스 호출
        OrderService svc = new OrderServiceImpl();
        List<BasketVO> orderList = svc.orderList(memberNo);
       
        // 장바구니 목록을 request에 설정
        req.setAttribute("orderList", orderList);

        // 총 결제 금액 계산
        double cartTotal = 0;
        for (BasketVO basket : orderList) {
            cartTotal += basket.getProdPrice() * basket.getProductQuantity();
        }
     // 소수점 이하를 버리고 정수로 변환
       // cartTotal = Math.floor(cartTotal);
        int cartTotalInt = (int) cartTotal;
                req.setAttribute("cartTotal", cartTotalInt);

        // 주문 폼 페이지로 포워드
        req.getRequestDispatcher("product/orderForm.tiles").forward(req, resp);


    }
}

