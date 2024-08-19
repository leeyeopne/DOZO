package co.yedam.service;

import java.util.List;

import co.yedam.common.SearchDTO;
import co.yedam.vo.StyleBookVO;

public interface StyleBookService {
	List<StyleBookVO> boardList(SearchDTO search);
	int totalCount(SearchDTO search); // 페이징 계산용 전체건수
	boolean addBoard(StyleBookVO board);
	boolean removeBoard(int boardNo);
	boolean updateBoard(StyleBookVO boardVO);
	StyleBookVO getBoard(int boardNo);
}
