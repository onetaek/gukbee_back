package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.DBConnection;
import dto.Cart;

public class OrderDAO {
	private static OrderDAO instance;

	private OrderDAO() {
	}

	public static OrderDAO getInstance() {
		if (instance == null)
			instance = new OrderDAO();
		return instance;
	}

	public void clearOrderData(String orderNo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "delete from order_data where orderNo = ?";
		try {
			conn = DBConnection.getConnection();
			pstmt.setString(1, orderNo);
			pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();	
		}catch(Exception e) {
			System.out.println("clearOrderData() 에러 : "+ e);
		}
		
	}

	public ArrayList<OrderDataDTO> changeCartData(ArrayList<Cart> carts, String orderNo) {
		ArrayList<OrderDataDTO> datas = new ArrayList<>();
		for(Cart cart : carts) {
			Cart dto = new Cart();
			dto.setOrderNo(orderNo);
			dto.setCartId(cart.getCartId());
			dto.setProductId(cart.getProductId());
			dto.setName(cart.getName());
			dto.setUnitPrice(cart.getUnitPrice());
			dto.setCnt(cart.getCnt());
			dto.setSumPrice(cart.getUnitPrice() * cart.getCnt());
			datas.add(dto);
		}
		return datas;
	}
	
	public boolean insertOrderData(OrderDataDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int flag = 0;
		String sql = "insert into table_name values (null, ?,?,?,?,?,?,?)";
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.preparedStatement(sql);
			pstmt.setString(1, dto.getOrderNo());
			pstmt.setInt(2, dto.getCartId());
			pstmt.setString(3, dto.getProductId());
			pstmt.setString(4,dto.getName());
			pstmt.setInt(5, dto.getUnitPrice());
			
			pstmt.setInt(6, dto.getCnt());
			pstmt.setInt(7, dto.getSumPrice());
			flag = pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("insertOrderData() 에러 :" + ex);
		}
		return flag != 0;
	}
	
	
	
	
}
