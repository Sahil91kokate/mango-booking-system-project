package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.admin;
import com.model.product;

import dio.productdao;

/**
 * Servlet implementation class adminoperation
 */
@WebServlet("/adminoperation")
public class adminoperation extends HttpServlet {
	
	
	
	 product pt= new product();
		productdao pd = new productdao();
		

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminoperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		admin ad = (admin) session.getAttribute("admin");
		
		List<product>	pdarl =(List<product>) pd.adviewproduct();
		
		session.setAttribute("pdview",pdarl);
		response.sendRedirect("adminoperation.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
