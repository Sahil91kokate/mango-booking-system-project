package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dio.customerdao;

import util.dbconnect;


/**
 * Servlet implementation class registerservlet
 */
@WebServlet("/registerservlet")
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("c_name");
		String mobile=request.getParameter("c_mobile");
		String address=request.getParameter("c_address");
		String email=request.getParameter("c_email");
		String password=request.getParameter("c_password");
		
		
		
		if(email==null){
			
			request.setAttribute("error", "fill the email");
			request.getRequestDispatcher("register.jsp").include(request, response);
		}
	
		
		else if(email!=null) {
			customerdao cd= new customerdao();
			boolean b= cd.addUser(name, mobile, address, email, password);
			if(b) {
				
				response.sendRedirect("login.jsp");
			      }
			else {
				request.setAttribute("error","user already exist!");
				request.getRequestDispatcher("register.jsp").include(request, response);
				
				}
			
			}
			
		 
		}
	}


