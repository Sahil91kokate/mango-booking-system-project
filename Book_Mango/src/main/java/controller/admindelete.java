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
import com.model.product;

import dio.customerdao;
import dio.productdao;

/**
 * Servlet implementation class admindelete
 */
@WebServlet("/admindelete")
public class admindelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public admindelete() {
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
		PrintWriter out=response.getWriter();
		 int id=Integer.parseInt(request.getParameter("id"));
		 String radio=request.getParameter("del");
		 if(radio.equals("yes")) {
				HttpSession session = request.getSession();
				
				productdao cd= new productdao();
				
				
				
				product pct =new product();
					pct.setP_id(id);
				
				
				boolean b=cd.deleteadmin(id);
				
				if(b){
					out.print("<body bgcolor=\"yellow\"> product deleted successfully</body>");
					request.getRequestDispatcher("adminoperation.jsp").include(request, response);		
				}
				else {
					
					response.sendRedirect("adminoperation.jsp");
				}
				
				
			}
			else {
				
				response.sendRedirect("adminoperation.jsp");
			}
		}

	}


