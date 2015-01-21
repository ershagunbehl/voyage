package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BasicDB;

/**
 * Servlet implementation class ModifyServlet
 */
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String email = request.getParameter("email");
		String npd = request.getParameter("npd");
	BasicDB bd = new BasicDB();
	 bd.modifyCustInfo(fn,ln,email,npd);
	
	//System.out.println("bd.email"+email);
	
		
			System.out.println("hi");
			 response.getWriter().println(" <h1>modification succesful</h1>");		
		
	


	}

}
