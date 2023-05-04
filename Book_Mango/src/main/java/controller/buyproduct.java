package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.orders;

import dio.orderdao;

/**
 * Servlet implementation class buyproduct
 */
@WebServlet("/buyproduct")
public class buyproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int p_id=Integer.parseInt(request.getParameter("p_id"));
		String dzn=request.getParameter("dz");
		int id= Integer.parseInt(request.getParameter("c_id"));
		String c_name=request.getParameter("c_name");
		float p_price=Float.parseFloat(request.getParameter("p_price"));
		String shipping_add=request.getParameter("add");
	
		int dz=Integer.parseInt(dzn);
		float total_price = p_price * dz;
		
		
		orders od= new orders();
		orderdao odo= new orderdao();
		
		boolean b= odo.addorder(id,p_id,total_price,shipping_add,dz);
		
		if(b) {
			
			response.sendRedirect("home.jsp");
			
		}
		
	}

}
