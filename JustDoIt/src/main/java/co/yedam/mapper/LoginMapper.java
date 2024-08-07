package co.yedam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.yedam.vo.MemberVO;

public interface LoginMapper {
	
	// 로그인체크.
	MemberVO selectMember(@Param("loginId") String id, @Param("loginPw") String pw);
	
}
