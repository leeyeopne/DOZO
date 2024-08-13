package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.common.SearchDTO;
import co.yedam.mapper.ProductMapper;
import co.yedam.vo.ProductVO;

public class ProductServiceImpl implements ProductService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
	

	@Override
	public List<ProductVO> productList(String prodCategory, String prodCategory2, int prodStar) {
		return mapper.selectList(prodCategory, prodCategory2, prodStar);
	}


	@Override
	public ProductVO getProduct(int prodNo) {
		return mapper.selectProduct(prodNo);
	}

	@Override
	public int totalCount(SearchDTO search) {
		return mapper.selectTotalCount(search);
	}


	@Override
	public List<ProductVO> productListPaging(SearchDTO search) {
		return mapper.selectListPaging(search);
	}




	
}
