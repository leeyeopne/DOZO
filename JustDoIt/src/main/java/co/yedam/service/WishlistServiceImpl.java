package co.yedam.service;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.WishlistMapper;
import co.yedam.vo.WishlistVO;

public class WishlistServiceImpl {
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	WishlistMapper mapper = sqlSession.getMapper(WishlistMapper.class);

	
	boolean addWishlist(WishlistVO wishlist) {
		return mapper.addWishlist(wishlist);
	}
}
