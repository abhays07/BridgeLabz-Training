package com.connectionwithparameters;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfiguration {
	public static Connection getConnection() throws SQLException {
		String URL = "jdbc:mysql://localhost:3306/jdbcconnectivity";
		// Connection properties
		
		java.util.Properties properties = new java.util.Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "05052005");
		properties.setProperty("useSSL", "false");
		 properties.setProperty("serverTimezone", "UTC"); 
		 properties.setProperty("allowPublicKeyRetrieval", "true"); 
		return DriverManager.getConnection(URL, properties); 

	}
}
