package controller;




import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BasicDB;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
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
		


	     try
	     {
	    	PrintWriter out			=	response.getWriter();
	        String receiver_id		=	request.getParameter("email");
	        String query_text		=	request.getParameter("pd");
	        
	        Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com");
			props.put("mail.smtp.socketFactory.port", "465");
			props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.port", "465");

			Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() 
			{
				protected PasswordAuthentication getPasswordAuthentication() 
					{
						return new PasswordAuthentication("voyagetravels13@gmail.com","mywebproject");
					}
			});

			try 
			{
				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("voyagetravels13@gmail.com"));
				message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(receiver_id));
				message.setSubject("Verification Mail");
				message.setText("Dear Member!"+"\n\n\n User Password is ::  "+query_text+"\n\n\n\n No spam to my email, please!");

				Transport.send(message);
				
				
				
				out.println("Thanks! Your mail has been sent!");
				System.out.println("Done");

			} catch (MessagingException e) {
				System.out.print("Mail Not Send : "+e);
			}
	    }catch (Exception e) {
	    	e.printStackTrace();
		}

		
		
		
		String a = request.getParameter("fn");
		String b = request.getParameter("ln");
		String c = request.getParameter("email");
		String d = request.getParameter("pd");

		
		//String a= u=request.getParameter("user");
	//	String  d = p=request.getParameter("pass");
		String  z = d; // Value to encrypt
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
//				Second a=new Second();
//			a.addValues(u,x);

		
		
		
		
		BasicDB bd = new BasicDB();
	 bd.registerCustomers(a,b,c,x);
System.out.println("");
	

HttpSession session=request.getSession();
session.setMaxInactiveInterval(50);
session.setAttribute("newatt",a );


	 //response.getWriter().println(" <h1>registration succesful</h1>");	

		RequestDispatcher rd= request.getRequestDispatcher("ViewUser.jsp");
		rd.forward(request,response);
	
	}
}
