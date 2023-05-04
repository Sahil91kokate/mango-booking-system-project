package dio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

import com.model.cart;
import com.model.customer;
import com.model.product;

import util.dbconnect;


public class productdao {
	Connection con = dbconnect.getConnection();
	
	
	public ArrayList<product> viewproduct(String p_category){
		ArrayList<product> arl= new ArrayList<product>();
		
		product obj[]= new product[1];
		String sql = "select * from product where p_category=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, p_category);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				obj[0]= new product();
				
				obj[0].setP_id(rs.getInt(1));
				obj[0].setP_name(rs.getString(2));
				obj[0].setP_category(rs.getString(3));
				obj[0].setP_quality(rs.getString(4));
				obj[0].setP_price_pr_dz(rs.getFloat(5));
				obj[0].setP_avaibility_dz(rs.getInt(6));
				obj[0].setDescription(rs.getString(7));
				
					arl.add(obj[0]);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return  arl;
		
		
		
	}
	
	public ArrayList<product> adviewproduct(){
		ArrayList<product> arl= new ArrayList<product>();
		
		product obj[]= new product[1];
		String sql = "select * from product";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				obj[0]= new product();
				
				obj[0].setP_id(rs.getInt(1));
				obj[0].setP_name(rs.getString(2));
				obj[0].setP_category(rs.getString(3));
				obj[0].setP_quality(rs.getString(4));
				obj[0].setP_price_pr_dz(rs.getFloat(5));
				obj[0].setP_avaibility_dz(rs.getInt(6));
				obj[0].setDescription(rs.getString(7));
				
				arl.add(obj[0]);
			}
			
			return arl;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
		
		
	}
	
	public boolean addproduct(int p_id,String p_name ,String p_category,String p_quality, float p_price_pr_dz, int p_avaibility ,String description ) {
		String sql = "insert into product(p_id,p_name,p_category,p_quality, p_price_pr_dz,p_avaibility_dz,description) values(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement ps =  con.prepareStatement(sql);
			
			ps.setInt(1, p_id);
			ps.setString(2,p_name);
			ps.setString(3,p_category);
			ps.setString(4,p_quality);
			ps.setFloat(5, p_price_pr_dz);
			ps.setInt(6, p_avaibility);
			ps.setString(7,description);
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
	
	
	public ArrayList<product> pdviewproduct( int id){
		ArrayList<product> arl= new ArrayList<product>();
		
		product obj[]= new product[1];
		String sql = "select * from product where p_id=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1,id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				obj[0]= new product();
				
				obj[0].setP_id(rs.getInt(1));
				obj[0].setP_name(rs.getString(2));
				obj[0].setP_category(rs.getString(3));
				obj[0].setP_quality(rs.getString(4));
				obj[0].setP_price_pr_dz(rs.getFloat(5));
				obj[0].setP_avaibility_dz(rs.getInt(6));
				obj[0].setDescription(rs.getString(7));
				
				arl.add(obj[0]);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return  arl;
		
		
		
	}
	
	
	public boolean editproduct(product pct) {
		
		
		String	query= "update product set  p_name=?, p_category=?, p_quality=? , p_price_pr_dz=? ,   p_avaibility_dz=?, description=?   where p_id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(7,  pct.getP_id());
			ps.setString(1, pct.getP_name());
			ps.setString(2, pct.getP_category());
			ps.setString(3, pct.getP_quality());
			ps.setFloat(4, pct.getP_price_pr_dz());
			ps.setInt(5, pct.getP_avaibility_dz());
			ps.setString(6, pct.getDescription());
			
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
	
	public boolean deleteadmin(int id) {
		String query="delete from product where p_id=?";
		
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
	
	
	public List<cart> getcart(ArrayList<cart> cartlist) {
		
		
		List<cart> arl= new ArrayList<>();
		
		try {
			
			if(cartlist.size()>0) {
				for(cart i: cartlist) {
					
					
					PreparedStatement ps=con.prepareStatement("select * form product where p_id=?");
					ps.setInt(1,i.getP_id());
					ResultSet rs=ps.executeQuery() ;
					while(rs.next()) {
						cart ct= new cart();
						ct.setP_id(rs.getInt(1));
						ct.setP_name(rs.getString(2));
						ct.setP_category(rs.getString(3));
						ct.setP_quality(rs.getString(4));
						ct.setP_price_pr_dz(rs.getFloat(5));
						ct.setP_avaibility_dz(rs.getInt(6));
						ct.setDescription(rs.getString(7));
						ct.setQuantity(i.getQuantity());
						arl.add(ct);
						            }
					
								}
				
				
							}
			
			
			
			
		
	}catch(Exception e) {
		e.getStackTrace();
	}
		

	return arl;
	
}
}
	

