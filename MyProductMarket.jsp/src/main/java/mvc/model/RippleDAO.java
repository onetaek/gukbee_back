package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.DBConnection;

public class RippleDAO {
	
	private static final RippleDAO rippleDAO = new RippleDAO();
	public static RippleDAO getInstance() {
		return rippleDAO;
	}
	private RippleDAO() {
	}
	
	
	public void insertRipple(RippleDTO ripple) {
		System.out.println("insertRipple실행");
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into ripple (boardName,boardNum,"
				+ "memberId,name,content,insertDate,ip)"
				+ " values(?,?,?,?,?,now(),?)";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,ripple.getBoardName());
			pstmt.setInt(2,ripple.getBoardNum());
			pstmt.setString(3, ripple.getMemberId());
			pstmt.setString(4,ripple.getName());
			pstmt.setString(5, ripple.getContent());
			pstmt.setString(6, ripple.getIp());
			pstmt.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public List<RippleDTO> getRippleList(String boardName, int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<RippleDTO> dtos = new ArrayList<>();
		String sql = "select * from ripple where boardName = ? and boardNum = ?";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,boardName);
			pstmt.setInt(2, num);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				RippleDTO dto = new RippleDTO(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getDate(7),
						rs.getString(8)
						);
				dtos.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dtos;
	}
	public void deleteRipple(RippleDTO ripple) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "delete from ripple where rippleId = ?";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,ripple.getRippleId());
			pstmt.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
