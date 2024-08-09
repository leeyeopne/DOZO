package co.yedam.service;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.WishlistMapper;
import co.yedam.vo.WishlistVO;

public class WishlistServiceImpl implements WishlistService {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	WishlistMapper mapper = sqlSession.getMapper(WishlistMapper.class);

	@Override
	public boolean addWishlist(int prodNo) {
		return mapper.addWishlist(prodNo) == 1;
	}
}
