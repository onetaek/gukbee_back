package user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserSearchServlet")
public class UserSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String userName = request.getParameter("userName");
		response.getWriter().write(getJSON(userName));
	}
	
	public String getJSON(String userName) {
		if(userName == null) userName ="";
		StringBuffer result = new StringBuffer("");
		result.append("{\"result\":[");
		UserDAO userDAO = new UserDAO();
		ArrayList<User> userList = userDAO.search(userName);
		for(User user : userList) {
			result.append("[{\"value\": \"" + user.getUserName() + "\"},");
			result.append("{\"value\": \"" + user.getUserAge() + "\"},");
			result.append("{\"value\": \"" + user.getUserGender() + "\"},");
			result.append("{\"value\": \"" + user.getUserEmail() + "\"}],");
		}
		result.append("]}");
		return result.toString();
	}
	
}
