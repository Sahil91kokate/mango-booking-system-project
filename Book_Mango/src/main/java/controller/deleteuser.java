package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.customer;

import dio.customerdao;

/**
 * Servlet implementation class deleteuser
 */
@WebServlet("/deleteuser")
public class deleteuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteuser() {
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
		
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		
		String radio=request.getParameter("del");
		
		
		
		
		if(radio.equals("yes")) {
			HttpSession session = request.getSession();
			
			customerdao cd= new customerdao();
			
			int id=Integer.parseInt(request.getParameter("id"));
			
			customer ctm =new customer();
			ctm.setId(id);
			
			
			boolean b=cd.deleteuser(ctm);
			
			if(b){
				pw.print("<body bgcolor=\"yellow\"> acount deleted successfully</body>");
				request.getRequestDispatcher("register.jsp").include(request, response);		
			}
			else {
				
				response.sendRedirect("home.jsp");
			}
			
			
		}
		else {
			
			response.sendRedirect("home.jsp");
		}
	}

}
