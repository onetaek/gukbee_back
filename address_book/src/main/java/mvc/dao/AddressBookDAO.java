package mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mvc.dto.AddressBookDTO;

public class AddressBookDAO {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String driver = "org.mariadb.jdbc.Driver";
	String url="jdbc:mariadb://localhost:3310/address_book";
	
	void connect() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"root","7517");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<AddressBookDTO> getDBList(){
		connect();
		ArrayList<AddressBookDTO> addressBookDtos = new ArrayList<>();
		String sql = "select * from address_book order by id desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				AddressBookDTO dto = new AddressBookDTO();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setComdept(rs.getString("comdept"));
				dto.setBirth(rs.getString("birth"));
				dto.setTel(rs.getString("tel"));
				dto.setMemo(rs.getString("memo"));
				addressBookDtos.add(dto);
			}
			disconnect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		return addressBookDtos; 
	}
	
	
	public boolean insertDB(AddressBookDTO dto) {
		connect();
		int count = 0;
		boolean flag = false;
		String sql = "insert into address_book "
				+ "(name, email, comdept, birth, tel, memo) values "
				+ "(?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getComdept());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getTel());
			pstmt.setString(6, dto.getMemo());
			count = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return count > 0;
	}
	
	
	public AddressBookDTO getDB(int id) {
		connect();
		AddressBookDTO dto = new AddressBookDTO();
		String sql = "select * from address_book where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setComdept(rs.getString("comdept"));
				dto.setBirth(rs.getString("birth"));
				dto.setTel(rs.getString("tel"));
				dto.setMemo(rs.getString("memo"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dto;
	}
	
	public boolean updateDB(AddressBookDTO dto) {
		System.out.println("updateDB메서드 실행");
		connect();
		int count = 0;
		String sql = "update address_book set name = ?, email = ?, "
				+ "comdept = ?, birth = ? , tel = ? , memo = ? where id = ?";
		try {
			System.out.println("111111111111");
			pstmt = conn.prepareStatement(sql);
			System.out.println("22222222222");
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getComdept());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getTel());
			pstmt.setString(6, dto.getMemo());
			pstmt.setInt(7, dto.getId());
			System.out.println("33333333333");
			count = pstmt.executeUpdate();
			System.out.println("4444444444444");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		System.out.println("count: "+count);
		return true;
	}
	
	
	public boolean deleteDB(int id) {
		connect();
		String sql = "delete from address_book where id = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public ArrayList<AddressBookDTO> getDBListBySearch(String catogory, String searchVal){
		connect();
		ArrayList<AddressBookDTO> dtos = new ArrayList<>();
		System.out.println("catogory: "+catogory);
		System.out.println("searchVal: "+searchVal);
		String sql = "select * from address_book where "+catogory+" like ?";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchVal + "%");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				AddressBookDTO dto = new AddressBookDTO();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setComdept(rs.getString("comdept"));
				dto.setBirth(rs.getString("birth"));
				dto.setTel(rs.getString("tel"));
				dto.setMemo(rs.getString("memo"));
				dtos.add(dto);
			}
			disconnect();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return dtos;
	}
	
	void disconnect() {
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
