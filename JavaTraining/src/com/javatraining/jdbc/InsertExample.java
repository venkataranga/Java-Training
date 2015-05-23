package com.javatraining.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExample {

	public static void main(String[] args) {

		final String query = "INSERT INTO Student (`ID`, `firstname`, `lastname`, `email`, `branch`, `overall_grade`, `age`) "
				+ "VALUES ('4', 'ravi', 'ravi', 'ravi@ravi.com', 'MEC', 'A', '23')";

		getResult(query);

	}

	public static void getResult(String sqlQuery) {

		Connection connection = null;
		boolean result = false;
		try {

			// Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/JDBCTraining", "root",
					"dinesh");

			Statement statement = connection.createStatement();

			result = statement.execute(sqlQuery);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println(result);
	}

}
