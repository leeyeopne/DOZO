package co.yedam.service;

import java.util.List;

import co.yedam.vo.ProductVO;

public interface ProductDetailService {
	// 상품 상세 한 개
	ProductVO productDetailInfo(int prodNo);
	
	// 상세페이지 아래 상품 리스트들 나열된 곳
	List<ProductVO> productList();

	 
} 
