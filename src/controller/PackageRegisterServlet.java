package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import factory.beanclass;

import model.BasicDB;

/**
 * Servlet implementation class PackageRegisterServlet
 */
public class PackageRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PackageRegisterServlet() {
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
	
	String way =request.getParameter("way");
		String destination= request.getParameter("destination");
		String date=request.getParameter("date");
		String type=request.getParameter("type");
	int adults=Integer.parseInt(request.getParameter("adults"));
		int children=Integer.parseInt(request.getParameter("children"));
		int infant=Integer.parseInt(request.getParameter("infant"));
		String Fclass=request.getParameter("Fclass");
		
	
	BasicDB bd = new BasicDB();
	int id = 0;
		int k =bd.packageRegister(id,way,destination,date,type,adults,children,infant,Fclass);
		if(k>0)
		{
			System.out.println("Registered ....");
			System.out.println("id="+id);
			
			beanclass p=bd.fetchInfo(id,destination);
			request.setAttribute("myatt", p);
		
				
			beanclass g = bd.fetchPackageInfo(destination);
			request.setAttribute("myatt1", g);
				
			
			
			 RequestDispatcher rd=request.getRequestDispatcher("PackageInfo.jsp");
				rd.forward(request,response);
			
		}
			



		

		
	}

}
