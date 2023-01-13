package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dao.AddressBookDAO;
import mvc.dto.AddressBookDTO;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String action = request.getParameter("action");
		
		AddressBookDAO dao = new AddressBookDAO();
		AddressBookDTO dto = new AddressBookDTO();
		
		if(action.equals("list")) {//주소 페이지로 이동
			ArrayList<AddressBookDTO> datas = dao.getDBList();
			request.setAttribute("datas", datas);
			RequestDispatcher rd = request.getRequestDispatcher("address_book_list.jsp");
			rd.forward(request, response);
		}else if(action.equals("insert")) {//주소 삽입 처리
			dto.setName(request.getParameter("name"));
			dto.setEmail(request.getParameter("email"));
			dto.setTel(request.getParameter("tel"));
			dto.setBirth(request.getParameter("birth"));
			dto.setComdept(request.getParameter("comdept"));
			dto.setMemo(request.getParameter("memo"));
			if(dao.insertDB(dto)) {
				RequestDispatcher rd = request.getRequestDispatcher("address_book_control.do?action=list");
				rd.forward(request, response);				
			}else {
				try {
					throw new Exception("DB 입력오류");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		else if(action.equals("edit")){//비밀번호 확인하고 맞으면 수정 폼으로 이동
			if(!request.getParameter("passwd").equals("1234")){
				//out.println("<script>alert('비밀번호가 틀렸습니다!!');history.go(-1);</script>");
				String resStr = "<script>alert('비밀번호가 틀렸습니다!!');history.go(-1);</script>";
				response.getWriter().print(resStr);
			}else{
				dto = dao.getDB(Integer.parseInt(request.getParameter("id")));
				request.setAttribute("dto",dto);
				RequestDispatcher rd = request.getRequestDispatcher("address_book_edit_form.jsp");
				rd.forward(request, response);		
			}
		}
		else if(action.equals("update")){//수정 처리
			System.out.println("update진입!");
			dto.setId(Integer.parseInt(request.getParameter("id")));
			dto.setName(request.getParameter("name"));
			dto.setEmail(request.getParameter("email"));
			dto.setTel(request.getParameter("tel"));
			dto.setBirth(request.getParameter("birth"));
			dto.setComdept(request.getParameter("comdept"));
			dto.setMemo(request.getParameter("memo"));
			if(dao.updateDB(dto)) {
				RequestDispatcher rd = request.getRequestDispatcher("address_book_control.do?action=list");
				rd.forward(request, response);				
			}else {
				try {
					throw new Exception("DB 입력오류");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
		else if(action.equals("delete")){
			int id = Integer.parseInt(request.getParameter("id"));
			if(dao.deleteDB(id)) {
				RequestDispatcher rd = request.getRequestDispatcher("address_book_control.do?action=list");
				rd.forward(request, response);				
			}else {
				try {
					throw new Exception("DB 입력오류");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
		else if(action.equals("search")){
			String catogory = request.getParameter("catogory");
			String searchVal = request.getParameter("searchVal");
			ArrayList<AddressBookDTO> datas = dao.getDBListBySearch(catogory,searchVal);
			request.setAttribute("datas",datas);
			request.setAttribute("catogory",catogory);
			request.setAttribute("searchVal",searchVal);
			RequestDispatcher rd = request.getRequestDispatcher("address_book_list.do?action=list");
			rd.forward(request, response);		
		}else{
			String resStr = "<script>alert('action 파라미터를 확인해 주세요!!!')</script>";
			response.getWriter().print(resStr);
		}
		/*
		
		*/
		
		
		
		
		
		
		
		
		
	}
	
}
