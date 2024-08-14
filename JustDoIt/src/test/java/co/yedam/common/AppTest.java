package co.yedam.common;


<<<<<<< HEAD
=======

import co.yedam.mapper.ProductMapper;
import co.yedam.vo.ProductVO;
>>>>>>> refs/heads/master
import co.yedam.mapper.WishlistMapper;
import co.yedam.vo.WishlistVO;
<<<<<<< HEAD
=======

>>>>>>> refs/heads/master

public class AppTest {

	public static void main(String[] args) {

		/*
		SqlSession sqlSession = DataSource.getInstance().openSession(true); // 자동 커밋.
		ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
		mapper.selectList().forEach(product -> {
			System.out.println(product);
		});
<<<<<<< HEAD
		 */

=======
		 * 
<<<<<<< HEAD
		 */ 
		SqlSession sqlSession = DataSource.getInstance().openSession(true); // 자동 커밋.
		ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
		ProductVO pvo = new ProductVO();
		pvo.setPage(1);
		pvo.setProdCategory("top");
		pvo.setProdCategory2("women");
		pvo.setProdStar(4);
		mapper.selectListPaging(pvo).forEach(product -> {
			System.out.println(product);
		});

		/*
		 * SqlSession sqlSession = DataSource.getInstance().openSession(true); // 자동 커밋.
		 * ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
		 * mapper.selectList("top", "women").forEach(product -> {
		 * System.out.println(product); });
		 */

>>>>>>> refs/heads/master

	}

}
		
		