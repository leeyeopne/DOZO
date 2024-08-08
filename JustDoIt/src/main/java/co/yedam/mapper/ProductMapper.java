package co.yedam.mapper;

import java.util.List;

import co.yedam.vo.ProductVO;

public interface ProductMapper {
	List<ProductVO> selectList();
//	ProductVO selectProduct(String prodName);
}

