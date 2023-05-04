package controller;

import java.io.IOException;
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
 * Servlet implementation class adminedit
 */
@WebServlet("/adminedit")
public class adminedit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminedit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
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
	 
	 HttpSession session = request.getSession();
	 productdao cd= new productdao();
	 product pct =new product();
	 
	 pct.setP_id(id);
	 pct.setP_name(name);
	 pct.setP_category(category);
	 pct.setP_quality(quality);
	 pct.setP_price_pr_dz(price);
	 pct.setP_avaibility_dz(avaibility);
	 pct.setDescription(description);
	 
	 boolean b=cd.editproduct(pct);
		if(b) {
			session.setAttribute("product",pct);
			response.sendRedirect("adminoperation.jsp");
		}
		else {}
	 
	 
	}

}
