package com.example.todolistkakarta.dao;


import com.example.todolistkakarta.util.ConnectionUtil;
import com.example.todolistkakarta.vo.TodoVo;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoDao {
    public String getTime(){
        String now = null;

        try(Connection conn = ConnectionUtil.INSTANCE.getConnection();
            PreparedStatement pstmt = conn.prepareStatement("select now()");
            ResultSet rs = pstmt.executeQuery();
        ){
         rs.next();
         now = rs.getString(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        return now;
    }
    public String getTime2() throws Exception{
        @Cleanup
        Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup
        PreparedStatement pstmt = conn.prepareStatement("select now()");
        @Cleanup
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        String now = rs.getString(1);
        return now;
    }

    public void insert(TodoVo vo) throws Exception{
        String sql = "insert into todolist (title, dueDate, finished) values (?,?,?)";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,vo.getTitle());
        pstmt.setDate(2, Date.valueOf(vo.getDueDate()));
        pstmt.setBoolean(3,vo.isFinished());
        pstmt.executeUpdate();
    }


    public void delteOne(Long tno) throws Exception{
        String sql = "delete from todolist where tno = ?";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setLong(1,tno);
        pstmt.executeUpdate();
    }

    public void updateOne(TodoVo vo) throws Exception{
        String sql = "update todolist set title=?, dueDate =?,finished =? where tno = ?";
        @Cleanup Connection conn = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,vo.getTitle());
        pstmt.setDate(2,Date.valueOf(vo.getDueDate()));
        pstmt.setBoolean(3,vo.isFinished());
        pstmt.setLong(4,vo.getTno());
        pstmt.executeUpdate();
    }
}
