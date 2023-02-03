package product.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import product.model.ProductService;


@WebServlet("/product/productController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService service;
	public ProductController() {
		service = new ProductService();
	}
     
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service 메소드 실행");
		String action = request.getParameter("action");
		String view = "";
		if(action == null) {
			System.out.println("action is null!!");
			getServletContext().getRequestDispatcher("/product/productController?action=list").forward(request, response);
		}else {
			switch(action) {
				case "list":
					view = list(request, response);break;
				case "info":
					view = info(request, response);break;
			}
			getServletContext().getRequestDispatcher("/product/"+view).forward(request, response);
		}
		
	}

	private String list(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("products", service.findAll());
		return "productList.jsp";
	}
	
	private String info(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("product", service.find(request.getParameter("id")));
		return "productInfo.jsp";
	}


}
