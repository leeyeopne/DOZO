package co.yedam.mapper;

import java.util.List;

import co.yedam.vo.WishlistVO;

public interface PageWishlistMapper {
	List<WishlistVO> selectList(String loginId);
	boolean removeWish(int cartNo);
	int deleteWish(int wishNo);
}
