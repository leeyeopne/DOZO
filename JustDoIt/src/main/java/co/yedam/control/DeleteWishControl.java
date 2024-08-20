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
import co.yedam.service.PageWishlistService;
import co.yedam.service.PageWishlistServiceImpl;

public class DeleteWishControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String wishNo = req.getParameter("wishNo");
		
		Map<String, Object> map = new HashMap<>();
		
		
		
		try {
            // 장바구니 항목 삭제
			PageWishlistService wvc = new PageWishlistServiceImpl();
            boolean result = wvc.removeWish(Integer.parseInt(wishNo));
			
            
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