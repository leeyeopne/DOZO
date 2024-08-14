package co.yedam.service;

import java.util.List;

import co.yedam.vo.BasketVO;

public interface OrderService {
	List<BasketVO> orderList(int memberNo);

}
