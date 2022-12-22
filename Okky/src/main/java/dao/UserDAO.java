package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.UserDTO;

public class UserDAO {
	PreparedStatement pstmt;
	Connection conn;
	ResultSet rs;
	
	String dbURL = "jdbc:mariadb://loclahost:3306/oky";
	String dbID = "root";
	String dbPassword = "dpdlvldzm419!";
	
	public void getCon() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			System.out.println("연결이 완료되었습니다.");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void insertUser(UserDTO userDTO) {
		getCon();
		String sql = "insert into user (id,email,PASSWORD,NAME,nickName)"
				+ "VALUES (?,?,?,?,?);";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userDTO.getId());
			pstmt.setString(2, userDTO.getEmail());
			pstmt.setString(3, userDTO.getPassword());
			pstmt.setString(4, userDTO.getName());
			pstmt.setString(5, userDTO.getNickName());
			pstmt.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
