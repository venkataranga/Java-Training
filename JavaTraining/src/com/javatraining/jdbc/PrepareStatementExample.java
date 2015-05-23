package com.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementExample {

	public static void main(String[] args) throws SQLException {
		final String query = "INSERT INTO Student (`ID`, `firstname`, `lastname`, `email`, `branch`, `overall_grade`, `age`) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		Connection con = null;
		PreparedStatement prepStatement= null;
		try{
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBCTraining", "root",
					"dinesh");
			
			prepStatement = con.prepareStatement(query);
			prepStatement.setInt(1, 5);
			prepStatement.setString(2, "abc");
			prepStatement.setString(3, "abc");
			prepStatement.setString(4, "abc");
			prepStatement.setString(5, "abc");
			prepStatement.setString(6, "A");
			prepStatement.setInt(7, 10);
			
			prepStatement.execute();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(con!=null){
				con.close();
			}
		}
		
		
	}
	
	
}
