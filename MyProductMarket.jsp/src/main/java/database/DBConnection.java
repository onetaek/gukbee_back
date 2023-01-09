package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
			
		Connection conn = null;
		
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
		return conn;
	}
}
