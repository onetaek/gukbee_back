package sample_news.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sample_news.dto.NewsDTO;

public class NewsDAO {
	final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
	final String JDBC_URL = "jdbc:mariadb://localhost:3310/sample_news";
	final String JDBC_USER = "root";
 	final String JDBC_PASSWORD = "7517";
 	
 	public Connection open() {
 		Connection conn = null;
 		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
			System.out.println("db connect success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("db connect failed");
		}
 		return conn;
 	}
 	
 	public void addNews(NewsDTO news) throws Exception{
 		Connection conn = open();
 		String sql;
 		if(news.getImg()==null) {
 			sql = "insert into news(title,date,content) values (?,now(),?)";
 		}
 		sql = "insert into news(title,img,date,content) values (?,?,now(),?)";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		try(conn;pstmt){
 			pstmt.setString(1, news.getTitle());
 			pstmt.setString(2, news.getImg());
 			pstmt.setString(3, news.getContent());
 			pstmt.executeUpdate();
 		}
 	}
 	
 	public List<NewsDTO> getAll() throws Exception{
 		System.out.println("getAll 메서드 실행");
 		Connection conn = open();
 		List<NewsDTO> dtos = new ArrayList<>();
 		
 		String sql = "select aid, title,img, date,content from news";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		ResultSet rs = pstmt.executeQuery();
 		
 		try(conn;pstmt;rs){
 			while(rs.next()) {
 				NewsDTO dto = new NewsDTO(
 						rs.getInt("aid"),
 						rs.getString("title"),
 						rs.getString("img"),
 						rs.getDate("date"),
 						rs.getString("content")
 						);
 				dtos.add(dto);
 			}
 		}
 		return dtos;
 	}
 	
 	public NewsDTO getNews(int aid) throws Exception{
 		Connection conn = open();
 		
 		NewsDTO dto = null;
 		String sql = "select aid, title, img, date, content from news where aid = ?";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setInt(1, aid);
 		ResultSet rs = pstmt.executeQuery();
 		rs.next();
 		try(conn;pstmt;rs){
 			dto = new NewsDTO(
 					rs.getInt("aid"),
 					rs.getString("title"),
 					rs.getString("img"),
 					rs.getDate("date"),
 					rs.getString("content")
 					);
 		}
 		return dto;
 	}
 	
 	
 	public void delNews(int aid) throws Exception{
 		Connection conn = open();
 		String sql = "delete from news where aid = ?";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		try(conn;pstmt){
 			pstmt.setInt(1, aid);
 			if(pstmt.executeUpdate() == 0) {
 				throw new SQLException("DB에러");
 			}
 		}
 	}
 	
 	
 	
 	
 	
 	
 	
}
