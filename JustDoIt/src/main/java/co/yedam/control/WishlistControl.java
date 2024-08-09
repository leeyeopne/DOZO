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
import co.yedam.service.WishlistService;
import co.yedam.service.WishlistServiceImpl;
import co.yedam.vo.WishlistVO;

public class WishlistControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 파라미터 읽기
		String prodNo = req.getParameter("prodNo");

		// 위시 서비스 호출
		WishlistService wvc = new WishlistServiceImpl();

		Map<String, Object> map = new HashMap<>(); // 배열만들기

		try {
			if (wvc.addWishlist(Integer.parseInt(prodNo))) {
				map.put("result", "Success"); //{"retCode" : true, student_name : "홍길동"}
			} else {
				map.put("result", "Fail");
			}
		} catch (Exception e) {
			// 오류발생할때
			map.put("result", "Fail");
		}

		// 결과값을 요청한곳(js)으로 보낼때 json 방식으로 보낸다.
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(map);

		resp.getWriter().print(json);

	}

}
