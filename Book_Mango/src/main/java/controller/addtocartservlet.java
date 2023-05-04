package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.cart;

/**
 * Servlet implementation class addtocartservlet
 */
@WebServlet("/addtocartservlet")
public class addtocartservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addtocartservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter out= response.getWriter()) {
			
			ArrayList<cart> cart= new ArrayList<>();
			
			int id =Integer.parseInt(request.getParameter("id"));
			cart cm = new cart();
			cm.setP_id(id);
			cm.setQuantity(1);
			
			HttpSession session = request.getSession();
			
			
			
			ArrayList<cart> cart_list=(ArrayList<cart>)session.getAttribute("cart_list"); 
			
		if(cart_list ==null) {
			
			cart.add(cm);
			
			session.setAttribute("cart_list", cart);
			
			response.sendRedirect("category.jsp");
			out.print("ok");
		}
		
		else {
			
			cart=cart_list;
			boolean exist =false;
			for(cart c:cart_list) {
				
				if(c.getP_id()==id) {
				
				exist=true;
				out.print("<h3 style='color:crimson; text-align:center'>Item alrelady exist in cart.<a href='cart.jsp'>Go To Cart Page</a></h3>");
				
								}
					}
			
			if(!exist){
				
				cart.add(cm);
				response.sendRedirect("category.jsp");
			
			}
		}
		
}
		}
		
		
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
