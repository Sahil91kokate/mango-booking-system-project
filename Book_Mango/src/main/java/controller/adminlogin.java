package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.admin;

import dio.admindao;

/**
 * Servlet implementation class adminlogin
 */
@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminlogin() {
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
		HttpSession session=  request.getSession();
		admin ad= new admin();
		admindao ado= new admindao();
		
		 String username= request.getParameter("uname");
		 String password=request.getParameter("pass");
		 
		 ad  = ado.adminlogin(username, password);
		 
		 if(ad.getUsername()!=null && ad.getPassword()!=null) {
			 
			 session.setAttribute("admin", ad);
			 response.sendRedirect("adminoperation");
		 }
		 else {
			 
			 
					request.setAttribute("errorMsg", 
							"user and Password Does Not Match!");
					request.getRequestDispatcher("adminlogin.jsp").include(request, response);
				}


			 
		 }
		
	}


