package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;


public class BoardController extends HttpServlet {
	static final int LISTCOUNT = 5;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html; charset-utf-8");
		request.setCharacterEncoding("utf-8");
		
		System.out.println(command);
		
		if(command.contains("/BoardListAction.do")) {
			requestBoardList(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
			rd.forward(request, response);
		}else if(command.contains("/BoardWriteForm.do")) {
			requestLoginName(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/writeForm.jsp");
			rd.forward(request, response);
		}else if(command.contains("/BoardWriteAction.do")) {
			requestBoardWrite(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/BoardListAction.do");
			rd.forward(request, response);
		}
	}

	


	private void requestBoardList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		
		int pageNum = 1;
		int limit = LISTCOUNT;
		
		if(request.getParameter("pageNum") != null) {
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		}
		
		String items = request.getParameter("item"); //검색 필드
		String text = request.getParameter("text"); // 검색어
		
		int total_record = dao.getListCount(items,text);
		boardlist = dao.getBoardList(pageNum,limit,items,text);
		
		int total_page;//전체페이지
		
		if(total_record % limit == 0) {//전체 게시물이 limit의 배수일 때
			total_page = total_record/limit;
			Math.floor(total_page);
		}else {
			total_page = total_record/limit;
			Math.floor(total_page);
			total_page = total_page + 1;
		}
		
		request.setAttribute("pageNum", pageNum);//페이지 번호.
		request.setAttribute("total_page",total_page);//전체 페이지 수.
		request.setAttribute("total_record", total_record);// 전체 게시물 수.
		request.setAttribute("boardlist", boardlist);//현재 페이지에 해당하는 목록데이터
	}
	
	
	private void requestLoginName(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		System.out.println("controller의 id: "+id);
		BoardDAO dao = BoardDAO.getInstance();
		String name = dao.getLoginNameById(id);
		System.out.println("name: "+name);
		request.setAttribute("name", name);
	}
	
	
	private void requestBoardWrite(HttpServletRequest request) {
		
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO board = new BoardDTO();
		board.setId(request.getParameter("id"));
		board.setName(request.getParameter("name"));
		board.setSubject(request.getParameter("subject"));
		board.setContent(request.getParameter("content"));
		
		board.setIp(request.getRemoteAddr());
		dao.insertBoard(board);
	}

}
