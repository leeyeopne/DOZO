package co.yedam.mapper;

import java.util.List;

import co.yedam.vo.BasketVO;
import co.yedam.vo.OrdersVO;

public interface OrderMapper {
	//SQL 쿼리: insertBasket 메서드가 SQL 쿼리를 실행하여 장바구니에 상품을 추가합니다.


	List<BasketVO> selectOrder(int memberNo);

//	int insertOrders(OrdersVO orders);



}