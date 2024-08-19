package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.PageWishlistMapper;
import co.yedam.vo.WishlistVO;

public class PageWishlistServiceImpl implements PageWishlistService{
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	PageWishlistMapper mapper = sqlSession.getMapper(PageWishlistMapper.class);
	
	
	
	@Override
	public List<WishlistVO> wishList(String loginId) {
		return mapper.selectList(loginId);
	}



	@Override
	public boolean removeWish(int wishNo) {
		// TODO Auto-generated method stub
		return mapper.deleteWish(wishNo)==1;
	}


}
