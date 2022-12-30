package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			String dbID = "root";
		    String dbPassword = "dpdlvldzm419!";
		    String dbURL = "jdbc:mariadb://localhost:3306/ajax_db";
		    Class.forName("org.mariadb.jdbc.Driver");
		    conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		    System.out.println("연결성공");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("연결실패");
			e.printStackTrace();
		}
	}
	
	public ArrayList<User> search(String userName){
		String sql = "select * from user where userName like ?";
		ArrayList<User> userList = new ArrayList<User>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"%" + userName + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setUserName(rs.getString(1));
				user.setUserAge(rs.getInt(2));
				user.setUserGender(rs.getString(3));
				user.setUserEmail(rs.getString(4));
				userList.add(user);
			}
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return userList;
	}
	
	public int register(User user) {
		String sql = "insert into user values (?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserName());
			pstmt.setInt(2, user.getUserAge());
			pstmt.setString(3, user.getUserGender());
			pstmt.setString(4, user.getUserEmail());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;//데이터 베이스 오류
	}
	
}	
