package co.yedam.control;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import co.yedam.common.Control;
import co.yedam.service.MemberService;
import co.yedam.service.MemberServiceImpl;

public class IdCheckControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    resp.setContentType("application/json;charset=utf-8");
	
		String registerId = req.getParameter("registerId");
		
		MemberService memberService = new MemberServiceImpl();
        boolean isAvailable = memberService.selectId(registerId);
        
        Map<String, Object> result = new HashMap<>();
        if (isAvailable) {
            result.put("retCode", "Success");
            result.put("retVal", "ok");
        } else {
            result.put("retCode", "Fail");
            result.put("retVal", "duplicate");
        }
        
        Gson gson = new Gson();
        String jsonResult = gson.toJson(result);
        
        resp.getWriter().write(jsonResult);
	}

}
