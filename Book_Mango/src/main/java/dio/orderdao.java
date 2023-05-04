package dio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.model.*;
import util.dbconnect;

public class orderdao {
	Connection con = dbconnect.getConnection();
	
	public boolean addorder(int id,int p_id,float total_price,String shipping_add , int dz) {
		String sql = "insert into orders(id,p_id,total_price,shipping_add,dz) values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps =  con.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setInt(2, p_id);
			ps.setFloat(3, total_price);
			ps.setString(4, shipping_add);
			ps.setInt(5, dz);
			
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

	
	public ArrayList<orders> getorder(int cust_id)
	{
		orders obj[] = new orders[1];
		ArrayList<orders> arl = new ArrayList<orders>();
		String query = "SELECT customer.Name, customer.email, orders.p_id,orders.o_id, orders.o_date, orders.shipping_add, orders.dz ,orders.total_price,product.p_category, product.p_quality FROM customer JOIN orders ON customer.id = orders.id JOIN product ON product.p_id = orders.p_id WHERE customer.id = ?;";
		
		try {
			PreparedStatement ps =   con.prepareStatement(query);
			ps.setInt(1,  cust_id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				obj[0]= new orders();
				
				obj[0].setPd_id(rs.getInt("p_id"));
				obj[0].setName(rs.getString("name"));
				obj[0].setCategory(rs.getString("p_category"));
				obj[0].setQuality(rs.getString("p_quality"));
				obj[0].setAddress(rs.getString("shipping_add"));
				obj[0].setEmail(rs.getString("email"));
				obj[0].setTotal(rs.getFloat("total_price"));
				obj[0].setDozen(rs.getInt("dz"));
				obj[0].setO_date(rs.getString("o_date"));
				obj[0].setO_id(rs.getInt("o_id"));
				arl.add(obj[0]);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arl;
	}

	
	public boolean deleteorder(int id) {
		String query="delete from orders where o_id=?";
		
	try {
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		
		
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
