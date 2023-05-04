package controller;

import util.*;
import dio.*;
import com.model.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 
	customer ctm=new customer();
	customerdao cd=new customerdao();

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		
			String email=request.getParameter("c_email");
			String password=request.getParameter("c_password");
			HttpSession session = request.getSession();
			
			ctm =cd.customerlogin(email, password);
			
			
			if(ctm.getEmail()!=null && ctm.getPassword()!=null)
			{
				session.setAttribute("customer", ctm);
				response.sendRedirect("home.jsp");}

			else{
				request.setAttribute("errorMsg", 
						"Email and Password Does Not Match!");
				request.getRequestDispatcher("login.jsp").include(request, response);
			}

			
	}

}
