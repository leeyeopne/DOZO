package co.yedam.control;

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

public class indexControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String prodCategory = req.getParameter("prodCategory"); 
		String prodCategory2 = req.getParameter("prodCategory2"); 
		String prodStar = req.getParameter("prodStar"); 
		int pCnt = 12;
		ProductService svc = new ProductServiceImpl();
		
		String page = req.getParameter("page");
		page = page == null ? "1" : page;
		
		prodStar = prodStar == null ? "0" : prodStar;
		prodCategory = prodCategory == null || prodCategory == "" ? null : prodCategory;
		prodCategory2 = prodCategory2 == null || prodCategory2 == ""  ? null : prodCategory2;

		SearchDTO search = new SearchDTO();
		search.setProdStar(Integer.parseInt(prodStar));
		search.setProdCategory(prodCategory);
		search.setProdCategory2(prodCategory2);
		search.setPage(Integer.parseInt(page));
		
		int totalCnt = svc.totalCount(search);
		
		PageDTO pageDTO = new PageDTO(Integer.parseInt(page),totalCnt, pCnt );
		List<ProductVO> list = svc.productListPaging(search);
		System.out.println(list);
		
		req.setAttribute("page", pageDTO);
		req.setAttribute("productList", list);
		req.setAttribute("search", search);
		
		req.getRequestDispatcher("index/indexList.tiles").forward(req, resp); // 페이지 재지정
	}

}
