package co.yedam.common;

import org.apache.ibatis.session.SqlSession;

import co.yedam.mapper.ProductMapper;

public class AppTest {

	public static void main(String[] args) {
		/*
		SqlSession sqlSession = DataSource.getInstance().openSession(true); // 자동 커밋.
		ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
		mapper.selectList().forEach(product -> {
			System.out.println(product);
		});
		 * 
		 */
		/*
		 * SqlSession sqlSession = DataSource.getInstance().openSession(true); // 자동 커밋.
		 * ProductMapper mapper = sqlSession.getMapper(ProductMapper.class);
		 * mapper.selectList("top", "women").forEach(product -> {
		 * System.out.println(product); });
		 */
	}

}