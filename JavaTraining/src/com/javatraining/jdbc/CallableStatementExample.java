package com.javatraining.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementExample {

	public static void main(String[] args) throws SQLException {
		
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/JDBCTraining", "root",
				"dinesh");
		CallableStatement c = con.prepareCall("{call studentCountByBranch(?, ?) }");
		c.setString(2, "MEC");
		c.registerOutParameter(1, Types.INTEGER);
		c.execute();
		System.out.println(c.getInt("c"));
		
		
	}
	
}
