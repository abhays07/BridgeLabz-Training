package com.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/jdbcconnectivity";
	private static String USER = "root";
	private static final String PASSWORD = "05052005";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database Connected Successfully.");
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found!");
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("Connection Failed!");
			e.printStackTrace();
		}
		return connection;
	}
	
}
