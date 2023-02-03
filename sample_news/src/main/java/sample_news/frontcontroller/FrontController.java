package sample_news.frontcontroller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample_news.View.View;
import sample_news.command.Command;
import sample_news.command.HelloCommand;
import sample_news.dao.NewsDAO;


@WebServlet("*.do")
@MultipartConfig(maxFileSize = 1024 * 1024 * 2, location = "c:/img")
public class FrontController extends HttpServlet{
	
	private NewsDAO dao;
	private ServletContext ctx;
	
	private final String START_PAGE = "ver01/newsList.jsp";
	
	private Map<String,Command> commandMap = new HashMap<>();
	
	public FrontController() {
		commandMap.put("/hello.nhn",new HelloCommand()); 
	}

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
        String uri = req.getRequestURI();
        String path = uri.substring(uri.lastIndexOf("/"));
		
		
		Command command = commandMap.get(path);
        if(command == null){
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
		
		View view = command.execute(req, resp);
		if(view != null) view.render(req, resp);
	}
	
	
}
