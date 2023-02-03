package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Cart;
import mvc.model.OrderDAO;
import mvc.model.OrderDataDTO;
import t_dao.CartDAO;

@WebServlet("/order/*")
public class OrderController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String RequestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		
		System.out.println("command : " + command);
		
		if(command.contains("form.do")) {
			setOrderData(req);
			//상단에 장바구니 출력
			ArrayList<OrderDataDTO> datas = getOrderData(getOrderNo(req));
			req.setAttribute("datas", datas);
			req.getRequestDispatcher("/WEB-INF/order/form.jsp").forward(req, resp);
		}
	}

	private void setOrderData(HttpServletRequest req) {
		/* 장바구니에 있는 상품을 주문 데이터에 복사
		 * 결제 금액을 장바구니가 아니라 주문데이터 기준으로 계산
		 * */
		OrderDAO dao = OrderDAO.getInstance();
		//주문 번호 가져오기
		String orderNo = getOrderNo(req);
		
		//1. 중복을 막기 위해 주문 번호로 저장된 데이터 삭제
		dao.clearOrderData(orderNo);
		
		//2. 주문번호 기준을 장바구니에 있는 상품을 가지고 옴
		CartDAO cartDAO = new CartDAO();
		ArrayList<Cart> carts = cartDAO.getCartList(orderNo);
		System.out.println(carts);
		
		//3. CartList를 OrderData List를 변경
		ArrayList<OrderDataDTO> dtos = dao.changeCartData(carts,orderNo);
		System.out.println(dtos);
		
		//4. OrderData List를 데이터 베이스에 저장
		
	}
	
}
