package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
        HttpSession session = req.getSession();
        Integer memberNo = (Integer) session.getAttribute("memberNo"); // 로그인 후 세션에 저장된 memberNo
		
		// 데이터 변환
		BasketVO bvo = new BasketVO();
		bvo.setBasketColor(basketColor);
		bvo.setBasketSize(basketSize);
		bvo.setBasketQuantity(Integer.parseInt(basketQuantity));
		bvo.setProdNo(Integer.parseInt(prodNo));
		bvo.setMemberNo(memberNo);

		// 장바구니 서비스 호출
		BasketService svc = new BasketServiceImpl();
		boolean result = svc.addBasket(bvo);

		// 장바구니 목록을 가져와서 request에 설정
		List<BasketVO> basketList = svc.basketList(memberNo); // 장바구니 목록 가져오는 메서드 추가 필요
		
		
//        // 장바구니 목록의 총 가격 계산
//        double totalCartPrice = 0.0;
//        for (BasketVO basket : basketList) {
//            totalCartPrice += basket.getTotalPrice();
//        }
		
		
		req.setAttribute("basketList", basketList);

		req.getRequestDispatcher("product/basketForm.tiles").forward(req, resp);

	}
}