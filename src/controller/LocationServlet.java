package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BasicDB;
import factory.beanclass;

/**
 * Servlet implementation class LocationServlet
 */
public class LocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int d = Integer.parseInt(request.getParameter("value"));
		BasicDB bd = new BasicDB();
		beanclass h= bd.getLocInfo(d);

		request.setAttribute("myatt", h);
		

		HttpSession session=request.getSession(false);
		
		
		if(session!=null)
		{
			String nam=(String)session.getAttribute("newatt"); 
			RequestDispatcher rd=request.getRequestDispatcher("location.jsp");
			rd.forward(request,response);
		}

		else
		{
			response.getWriter().println("session expired");
			System.out.println("Request failed from location servlet , session could not fetch values ");
			
			
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request,response);
		}
		
		
		}

		
			
			//HttpSession session = request.getSession(false);
			//if(session!=null)
			//{
			//	RequestDispatcher rd1=request.getRequestDispatcher("ViewUser.jsp");
			//	rd.forward(request,response);
			//}
			

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
