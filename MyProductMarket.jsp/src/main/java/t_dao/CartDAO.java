package t_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import database.DBConnection;
import dto.Cart;
import dto.Product;

public class CartDAO {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public CartDAO() {
		connect();
	}
	
	private void connect() {
		try {
			connection = DBConnection.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public boolean updateCart(Product product, String orderNo, String memberId) {
		int flag = 0;
		String productId = product.getProductId();
		System.out.println("productDTO에서 받은 productId: "+productId);
		try {
			String sql = "select * from cart where orderNo = ? and productId = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, orderNo);
			preparedStatement.setString(2, productId);
			System.out.println("111");
			resultSet = preparedStatement.executeQuery();
			System.out.println("222");
			if(resultSet.next()) {
				int cartId = resultSet.getInt("cartId");
				sql = "update cart set cnt = cnt + 1 where cartId = ?";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, cartId);
				flag = preparedStatement.executeUpdate();
			}else {
				sql = "insert into cart (cartId, memberId, orderNo, productId, "
						+ "name, unitPrice, cnt, InsertDate)"
						+ " values(null,?,?,?,?,?,?,now())";
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, memberId);
				preparedStatement.setString(2, orderNo);
				preparedStatement.setString(3, productId);
				preparedStatement.setString(4, product.getPname());
				preparedStatement.setInt(5, product.getUnitPrice());
				preparedStatement.setInt(6, 1);
				flag = preparedStatement.executeUpdate();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag == 1;
	}
	
	
	public ArrayList<Cart> getAllCart(String orderNo){
		ArrayList<Cart> carts = new ArrayList<>();
		
		String sql = "select * from cart where orderNo = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, orderNo);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Cart cart = new Cart();
				cart.setCartId(resultSet.getInt(1));
				cart.setMemberId(resultSet.getString(2));
				cart.setOrderNo(resultSet.getString(3));
				cart.setProductId(resultSet.getString(4));
				cart.setName(resultSet.getString(5));
				cart.setUnitPrice(resultSet.getInt(6));
				cart.setCnt(resultSet.getInt(7));
				cart.setInsertDate(resultSet.getDate(8));
				carts.add(cart);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return carts;	
	}
	
	public boolean updateCartByLogin(HttpSession session) {
		int flag = 0;
		String orderNo = session.getId();
		String id = (String)session.getAttribute("sessionId");
		//이전 로그인에 담은 상품 업데이트
		String sql = "update cart set orderNo = ? where id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, orderNo);
			preparedStatement.setString(2, id);
			flag = preparedStatement.executeUpdate();
			
			//로그인 전에 담은 상품 업데이트
			sql = "update cart set id = ? where orderNo = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2,orderNo);
			flag = preparedStatement.executeUpdate();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag != 0;

	}
	
	
}
