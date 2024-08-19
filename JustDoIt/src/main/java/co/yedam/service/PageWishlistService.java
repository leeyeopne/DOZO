package co.yedam.service;

import java.util.List;

import co.yedam.vo.WishlistVO;

public interface PageWishlistService {
	List<WishlistVO> wishList(String loginId);
	boolean removeWish(int wishNo);
}
