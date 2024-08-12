package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.BasketMapper;
import co.yedam.vo.BasketVO;

public class BasketServiceImpl implements BasketService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	BasketMapper mapper = sqlSession.getMapper(BasketMapper.class);

	
	
	@Override
	public boolean addBasket(BasketVO basket) {
		return mapper.insertBasket(basket)==1; // ==1 넣으면 true가 됨.
	}



	@Override
	public List<BasketVO> basketList(int memberNo) {
		// TODO Auto-generated method stub
		return mapper.selectBasket(memberNo);
	}



	@Override
	public boolean removeBasket(int cartNo) {
		// TODO Auto-generated method stub
		return mapper.deleteBasket(cartNo)==1;
	}

}
