package com.connectionwithparameters;


import java.sql.Connection;

public class Main {
	public static void main(String[] args) {
		try {
			Connection conn = DatabaseConfiguration.getConnection();
			System.out.println("Connection Established");
		} catch (Exception e) {
			System.out.println("Error connecting database");
			e.printStackTrace();
		}
		
	}
}
