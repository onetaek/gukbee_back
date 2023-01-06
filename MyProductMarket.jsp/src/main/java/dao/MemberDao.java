package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Member;

public class MemberDao {
	ResultSet rs;
	Connection conn;
	PreparedStatement pstmt;

	public MemberDao() {
		String dbID = "root";
		String dbPassword = "7517";
		String dbURL = "jdbc:mariadb://localhost:3310/my_product_market";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			System.out.println("db connect successed!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("db connect failed");
		}
	}

	public int insertMember(Member dto) {
		int insertRowCount = 0;
		try {
			String sql = "insert into member values(?,?,?,?,?,?,?,?,now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getBirth());
			pstmt.setString(6, dto.getMail());
			pstmt.setString(7, dto.getMail());
			pstmt.setString(8, dto.getAddress());
			insertRowCount = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			System.out.println("insertMember 성공!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("insertMember 실패ㅠㅠ");
		}
		return insertRowCount;
	}

	public ArrayList<Member> getAllMember(){
		
		ArrayList<Member> dtos = new ArrayList<>();
		
		try {
			String sql = "select * from member";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member dto = new Member(
						rs.getString(1)
						, rs.getString(2)
						, rs.getString(3)
						, rs.getString(4)
						, rs.getString(5)
						, rs.getString(6)
						, rs.getString(7)
						, rs.getString(8)
						, rs.getString(9));
				
				dtos.add(dto);
			}
			if(pstmt !=null)
				pstmt.close();
			if(rs != null)
				rs.close();
			if(conn !=null)
				conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return dtos;
	}
}
