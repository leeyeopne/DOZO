package co.yedam.common;

import lombok.Data;

@Data
public class PageDTO {

    private int page; //현재페이지.
    private int startPage, endPage; //  << 1 2 3 4 5 6 7 .. 18
    private boolean prev, next;

    public PageDTO(int page, int totalCnt, int pCnt){
        // page: 3, totalCnt: 88 (18page가 마지막 페이지)
        this.page = page;
        this.endPage = (int) (Math.ceil(page / 10.0) * 10); // 2*10
        this.startPage = this.endPage - 9; // 

        int realEnd = (int)Math.ceil(totalCnt / (double)pCnt); // 실제건수 계산한 마지막 페이지.
        this.endPage = this.endPage > realEnd ? realEnd : this.endPage;

        this.prev = this.startPage > 1;
        this.next = this.endPage < realEnd;
        
    }//end of PageDTO

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
}//end of class
