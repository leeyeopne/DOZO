package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.ProductDetailMapper;
import co.yedam.vo.ProductVO;

public class ProductDetailServiceImpl implements ProductDetailService {
	
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	ProductDetailMapper mapper = sqlSession.getMapper(ProductDetailMapper.class);


// 상품 상세 한 개
	@Override
	public ProductVO productDetailInfo(int prodNo ) {
		// TODO Auto-generated method stub
		return mapper.productDetailInfo(prodNo);
	}


// 상세페이지 아래 상품 리스트들 나열된 곳
	@Override
	public List<ProductVO> productList() {
		// TODO Auto-generated method stub
		return mapper.selectList();
	}


}
