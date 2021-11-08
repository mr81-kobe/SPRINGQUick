package com.springbook.biz.board.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtill {

	public JDBCUtill() {
		// TODO Auto-generated constructor stub 
	} 
	public static Connection getConnection(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hgj0307","0307");
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}
		return null;
	
	}
	
	public static void close(PreparedStatement stmt , Connection conn){
		if(stmt!=null){
			try{
				if(!stmt.isClosed()) stmt.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}finally {
				stmt=null;
			}
		}
		
		if(conn!=null){
			try{
				if(!conn.isClosed()) conn.close();
			}catch (Exception e) {
				// TODO: handle exception
			}finally {
				conn=null;
			}
		}
	}
	
	public static void close(PreparedStatement stmt , Connection conn, ResultSet rs){
		if(rs!=null){
			try{
				if(!rs.isClosed()) rs.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}finally {
				rs=null;
			}
		}
		if(stmt!=null){
			try{
				if(!stmt.isClosed()) stmt.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}finally {
				stmt=null;
			}
		}
		
		if(conn!=null){
			try{
				if(!conn.isClosed()) conn.close();
			}catch (Exception e) {
				// TODO: handle exception
			}finally {
				conn=null;
			}
		}
	}
	
}
