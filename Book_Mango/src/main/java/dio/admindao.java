package dio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.admin;

import util.dbconnect;

public class admindao {

	Connection con = dbconnect.getConnection();
	
	public admin adminlogin(String username ,String password) {
		
		admin ad= new admin();
		
		String query ="select * from  admin where username=? and password=? ";
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				
				ad.setId(rs.getInt("id"));
				ad.setUsername(rs.getString("username"));
				ad.setPassword(rs.getString("password"));
				
			}
			
			return ad;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
			
		
		return null;}
	
}
