package co.yedam.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.common.PageDTO;
import co.yedam.service.ProductService;
import co.yedam.service.ProductServiceImpl;
import co.yedam.vo.ProductVO;

public class ProductListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String prodCategory = req.getParameter("prodCategory"); 
		String prodCategory2 = req.getParameter("prodCategory2"); 
		String prodStar = req.getParameter("prodStar"); 
		
		ProductService svc = new ProductServiceImpl();
		
		String page = req.getParameter("page");
		page = page == null ? "1" : page;
		
		int totalCnt = svc.totalCount(Integer.parseInt(prodStar));
		
		PageDTO pageDTO = new PageDTO(Integer.parseInt(page),totalCnt );
		
		
		//prodCategory = prodCategory == null ? "top" : prodCategory;
		//prodCategory2 = prodCategory2 == null ? "women" : prodCategory2;
		prodStar = prodStar == null ? "0" : prodStar;
		
		//List<ProductVO> list = svc.productList(prodCategory, prodCategory2, Integer.parseInt(prodStar));
		List<ProductVO> list = svc.productListPaging(prodCategory, prodCategory2, Integer.parseInt(page), Integer.parseInt(prodStar));
		
		req.setAttribute("page", pageDTO);
		req.setAttribute("productList", list);
		
		req.getRequestDispatcher("product/productList.tiles").forward(req, resp); // 페이지 재지정
	}

}
