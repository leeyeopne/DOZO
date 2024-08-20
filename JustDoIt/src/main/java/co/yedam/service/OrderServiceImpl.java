package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.OrderMapper;
import co.yedam.vo.BasketVO;
import co.yedam.vo.OrdersVO;

public class OrderServiceImpl implements OrderService{
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);

	
	@Override
	public List<BasketVO> orderList(int memberNo) {
		// TODO Auto-generated method stub

		return mapper.selectOrder(memberNo);
	}


//	@Override
//	public boolean addOrders(OrdersVO orders) {
//		// TODO Auto-generated method stub
//		return mapper.insertOrders(orders)==1;
//	}

}
