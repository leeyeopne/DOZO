package co.yedam.mapper;

import co.yedam.vo.WishlistVO;

public interface WishlistMapper {
	int addWishlist(WishlistVO wvo);
	
	boolean removeWish(int wishNo);
}

//
//public interface WishlistMapper {
//	int addWishlist(int prodNo);
//}
