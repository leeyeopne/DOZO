package co.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;

public class ProductControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String prdName = req.getParameter("prdName");
//		System.out.println(prdName);
//		ProductService svc = new ProductServiceImpl();		
//		ProductVO product = svc.getProduct(prdName);
//
//		req.setAttribute("product", product);

		req.getRequestDispatcher("product/product.tiles").forward(req, resp); // 페이지 재지정
	}

}
