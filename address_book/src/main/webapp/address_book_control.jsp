<%@page import="java.util.ArrayList"%>
<%@page import="mvc.dto.AddressBookDTO"%>
<%@page import="mvc.dao.AddressBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

String action = request.getParameter("action");

AddressBookDAO dao = new AddressBookDAO();
AddressBookDTO addressBookDTO = new AddressBookDTO();

if(action.equals("list")){
	ArrayList<AddressBookDTO> datas = dao.getDBList();
	request.setAttribute("datas",datas);
	pageContext.forward("address_book_list.jsp");
}
else if(action.equals("insert")){
	addressBookDTO.setName(request.getParameter("name"));
	addressBookDTO.setEmail(request.getParameter("email"));
	addressBookDTO.setTel(request.getParameter("tel"));
	addressBookDTO.setBirth(request.getParameter("birth"));
	addressBookDTO.setComdept(request.getParameter("comdept"));
	addressBookDTO.setMemo(request.getParameter("memo"));
	if(dao.insertDB(addressBookDTO)){
		response.sendRedirect("address_book_control.jsp?action=list");
	}else{
		throw new Exception("DB 입력오류");
	}
	
}else if(action.equals("edit")){
	if(!request.getParameter("passwd").equals("1234")){
		out.println("<script>alert('비밀번호가 틀렸습니다!!');history.go(-1);</script>");
	}else{
		AddressBookDTO dto = dao.getDB(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("dto",dto);
		pageContext.forward("address_book_edit_form.jsp");
	}
}else if(action.equals("update")){
	System.out.println("update진입!");
	addressBookDTO.setId(Integer.parseInt(request.getParameter("id")));
	addressBookDTO.setName(request.getParameter("name"));
	addressBookDTO.setEmail(request.getParameter("email"));
	addressBookDTO.setTel(request.getParameter("tel"));
	addressBookDTO.setBirth(request.getParameter("birth"));
	addressBookDTO.setComdept(request.getParameter("comdept"));
	addressBookDTO.setMemo(request.getParameter("memo"));
	if(dao.updateDB(addressBookDTO)){
		response.sendRedirect("address_book_control.jsp?action=list");
	}else{
		throw new Exception("DB 갱신오류");
	}
}else if(action.equals("delete")){
	int id = Integer.parseInt(request.getParameter("id"));
	if(dao.deleteDB(id)){
		response.sendRedirect("address_book_control.jsp?action=list");
	}else{
		throw new Exception("DB 삭제 오류");
	}
}else if(action.equals("search")){
	String catogory = request.getParameter("catogory");
	String searchVal = request.getParameter("searchVal");
	ArrayList<AddressBookDTO> datas = dao.getDBListBySearch(catogory,searchVal);
	request.setAttribute("datas",datas);
	request.setAttribute("catogory",catogory);
	request.setAttribute("searchVal",searchVal);
	pageContext.forward("address_book_list.jsp");
}else{
	out.println("<script>alert('action 파라미터를 확인해 주세요!!!')</script>");
}

%>
