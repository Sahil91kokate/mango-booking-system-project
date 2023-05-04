package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_mango","root","");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}



