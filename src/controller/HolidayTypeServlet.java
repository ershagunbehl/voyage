package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.beanclass;

import model.BasicDB;

/**
 * Servlet implementation class HolidayTypeServlet
 */
public class HolidayTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolidayTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Request reached till HolidayTypeSErvlet");
		int v = Integer.parseInt(request.getParameter("value"));
		BasicDB bd = new BasicDB();
		beanclass h= bd.getHolidayTypeInfo(v);

		request.setAttribute("myatt", h);
		
			
			RequestDispatcher rd=request.getRequestDispatcher("holidaytype.jsp");
			rd.forward(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
