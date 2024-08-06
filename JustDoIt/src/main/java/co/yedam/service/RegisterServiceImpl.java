package co.yedam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.RegisterMapper;
import co.yedam.vo.MemberVO;

public class RegisterServiceImpl implements RegisterService {
	
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	RegisterMapper mapper = sqlSession.getMapper(RegisterMapper.class);
	
	@Override
	public boolean registerMember(MemberVO member) {
		return mapper.registerMember(member) == 1;
	}


}
