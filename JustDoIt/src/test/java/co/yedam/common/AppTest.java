package co.yedam.common;

import org.apache.ibatis.session.SqlSession;

import co.yedam.mapper.WishlistMapper;
import co.yedam.vo.WishlistVO;

public class AppTest {

	public static void main(String[] args) {
//		SqlSession sqlSession = DataSource.getInstance().openSession(true); // 자동 커밋.
//		ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
//		mapper.selectList().forEach(product -> {
//			System.out.println(product);
//		});
//		
//
//		SqlSession sqlSession = //
//				DataSource.getInstance().openSession(true); // 자동으로 커밋하려고 true 넣음.
//		WishlistMapper mapper = sqlSession.getMapper(WishlistMapper.class);
//
//		WishlistVO brd = new WishlistVO();
//		brd.setWishQuantity(1);
//		brd.setWishColor("조건이");
//		brd.setWishSize("2");
//
//		if (mapper.addWishlist(brd) == 1) {
//			System.out.println("OK");
//		}
	}

}