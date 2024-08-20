package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import co.yedam.common.Control;
import co.yedam.service.OrderService;
import co.yedam.service.OrderServiceImpl;
import co.yedam.vo.BasketVO;


public class OrderControl implements Control {
    
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
        HttpSession session = req.getSession();
Integer memberNo = (Integer) session.getAttribute("memberNo"); // 로그인 후 세션에 저장된 memberNo

		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");

		
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		String Country = req.getParameter("Country");
		String Town = req.getParameter("Town");
		String Address = req.getParameter("Address");
		String Postcode = req.getParameter("Postcode");
		String Phone = req.getParameter("Phone");
		String Email = req.getParameter("Email");
		String note = req.getParameter("note");
		String prodName = req.getParameter("prodName");
		String prodPrice = req.getParameter("prodPrice");
		String cartTotal = req.getParameter("cartTotal");
		

		
		req.setAttribute("firstName", firstName);
		req.setAttribute("lastName", lastName);
		req.setAttribute("Country", Country);
		req.setAttribute("Town", Town);
		req.setAttribute("Address", Address);
		req.setAttribute("Postcode", Postcode);
		req.setAttribute("Phone", Phone);
		req.setAttribute("Email", Email);
		req.setAttribute("note", note);
		req.setAttribute("prodName", prodName);
		req.setAttribute("prodPrice", prodPrice);
		req.setAttribute("cartTotal", cartTotal);
		
		
        // 오더 서비스 호출
        OrderService svc = new OrderServiceImpl();
        List<BasketVO> orderList = svc.orderList(memberNo);
       
        // 장바구니 목록을 request에 설정
        req.setAttribute("orderList", orderList);
		
		
		
		// JSON 변환
		Gson gson = new Gson();
		String jsonOrderList = gson.toJson(orderList);
		
		req.setAttribute("jsonOrderList", jsonOrderList);

		
		
		
		req.getRequestDispatcher("product/paymentForm.tiles").forward(req, resp);
		
		
		
//		// 요청 파라미터 읽기
//		String orderQuantity = req.getParameter("orderQuantity");
//		String orderPrice = req.getParameter("orderPrice");
//		String receiver = req.getParameter("receiver");
//		String address = req.getParameter("address");
//		String orderOption = req.getParameter("orderOption");
//		String orderPhone = req.getParameter("orderPhone");
//		String orderStatus = req.getParameter("orderStatus");
//		
//        HttpSession session = req.getSession();
//        Integer memberNo = (Integer) session.getAttribute("memberNo"); // 로그인 후 세션에 저장된 memberNo
//		
//		// 데이터 변환
//		OrdersVO ovo = new OrdersVO();
//
//		ovo.setOrderQuantity(Integer.parseInt(orderQuantity));
//		ovo.setOrderPrice(Integer.parseInt(orderPrice));
//
//		ovo.setMemberNo(memberNo);
//		ovo.setReceiver(receiver);
//		ovo.setAddress(address);
//		ovo.setOrderOption(orderOption);
//		ovo.setOrderPhone(orderPhone);
//		ovo.setOrderStatus(orderStatus);
//		// 장바구니 서비스 호출
//		OrderService ovc = new OrderServiceImpl();
//		boolean result = ovc.addOrders(ovo);
//
//		Map<String, Object> map = new HashMap<>();
//		try {
//			if(result) {
//				map.put("result", "Success");
//			}
//		} catch (Exception e) {
//			map.put("result", "Fail");
//		}
//		// json문자열 생성.
//		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
//		String json = gson.toJson(map);
//		
//		resp.getWriter().print(json);

	}
}