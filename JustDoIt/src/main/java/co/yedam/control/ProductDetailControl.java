package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.service.ProductDetailService;
import co.yedam.service.ProductDetailServiceImpl;
import co.yedam.vo.ProductVO;

public class ProductDetailControl implements Control {
	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//key=value 처리위한 application/x-www-form-urlencode 방식.
		String prodNo = req.getParameter("prodNo");

		
		ProductDetailService svc = new ProductDetailServiceImpl();
		ProductVO productDetailInfo = svc.productDetailInfo(Integer.parseInt(prodNo));
		
		
		req.setAttribute("product", productDetailInfo);
		
		req.getRequestDispatcher("product/productDetailInfo.tiles").forward(req, resp);
	
	
		
	}
}
 
