package co.yedam.service;

import java.util.List;

import co.yedam.vo.ProductVO;

public interface ProductService {
	
	List<ProductVO> productList(String prodCategory, String prodCategory2, int prodStar);
	
	List<ProductVO> productListPaging(String prodCategory, String prodCategory2, int page, int prodStar);
	
	int totalCount(int prodStar); // 페이징 계산용
	ProductVO getProduct(int prodNo);
}