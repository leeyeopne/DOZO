package co.yedam.service;

import java.util.List;

import co.yedam.vo.BasketVO;

public interface BasketService {
	boolean addBasket(BasketVO basket);

	List<BasketVO> basketList(int memberNo);

	boolean removeBasket(int cartNo);

	
//	List<BasketVO> getBasketList();
//
//	BasketVO getBasket(int memeberNo);

}