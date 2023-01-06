package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Product;

public class ProductDao {
	
	ResultSet rs; 
    Connection conn;
    PreparedStatement pstmt;
    
	public ProductDao() {    
		String dbID = "root";
	    String dbPassword = "7517";
	    String dbURL = "jdbc:mariadb://localhost:3310/my_product_market";
	    try{   		
		    Class.forName("org.mariadb.jdbc.Driver");
		    conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		    System.out.println("db connect successed!!");
	    }catch(Exception e){
	    	e.printStackTrace();
	    	System.out.println("db connect failed");
	   	}
	}
	
	public ArrayList<Product> selectAllProduct(){
		ArrayList<Product> dtos = new ArrayList<Product>();
		try {
			String sql = "select p_id, p_name, p_unitPrice, p_description, p_fileName"
					+ " from product";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();			
				p.setProductId(rs.getString("p_id"));
				p.setPname(rs.getString("p_name"));
				p.setUnitPrice(rs.getInt("p_unitPrice"));
				p.setDescription(rs.getString("p_description"));
				p.setFilename(rs.getString("p_fileName"));
				dtos.add(p);
			}
			conn.close();
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("selectAllProduct method error");
			e.printStackTrace();
		}
		return dtos;
	}
	
	public Product getOneProduct(String id) {
		Product dto = new Product();
		try {
			String sql = "select p_id, p_name, p_unitPrice, p_description, p_category, p_manufacturer, "
					+ "p_unitsInStock, p_condition, p_fileName from product where p_id= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setProductId(rs.getString(1));
				dto.setPname(rs.getString(2));
				dto.setUnitPrice(rs.getInt(3));
				dto.setDescription(rs.getString(4));
				dto.setCategory(rs.getString(5));
				dto.setManufacturer(rs.getString(6));
				dto.setUnitsInStock(rs.getLong(7));
				dto.setCondition(rs.getString(8));
				dto.setFilename(rs.getString(9));
			}
			conn.close();
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return dto;
	}
	
	public void addProduct(String productId,String name,int price,String description,
		String category,String manufacturer,Long stock,String condition,String filename) {
		try {
			String sql = "insert into product values(?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,productId);
			pstmt.setString(2,name);
			pstmt.setInt(3,price);
			pstmt.setString(4,description);
			pstmt.setString(5,category);
			pstmt.setString(6,manufacturer);
			pstmt.setLong(7,stock);
			pstmt.setString(8,condition);
			pstmt.setString(9,filename);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
    
    public void updateProduct(String productId,String name,int price,String description,
    		String category,String manufacturer,Long stock,String condition,String filename) {
    	System.out.println("updateProduct메소드실행!");
    	System.out.println("productId: "+productId);
    	try {
    		String sql = "select count(*) from product where p_id = ?";
    		pstmt = conn.prepareStatement(sql);
    		pstmt.setString(1,productId);
    		rs = pstmt.executeQuery();
    		if(rs.next()) {
    			System.out.println("rs후!");
    			if(filename != null){				
    				sql = "update product set p_name = ?, p_unitPrice?, p_description = ?, p_manufacturer=?, p_category = ?, "
    						+"p_unitsInStock=?, p_condition=?, p_fileName=? where p_id=?";
    				pstmt = conn.prepareStatement(sql);
    				pstmt.setString(1,name);
    				pstmt.setInt(2,price);
    				pstmt.setString(3,description);
    				pstmt.setString(4,manufacturer);
    				pstmt.setString(5,category);
    				pstmt.setLong(6,stock);
    				pstmt.setString(7,condition);
    				pstmt.setString(8,filename);
    				pstmt.setString(9,productId);
    				pstmt.executeUpdate();
    			}else{
    				sql = "update product set p_name = ?, p_unitPrice = ?, p_description = ?, p_manufacturer=?, p_category = ?, "
    						+"p_unitsInStock=?, p_condition=? where p_id=?";
    				pstmt = conn.prepareStatement(sql);
    				pstmt.setString(1,name);
    				pstmt.setInt(2,price);
    				pstmt.setString(3,description);
    				pstmt.setString(4,manufacturer);
    				pstmt.setString(5,category);
    				pstmt.setLong(6,stock);
    				pstmt.setString(7,condition);
    				pstmt.setString(8,productId);
    				pstmt.executeUpdate();
    			}
    		}
    		
    		rs.close();
    		pstmt.close();
    		conn.close();
    	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    }
}
