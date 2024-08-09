package co.yedam.service;

import co.yedam.vo.MemberVO;

public interface MemberService {
	
	MemberVO loginCheck(String id, String pw);
	
	boolean registerMember(MemberVO member);
	
	boolean selectId(String id);

}
