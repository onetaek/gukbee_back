package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Cart;
import dto.Product;
import t_dao.CartDAO;
import t_dao.ProductDAO;
                                   
@WebServlet(urlPatterns = {"/shop_db/addCart.jsp","/shop_db/cart.jsp"})
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html; charset-utf-8");
		request.setCharacterEncoding("utf-8");
		
		System.out.println("cart command = "+command);
		if(command.contains("addCart.jsp")){
			System.out.println("addCart.jsp 실행!");
			String productId = request.getParameter("id");
			if(productId == null || productId.trim().equals("")){
				response.sendRedirect("products.jsp");
				return;
			}
			ProductDAO productDAO = new ProductDAO();
			Product productDTO = productDAO.getProductById(productId);
			
			if(productDTO == null){
				response.sendRedirect("../error/execptionNoProductId.jsp");
			}
			HttpSession session = request.getSession();
			String orderNo = session.getId();//세션마다 붙은 키
			String memberId = (String)session.getAttribute("sessionId");
			
			CartDAO cartDAO = new CartDAO();
			
			boolean flag = cartDAO.updateCart(productDTO,orderNo,memberId);
			
			response.sendRedirect("product.jsp?id="+productId);
		}else if(command.contains("cart.jsp")) {
			HttpSession session = request.getSession();
			String cartId = session.getId();
			CartDAO cartDAO = new CartDAO();
			ArrayList<Cart> cartList = cartDAO.getAllCart(cartId);
			
			request.setAttribute("cartList", cartList);
			request.setAttribute("cartId", cartId);
			
			RequestDispatcher rd = request.getRequestDispatcher("./myCart.jsp");
			rd.forward(request, response);
		}
		
	}

}
