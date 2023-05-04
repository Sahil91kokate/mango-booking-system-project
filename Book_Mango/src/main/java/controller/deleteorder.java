package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.orders;

import dio.orderdao;

/**
 * Servlet implementation class deleteorder
 */
@WebServlet("/deleteorder")
public class deleteorder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteorder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		orders od= new orders();
		orderdao odo =new orderdao();
		
		int o_id= Integer.parseInt(request.getParameter("o_id"));
		boolean b=odo.deleteorder(o_id);
		
		if (b) {
			
			request.setAttribute("delete","delete sucessfully");
			request.getRequestDispatcher("order.jsp").include(request, response);
			
		}
		else {
			
			request.setAttribute("delete","order not deleted");
			request.getRequestDispatcher("order.jsp").include(request, response);

		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
