package email;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactFormSendEmail
 */
public class ContactFormSendEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactFormSendEmail() {
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

	
		
	     try
	     {
	    	PrintWriter out			=	response.getWriter();
	        String receiver_id		=	request.getParameter("email");
	        String query_text		=	request.getParameter("message");
	        
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
				message.setText("Dear Member"+"\n\n\n User Message is ::  "+query_text+"\n\n\n\n No spam to my email, please!");

				Transport.send(message);
				
				
				
				out.println("Thanks! Your mail has been sent!");
				System.out.println("Done");

			} catch (MessagingException e) {
				System.out.print("Mail Not Send : "+e);
			}
	    }catch (Exception e) {
	    	e.printStackTrace();
		}

		
		
		
	
	}

}
