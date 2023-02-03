package sample_news.frontcontroller;

import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.beanutils.BeanUtils;

import sample_news.View.View;
import sample_news.command.Command;
import sample_news.dao.NewsDAO;
import sample_news.dto.NewsDTO;

@WebServlet("*.nhn")
@MultipartConfig(maxFileSize = 1024 * 1024 * 2, location = "C:\\img")
public class NewsFrontController extends HttpServlet{
	private NewsDAO dao;
	private ServletContext ctx;
	
	private final String START_PAGE = "ver01/newsList.jsp";
	
	public void init(ServletConfig config) throws ServletException {
		/* init() 메서드에서 초기화 진행 */
		super.init(config);
		dao = new NewsDAO();
		ctx = getServletContext();
	}
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
        String action = req.getParameter("action");
       
        dao = new NewsDAO();
        
        Method m;
        String view = null;        
       
        //핸들러 어댑터 기능
        if(action == null) {
        	action = "listNews";
        }
        try {
			m = this.getClass().getMethod(action, HttpServletRequest.class);
			view = (String) m.invoke(this, req);
		} catch (NoSuchMethodException e) {
			// TODO: handle exception
			e.printStackTrace();
			ctx.log("요청 action 없음!!");
			req.setAttribute("error", "action 파라미터가 잘못되었습니다.");
			view = START_PAGE;
		}catch(Exception e) {
			e.printStackTrace();
		}
        
        //View리졸버
        System.out.println("???"+view.startsWith("redirect:/"));
        if(view.startsWith("redirect:/")) {
        	String rview = view.substring("redirect:/".length());
        	resp.sendRedirect(rview);
        }else {
        	RequestDispatcher dispatcher = req.getRequestDispatcher(view);
        	dispatcher.forward(req, resp);//지정된 뷰로 포워딩.
        }
        
        
	}
	
	private String getFilname(Part part) {
		String fileName = null;
		String header = part.getHeader("content-disposition");
		System.out.println("header: "+header);
		ctx.log(" File Header : "+header);
		
		int start = header.indexOf("filename=");
		fileName = header.substring(start + 10, header.length() - 1);
		ctx.log("파일명: "+fileName);
		return fileName;
	}
	
	
	public String addNews(HttpServletRequest request) {//뉴스 기사 등록
		NewsDTO news = new NewsDTO();
		try {
			Part part = request.getPart("file");//이미지 파일 저장을 위해 request로 부터 Part객체 참조
			String fileName = getFilname(part);
			System.out.println("fileName!!!!!!!"+fileName);
			if(fileName != null && !fileName.isEmpty()) {
				System.out.println("fileName?????"+fileName);
				part.write(fileName);
			}
			BeanUtils.populate(news, request.getParameterMap());
			news.setImg("/img/"+fileName);
			dao.addNews(news);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ctx.log("뉴스 추가 과정에서 문제 발생!!");
			request.setAttribute("error", "뉴스가 정상적으로 등록되지 않았습니다!!");
			return listNews(request);
		}
		return "redirect:/news.nhn?action=listNews";
	}
	
	public String listNews(HttpServletRequest request) {
		List<NewsDTO> list;
		try {
			list = dao.getAll();
			for(NewsDTO news : list) {
				System.out.println(news);
			}
			request.setAttribute("newslist", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ctx.log("뉴스 목록 생성 과정에서 문제 발생!!");
			request.setAttribute("error", "뉴스 목록이 정상적으로 처리되지 않았습니다!!");
		}
		return "./newsList.jsp";
	}
	
	public String getNews(HttpServletRequest request) {
		int aid = Integer.parseInt(request.getParameter("aid"));
		try {
			NewsDTO n = dao.getNews(aid);
			System.out.println("News한개!!!!!!!!");
			System.out.println(n);
			request.setAttribute("news", n);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			ctx.log("뉴스를 가져오는 과정에서 문제 발생!!");
			request.setAttribute("error", "뉴스를 정상적으로 가져오지 못했습니다!!");
		}
		return "./newsView.jsp";
	}
	
	public String deleteNews(HttpServletRequest req) {
		int aid = Integer.parseInt(req.getParameter("aid"));
		try {
			dao.delNews(aid);
		} catch (SQLException e) {
			e.printStackTrace();
			ctx.log("뉴스 목록 생성 과정에서 문제 발생");
			req.setAttribute("error", "뉴스를 정상적으로 삭제하지 못했습니다.");
			return listNews(req);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return "redirect:/news.nhn?action=listNews";
	} //deleteNews end
	
	
	
	
}
