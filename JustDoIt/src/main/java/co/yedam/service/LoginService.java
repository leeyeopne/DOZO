package co.yedam.service;

import java.util.List;

import co.yedam.vo.MemberVO;

public interface LoginService {

	MemberVO loginCheck(String id, String pw);
	 
} 
