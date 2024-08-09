package co.yedam.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Control;
import co.yedam.common.PageDTO;
import co.yedam.common.SearchDTO;
import co.yedam.service.ProductService;
import co.yedam.service.ProductServiceImpl;
import co.yedam.vo.ProductVO;

public class ProductListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String prodCategory = req.getParameter("prodCategory"); 
		String prodCategory2 = req.getParameter("prodCategory2"); 
		String prodStar = req.getParameter("prodStar"); 
		
		String page = req.getParameter("page");
		page = page == null ? "1" : page;
		
		SearchDTO search = new SearchDTO();
		search.setPage(Integer.parseInt(page));
		//prodCategory = prodCategory == null ? "top" : prodCategory;
		//prodCategory2 = prodCategory2 == null ? "women" : prodCategory2;
		prodStar = prodStar == null ? "0" : prodStar;
		
		ProductService svc = new ProductServiceImpl();
		List<ProductVO> list = svc.productList(prodCategory, prodCategory2, Integer.parseInt(prodStar));
		
		
		
		
		req.setAttribute("productList", list);
		
		// paging
		int totalCnt = svc.totalCount();
		PageDTO pageDTO = new PageDTO(Integer.parseInt(page), totalCnt);
		req.setAttribute("paging", pageDTO);
		
		req.getRequestDispatcher("product/productList.tiles").forward(req, resp); // 페이지 재지정
	}

}
