package filter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LogFileFilter
 */
@WebFilter("/LogFileFilter")
public class LogFileFilter implements Filter {
	
	PrintWriter printWriter = null;
    /**
     * Default constructor. 
     */
    public LogFileFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		printWriter.close();
	}
	
	private String getCurrentTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		return dateFormat.format(calendar.getTime());
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		printWriter.println("현재일시: "+ getCurrentTime());
		String clientAddr = request.getRemoteAddr();//클라이언트의 주소를 출력
		printWriter.println("클라이언트 주소:"+clientAddr);
		
		chain.doFilter(request, response);
		
		String contentType = response.getContentType();
		printWriter.println("문서의 컨텐츠 유형:"+contentType);
		printWriter.println("--------------------");
	}

	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		String filename = fConfig.getInitParameter("filename");
		if(filename == null) {
			throw new ServletException("로그 파일의 이름을 찾을 수 없습니다.");
		}
		try {
			printWriter = new PrintWriter(new FileWriter(filename,true),true);
		}catch(IOException e) {
			throw new ServletException("로그 파일을 열 수 없습니다.");
		}
	}

}
