package co.yedam.service;

import java.util.List;

import co.yedam.vo.BasketVO;
import co.yedam.vo.OrdersVO;

public interface OrderService {
	List<BasketVO> orderList(int memberNo);

//	boolean addOrders(OrdersVO orders);
	
}
