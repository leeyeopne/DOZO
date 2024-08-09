package co.yedam.mapper;

import org.apache.ibatis.annotations.Param;

import co.yedam.vo.MemberVO;

public interface MemberMapper {
	
	// 회원가입
	int registerMember(MemberVO member);
	
	// 로그인 체크
	MemberVO selectMember(@Param("loginId") String id, @Param("loginPw") String pw);

	// 아이디 중복 검사
	int selectId(String id);
	
}
