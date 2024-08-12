package co.yedam.mapper;

import java.util.List;

import co.yedam.vo.BasketVO;

public interface BasketMapper {
	//SQL 쿼리: insertBasket 메서드가 SQL 쿼리를 실행하여 장바구니에 상품을 추가합니다.
	int insertBasket(BasketVO bvo);

//	List<BasketVO> selectList();

	List<BasketVO> selectBasket(int memberNo);

	int deleteBasket(int cartNo);

}