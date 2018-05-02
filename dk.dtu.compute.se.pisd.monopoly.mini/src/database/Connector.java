package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector {
	public static Connection getCon() {
		String username = "root";
		Connection conn = null;

		//1. get a connection to database
		if(conn == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Monopoly1", username, "");
				return conn;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return conn;
		
	}
	
}
