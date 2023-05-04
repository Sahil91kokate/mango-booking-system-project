package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.customer;

import dio.customerdao;

/**
 * Servlet implementation class updateuser
 */
@WebServlet("/updateuser")
public class updateuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateuser() {
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
		
		
		HttpSession session = request.getSession();
		
		customerdao cd= new customerdao();
		
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		int id=Integer.parseInt(request.getParameter("id"));
		
		customer ctm =new customer();
		ctm.setId(id);
		ctm.setName(name);
		ctm.setMoblie(mobile);
		ctm.setAddress(address);
		ctm.setPassword(password);
		
		
		boolean b=cd.upadateuser(ctm);
		if(b) {
			session.setAttribute("customer",ctm);
			response.sendRedirect("home.jsp");
		}
		
		
		
		
	}

}
