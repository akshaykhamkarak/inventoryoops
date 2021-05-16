package com.mindtree.utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {	
		private static	String URL = "jdbc:mysql://localhost:3307/InventoryApp";
		private static	String USER_NAME = "root";
		private static	String PASSWORD = "Trishali@1999";
		public static Connection getConnection() {
			Connection con = null;

			try {
			//	Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
		
	}


