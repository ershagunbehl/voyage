package controller;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BasicDB;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String a = request.getParameter("fn");
		String b = request.getParameter("pd");

		
		String  z = b; // Value to encrypt
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} 
	catch(NoSuchAlgorithmException e) {e.printStackTrace();} 

		// Encryption algorithm
		md.update(z.getBytes(),0,z.length());
		// Create Encrypted string

		String  x = new BigInteger (1, md.digest()).toString(16); 
		//Send to Pojo for Insert in Database

		
		
		
		

		
		
		BasicDB obj=new BasicDB();
		String obj1=obj.checkUsernameAndPassword(a,x);
		
		if(obj1.equals("yes"))
		{
			HttpSession session=request.getSession();
			session.setMaxInactiveInterval(50);
			session.setAttribute("newatt",a );
		
			RequestDispatcher rd= request.getRequestDispatcher("ViewUser.jsp");
			rd.forward(request,response);
				
		}
		
		else
		{String wrong="you ve entered wrong username";
		request.setAttribute("obj1", wrong);
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request,response);
			
			
		}
		

		
		
		
		
		//String n =request.getParameter("fn");
	
	//	rd.forward(request, response);

		
		
		//HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(10);
	//((HttpServletResponse) session).sendRedirect("index.html");
	//	request.setAttribute("myatt", bd);
		//RequestDispatcher rd=request.getRequestDispatcher("ViewUser.jsp");
	//	rd.forward(request,response);
	}

}
