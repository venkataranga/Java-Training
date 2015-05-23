package com.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMetadataExample {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/JDBCTraining", "root",
				"dinesh");
		DatabaseMetaData metadata = con.getMetaData();
		System.out.println(metadata.getDatabaseMajorVersion());
		System.out.println(metadata.getDatabaseMinorVersion());
		System.out.println(metadata.getDriverName());
		System.out.println(metadata.getDriverVersion());
		System.out.println(metadata.getSQLKeywords());
		
		
		
	}
	
}
