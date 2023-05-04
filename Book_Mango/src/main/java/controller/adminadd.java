package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dio.productdao;

/**
 * Servlet implementation class adminadd
 */
@WebServlet("/adminadd")
public class adminadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminadd() {
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
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String category=request.getParameter("category");
		String quality=request.getParameter("quality");
		float price=Float.parseFloat(request.getParameter("price"));
		int avaibility=Integer.parseInt(request.getParameter("avaibility"));
		String description=request.getParameter("description");
		
		productdao pdo= new productdao();
		boolean b=pdo.addproduct(id, name, category, quality, price, avaibility, description);
		
		if(b) {
			
			
		request.getRequestDispatcher("adminoperation.jsp").include(request, response);
		}
		else {
			request.setAttribute("error","not added");
			request.getRequestDispatcher("adminoperation.jsp").include(request, response);
		}
		
	}

}
