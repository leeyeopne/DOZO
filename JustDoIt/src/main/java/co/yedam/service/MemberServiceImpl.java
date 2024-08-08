package co.yedam.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import co.yedam.common.DataSource;
import co.yedam.mapper.MemberMapper;
import co.yedam.vo.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	SqlSession sqlSession = DataSource.getInstance().openSession(true);
	MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
	
	// 회원가입
	@Override
	public boolean registerMember(MemberVO member) {
		return mapper.registerMember(member) == 1;
	}
	
	// 로그인 기능
	@Override
	public MemberVO loginCheck(String id, String pw) {
		return mapper.selectMember(id, pw);
	}

	// 아이디 중복검사
	@Override
	public boolean selectId(String registerId) {
		return mapper.selectId(registerId) == 0;
	}
}
