package co.yedam.service;

import org.apache.ibatis.session.SqlSession;

import co.yedam.common.DataSource;
import co.yedam.mapper.LoginMapper;
import co.yedam.vo.MemberVO;

public class LoginServiceImpl implements LoginService {
	
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	LoginMapper mapper = sqlSession.getMapper(LoginMapper.class);
	
	@Override
	public MemberVO loginCheck(String id, String pw) {
		return mapper.selectMember(id, pw);
	}

}
