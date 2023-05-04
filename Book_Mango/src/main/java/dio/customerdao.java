package dio;

import java.sql.*;

import com.model.customer;
//import com.mysql.jdbc.*;
import dio.customerdao;

import util.dbconnect;

public class customerdao {

	Connection con = dbconnect.getConnection();
	
	public boolean addUser(String name,String mobile,String address,String email, String password) {
		String sql = "insert into customer(name,mobile,address,email,password) values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps =  con.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, mobile);
			ps.setString(3, address);
			ps.setString(4, email);
			ps.setString(5, password);
			
			int i = ps.executeUpdate();
			if(i>0) {
				return true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	public customer customerlogin( String email , String password) {
		customer ctm= new customer();
		String sql = "select * from customer where email=? and password=?";

		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				ctm.setId(rs.getInt("id"));
				ctm.setName(rs.getString("name"));
				ctm.setMoblie(rs.getString("mobile"));
				ctm.setAddress(rs.getString("address"));
				ctm.setEmail(rs.getString("email"));
				ctm.setPassword(rs.getString("password"));
				
			}
			
			return ctm;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public boolean upadateuser(customer ctm) {
		
		
	String	query= "update customer set name=?, mobile=?, address=?, password=? where id=?";
	
	try {
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1, ctm.getName());
		ps.setString(2, ctm.getMoblie());
		ps.setString(3, ctm.getAddress());
		ps.setString(4, ctm.getPassword());
		ps.setInt(5, ctm.getId());
		
		int b=ps.executeUpdate();
		
		if(b>0) {
		return true;
		}
		
	} catch (SQLException e) {
		// TODO Auto-generate catch block
		e.printStackTrace();
	}
		
		return false;
	}
	
	public boolean deleteuser(customer ctm) {
		String query="delete from customer where id=?";
		
	try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, ctm.getId());
		
		
		int a=ps.executeUpdate();
		
		
		if (a>0) {
			
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		
		
		
		
		return false;
		
		
		
		
	}
	
}
