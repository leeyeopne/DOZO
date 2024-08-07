package co.yedam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.yedam.vo.MemberVO;

public interface RegisterMapper {
	
	int registerMember(MemberVO member);
	
	// 아이디 검사
	MemberVO idCheck(@Param("loginId") String id);
}
