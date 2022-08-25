package com.practice.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectDatabase {

	private static String driverClass = "com.mysql.cj.jdbc.Driver";
	private static String connectUrl = "jdbc:mysql://localhost:3306/test";
	private static String username = "root";
	private static String password = "root";
	private static Connection conn = null;

	public static Connection getConnection() {
		try {
			Class.forName(driverClass);
			conn = DriverManager.getConnection(connectUrl, username, password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
