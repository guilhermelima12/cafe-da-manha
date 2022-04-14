package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/cafedb";
	private static final String user = "root";
	private static final String password = "ted123";
	
	public static Connection createConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
		} catch(ClassNotFoundException e) {
			System.out.println("Driver not found. " + e.getMessage());
		}
		
		try {
			Connection connect = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to db");
			return connect;
			
		} catch(SQLException e) {
			System.out.println("Not connected to db. " + e.getMessage());
			return null;
		}	
		
	}
	
}
