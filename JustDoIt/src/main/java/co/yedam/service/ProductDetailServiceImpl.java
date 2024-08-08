package co.yedam.service;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.ProductDetailMapper;
import co.yedam.vo.ProductVO;

public class ProductDetailServiceImpl implements ProductDetailService {
	
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	ProductDetailMapper mapper = sqlSession.getMapper(ProductDetailMapper.class);



	@Override
	public ProductVO productDetailInfo(int prodNo) {
		// TODO Auto-generated method stub
		return mapper.productDetailInfo(prodNo);
	}


}
