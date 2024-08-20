package co.yedam.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.yedam.common.Control;
import co.yedam.service.BasketService;
import co.yedam.service.BasketServiceImpl;
import co.yedam.vo.BasketVO;

public class BasketFormControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // 현재 로그인한 회원의 번호를 세션에서 가져오기
        HttpSession session = req.getSession();

        Integer memberNo = (Integer) session.getAttribute("memberNo"); // 로그인 후 세션에 저장된 memberNo

        // 장바구니 서비스 호출
        BasketService svc = new BasketServiceImpl();
        List<BasketVO> basketList = svc.basketList(memberNo);

        // 장바구니 목록을 request에 설정
        req.setAttribute("basketList", basketList);

		req.getRequestDispatcher("product/basketForm.tiles").forward(req, resp);
	}

}