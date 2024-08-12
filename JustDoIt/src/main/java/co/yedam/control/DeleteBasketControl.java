package co.yedam.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.yedam.common.Control;
import co.yedam.service.BasketService;
import co.yedam.service.BasketServiceImpl;

public class DeleteBasketControl implements Control{

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cartNo = req.getParameter("cartNo");
		//String prodNo = req.getParameter("prodNo");
		
		//BasketVO bvo = new BasketVO();
		
		//bvo.setCartNo(Integer.parseInt(cartNo));
		
		//BasketService bvc = new BasketServiceImpl();
		Map<String, Object> map = new HashMap<>();
		
		
		
		try {
            // 장바구니 항목 삭제
            BasketService bvc = new BasketServiceImpl();
            boolean result = bvc.removeBasket(Integer.parseInt(cartNo));
			
            
            if(result) {
				map.put("retCode", "Success");

			} else {
				map.put("retCode", "Fail");
			}
            
		} 
			catch (Exception e){
				map.put("retCode", "Fail");
				e.printStackTrace();
			}
			
			// json문자열 생성.
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(map);
			
			resp.getWriter().print(json);
	}

}
