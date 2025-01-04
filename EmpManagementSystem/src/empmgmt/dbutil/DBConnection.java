package empmgmt.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection conn;
	static {
		try {
		conn=DriverManager.getConnection(
				"jdbc:oracle:thin:@//localhost:1521/xe", "xe",
				"xe");
		System.out.println("Connected to the DB");
		}catch(SQLException sql) {
			System.out.println("Cannot connect to the DB:"+sql.getMessage());
			System.exit(1);
		}
	}
	public static Connection getConnection() {
		return conn;
	}
	public static void closeConnection() {
		try {
			conn.close();
			System.out.println("Disconnected with the DB");
		}catch(SQLException sql) {
			System.out.println("Cannot disconnect with the DB:"+sql.getMessage());
			
		}
	}

}
