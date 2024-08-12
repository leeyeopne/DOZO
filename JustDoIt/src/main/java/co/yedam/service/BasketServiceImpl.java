package co.yedam.service;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.BasketMapper;
import co.yedam.vo.BasketVO;

public class BasketServiceImpl implements BasketService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	BasketMapper mapper = sqlSession.getMapper(BasketMapper.class);

	
	
	@Override
	public boolean addBasket(BasketVO basket) {
		// 장바구니에 추가: BasketMapper를 통해 데이터베이스에 장바구니에 상품을 추가하는 SQL 쿼리를 실행합니다.
		return mapper.insertBasket(basket)==1; // ==1 넣으면 true가 됨.
	}

}
