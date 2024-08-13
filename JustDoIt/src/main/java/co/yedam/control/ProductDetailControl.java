package co.yedam.control;

import java.io.IOException;
import java.util.List;

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
		// 상품 상세 한 개
		//key=value 처리위한 application/x-www-form-urlencode 방식.
		String prodNo = req.getParameter("prodNo");

		
		ProductDetailService svc = new ProductDetailServiceImpl();
		ProductVO productDetailInfo = svc.productDetailInfo(Integer.parseInt(prodNo));

		// 상세페이지 아래 상품 리스트들 나열된 곳
		List<ProductVO> list = svc.productList(); //서비스 - 메퍼 //쿼리 담고
        req.setAttribute("productList", list); //던졌다

		
		// 상품 상세 한 개
		req.setAttribute("product", productDetailInfo);
		
		req.getRequestDispatcher("product/productDetailInfo.tiles").forward(req, resp);
	
	
		
	}
}
 
