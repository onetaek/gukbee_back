package mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItem;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;
import mvc.model.RippleDAO;
import mvc.model.RippleDTO;

public class BoardController extends HttpServlet {
	static final int LISTCOUNT = 5;
	private String boardName = "board";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());

		response.setContentType("text/html; charset-utf-8");
		request.setCharacterEncoding("utf-8");

		System.out.println(command);

		if (command.contains("/BoardListAction.do")) {
			requestBoardList(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
			rd.forward(request, response);
		} else if (command.contains("/BoardWriteForm.do")) {

			// requestLoginName(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/writeForm.jsp");
			rd.forward(request, response);
		} else if (command.contains("/BoardWriteAction.do")) {
			try {
				requestBoardWrite(request);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("BoardWriteAction.do Error");
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("/board/BoardListAction.do");
			rd.forward(request, response);
		} else if (command.contains("BoardViewAction.do")) {
			requestBoardView(request);
			RequestRippleList(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/BoardView.do");
			rd.forward(request, response);
		} else if (command.contains("/BoardView.do")) {
			RequestDispatcher rd = request.getRequestDispatcher("/board/view.jsp");
			rd.forward(request, response);
		} else if (command.contains("/BoardUpdateView.do")) {
			requestBoardUpdateView(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/updateView.jsp");
			rd.forward(request, response);
		} else if (command.contains("/BoardUpdateAction.do")) {
			requestBoardUpdate(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/BoardListAction.do");
			rd.forward(request, response);
		} else if (command.contains("/BoardDeleteAction.do")) {
			requestBoardDelete(request);
			RequestDispatcher rd = request.getRequestDispatcher("/board/BoardListAction.do");
			rd.forward(request, response);
		}
		else if (command.contains("/GalleryRippleWriteAction.do")) {
			System.out.println("GalleryRippleWriteAction.do실행!!!!");
			requestRippleWrite(request);
			String num = request.getParameter("num");
			String pageNum = request.getParameter("pageNum");
			System.out.println("num: " + num);
			System.out.println("pageNum: " + pageNum);
			
			response.sendRedirect("./BoardViewAction.do?num=" + num + "&pageNum=" + pageNum);
		}else if (command.contains("/GalleryRippleDeleteAction.do")) {
			requestGalleryBoardRippleDelete(request);
			String num = request.getParameter("num");
			String pageNum = request.getParameter("pageNum");
			response.sendRedirect("./BoardViewAction.do?num=" + num + "&pageNum=" + pageNum);
		}
		
		

	}
	//댓글 목록 가져오기
	private void RequestRippleList(HttpServletRequest request) {
		RippleDAO dao = RippleDAO.getInstance();
		List<RippleDTO> rippleList = new ArrayList<>();
		int num = Integer.parseInt(request.getParameter("num"));
	
		rippleList = dao.getRippleList(this.boardName,num);
		request.setAttribute("rippleList", rippleList);
		
	}
	//댓글 삭제
	private void requestGalleryBoardRippleDelete(HttpServletRequest request) {
		int rippleId = Integer.parseInt(request.getParameter("rippleId"));
		System.out.println("삭제할꺼임!");
		RippleDAO dao = RippleDAO.getInstance();
		RippleDTO ripple = new RippleDTO();
		ripple.setRippleId(rippleId);
		dao.deleteRipple(ripple);
	}
	
	
	// 댓글 작성
	private void requestRippleWrite(HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));

		String name = request.getParameter("name");
		String content = request.getParameter("content");

		HttpSession session = request.getSession();
		RippleDTO ripple = new RippleDTO();
		ripple.setBoardName(this.boardName);
		ripple.setBoardNum(num);
		ripple.setMemberId((String) session.getAttribute("sessionId"));
		ripple.setName(name);
		ripple.setContent(content);
		ripple.setIp(request.getRemoteAddr());

		RippleDAO dao = RippleDAO.getInstance();
		dao.insertRipple(ripple);

	}

	private void requestBoardList(HttpServletRequest request) {
		// TODO Auto-generated method stub
		BoardDAO dao = BoardDAO.getInstance();
		List<BoardDTO> boardlist = new ArrayList<BoardDTO>();

		int pageNum = 1;
		int limit = LISTCOUNT;

		if (request.getParameter("pageNum") != null) {
			pageNum = Integer.parseInt(request.getParameter("pageNum"));
		}

		String items = request.getParameter("items"); // 검색 필드
		String text = request.getParameter("text"); // 검색어

		int total_record = dao.getListCount(items, text);
		System.out.println("total_record!!!!" + total_record);
		boardlist = dao.getBoardList(pageNum, limit, items, text);

		int total_page;// 전체페이지

		if (total_record % limit == 0) {// 전체 게시물이 limit의 배수일 때
			total_page = total_record / limit;
			Math.floor(total_page);
		} else {
			total_page = total_record / limit;
			Math.floor(total_page);
			total_page = total_page + 1;
		}

		request.setAttribute("limit", limit);
		request.setAttribute("pageNum", pageNum);// 페이지 번호.
		request.setAttribute("total_page", total_page);// 전체 페이지 수.
		request.setAttribute("total_record", total_record);// 전체 게시물 수.
		request.setAttribute("boardlist", boardlist);// 현재 페이지에 해당하는 목록데이터
	}

//	private void requestLoginName(HttpServletRequest request) {
//		// TODO Auto-generated method stub
//		String id = request.getParameter("id");
//		System.out.println("controller의 id: "+id);
//		BoardDAO dao = BoardDAO.getInstance();
//		String name = dao.getLoginNameById(id);
//		System.out.println("name: "+name);
//		request.setAttribute("name", name);
//	}
//	

	private void requestBoardWrite(HttpServletRequest request) throws Exception {
		System.out.println("requestBoardWrite 메서드 진입");
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO board = new BoardDTO();
		System.out.println("requestBoardWrite메서드에서 받은 Id: "+request.getParameter("id"));
		String sessionId = (String)request.getSession().getAttribute("sessionId");
		System.out.println("sessionId: "+sessionId);
		board.setId(sessionId);
		board.setIp(request.getRemoteAddr());
		
		String path = "C:\\upload";

		// 파일 업로드를 위해 DiskFileUpload 클래스를 생성.
		DiskFileUpload upload = new DiskFileUpload();

		// 업로드할 파일의 최대 크기, 메모리상에 저장할 최대 크기, 업로드된 파일을 임시로 저장할 경로를 작성.
		upload.setSizeMax(1000000);
		upload.setSizeThreshold(4096);
		upload.setRepositoryPath(path); 

		// 폼 페이지에서 전송된 요청 파라미터를 전달받도록 DiskFileUpload 객체 타입의 parseRequest() 메서드를 작성.
		List items = upload.parseRequest(request);

		// 폼 페이지에서 전송된 요청 파라미터를 Iterator 클래스로 변환.
		Iterator params = items.iterator();

		while (params.hasNext()) { // 폼 페이지에서 전송된 요청 파라미터가 없을 때까지 반복하도록 Iterator 객체 타입의 hasNext() 메서드를 작성.
			// 폼 페이지에서 전송된 요청 파라미터의 이름을 가져오도록 Iterator 객체 타입의 next() 메서드를 작성.
			FileItem item = (FileItem) params.next();

			if (item.isFormField()) {
				// 폼 페이지에서 전송된 요청 파라미터가 일반 데이터이면 요청 파라미터의 이름과 값을 출력.
				String name = item.getFieldName();
				String value = item.getString("utf-8");
				switch(name) {
				case "name":
					board.setName(request.getParameter("name"));
				case "subject":
					board.setSubject(request.getParameter("subject"));
				case "content":
					board.setContent(request.getParameter("content"));
				}
				System.out.println(name + "=" + value);
			}
			else {
				// 폼 페이지에서 전송된 요청 파라미터가 파일이면
				// 요청 파라미터의 이름, 저장 파일의 이름, 파일 컨텐트 유형, 파일 크기에 대한 정보를 출력.
				String fileFieldName  = item.getFieldName();				
				String fileName = item.getName();
				String contentType = item.getContentType();
				
				if(!fileName.isEmpty()) {
					System.out.println("파일 이름 : "+fileName);
					fileName = fileName.substring(fileName.lastIndexOf("\\") + 1);
					long fileSize = item.getSize();
					
					File file = new File(path + "/" + fileName);
					item.write(file);
					
					board.setFilename(fileName);
					board.setFilesize(fileSize);
				}		
			}
		}
		 
		
		dao.insertBoard(board);
	}

	private void requestBoardView(HttpServletRequest request) {
		// TODO Auto-generated method stub
		BoardDAO dao = BoardDAO.getInstance();
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));

		BoardDTO board = dao.getBoardByNum(num);
		System.out.println("board: " + board.getRegistDay());
		request.setAttribute("num", num);
		request.setAttribute("page", pageNum);
		request.setAttribute("board", board);
	}

	private void requestBoardUpdateView(HttpServletRequest request) {
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));

		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO board = dao.getBoardByNum(num);

		request.setAttribute("num", num);
		request.setAttribute("page", pageNum);
		request.setAttribute("board", board);
	}

	private void requestBoardUpdate(HttpServletRequest request) {
		BoardDAO dao = BoardDAO.getInstance();
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");

		dao.boardUpdate(num, name, subject, content);

		request.setAttribute("num", num);
		request.setAttribute("page", pageNum);
	}

	private void requestBoardDelete(HttpServletRequest request) {
		// TODO Auto-generated method stub
		BoardDAO dao = BoardDAO.getInstance();
		int num = Integer.parseInt(request.getParameter("num"));
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));

		dao.boardDelete(num);

		request.setAttribute("num", num);
		request.setAttribute("page", pageNum);
	}

}
