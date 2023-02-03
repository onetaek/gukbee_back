package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class AuthFilter
 */

public class AuthFilter implements Filter {
//	private String encoding = null;
    /**
     * Default constructor. 
     */
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("AuthFilter clear....");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("AuthFilter doFilter......");
		String name = request.getParameter("name");//홈페이지에서 전송된 요청 파라미터를 전달.
		System.out.println("name = "+name);
		if(name == null || name.equals("")) {
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter printWriter = response.getWriter();
			String message = "입력된 name 값은 null입니다!!!!!";
			printWriter.println(message);
			return;
		}
//		if(request.getCharacterEncoding() == null) {
//			System.out.println("Encoding, 현재 encoding값: "+encoding);
//			request.setCharacterEncoding(encoding);
//		}
		chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("AuthFilter init.....");
//		this.encoding = fConfig.getServletContext().getInitParameter("encoding");
	}

}
