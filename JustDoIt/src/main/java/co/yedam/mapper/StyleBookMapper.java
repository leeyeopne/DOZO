package co.yedam.mapper;

import java.util.List;

import co.yedam.common.SearchDTO;
import co.yedam.vo.StyleBookVO;

public interface StyleBookMapper {
	List<StyleBookVO> selectList();

	List<StyleBookVO> selectListPaging(SearchDTO search); // 페이지 정보 -> 5건씩 출력
	
	// 페이징 계산하기 위한 전체건수
	int selectTotalCount(SearchDTO search);
	
	int insertBoard(StyleBookVO board);

	int updateBoard(StyleBookVO board);

	int deleteBoard(int boardNo);

	StyleBookVO selectBoard(int boardNo);
}
