package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.customer;
import com.model.product;

import dio.productdao;

/**
 * Servlet implementation class productview
 */
@WebServlet("/productview")
public class productview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       product pt= new product();
	productdao pd = new productdao();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession();
		
		customer ctm =  (customer) session.getAttribute("customer");
		
		String cate=request.getParameter("cate");
		
		List<product> pdarl= (List<product>) pd.viewproduct(cate);
		session.setAttribute("pdview",pdarl);
		response.sendRedirect("category.jsp");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
