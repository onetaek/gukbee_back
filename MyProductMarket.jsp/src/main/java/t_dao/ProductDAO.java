package t_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.DBConnection;
import dto.Product;

public class ProductDAO {
	private Connection connection = null;
	private PreparedStatement pstmt = null;
	private ResultSet resultSet = null;
	
	//DB연결 메서드
	void connect() {
		try {
			connection = DBConnection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ProductDAO() {
		connect();
	}
	
	public Product getProductById(String id) {
		Product product = null;
		try {
			String sql = "select * from product where p_id = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, id);
			resultSet = pstmt.executeQuery();
			if(resultSet.next()) {
				product = new Product(
						resultSet.getString("p_id"),
						resultSet.getString("p_name"),
						resultSet.getInt("p_unitPrice"));
				product.setDescription(resultSet.getString("p_description"));
				product.setCategory(resultSet.getString("p_category"));
				product.setManufacturer(resultSet.getString("p_manufacturer"));
				product.setUnitsInStock(resultSet.getInt("p_unitsInStock"));
				product.setCondition(resultSet.getString("p_condition"));
				product.setFilename(resultSet.getString("p_fileName"));
				System.out.println("resultSet의 id:"+resultSet.getString("p_id"));
			}
			if(resultSet!=null)
				resultSet.close();
			if(connection!=null)
				connection.close();
			if(pstmt!=null)
				pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
		
	}
}
