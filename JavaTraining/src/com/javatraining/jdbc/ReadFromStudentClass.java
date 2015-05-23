package com.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadFromStudentClass {

	public static void main(String[] args) throws SQLException {

		final String QUERY = "select * from student";

		

		ResultSet result = getResult(QUERY);

		while (result.next()) {
			System.out.println("___________________");
			System.out.print(result.getInt(1)+" ");
			System.out.print(result.getString(2)+" ");
			System.out.print(result.getString(3)+" ");
			System.out.print(result.getString(4)+" ");
			System.out.print(result.getString(5)+" ");
			System.out.print(result.getString(6)+" ");
			System.out.print(result.getInt("age")+"\n");
		}

	}

	public static ResultSet getResult(String sqlQuery) {

		Connection connection = null;
		ResultSet result = null;
		try {

			// Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBCTraining", "root",
					"dinesh");

			Statement statement = connection.createStatement();

			result = statement.executeQuery(sqlQuery);
			ResultSetMetaData  data = result.getMetaData();
			System.out.println("FROM METADATA: "+data.getColumnCount());
			System.out.println("FROM METADATA: "+data.getColumnName(1));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
