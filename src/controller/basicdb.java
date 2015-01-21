package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class basicdb




{
	String url="jdbc:mysql://localhost:3306/webdb";
	String user="root";
	String pass="root";
	int rating(int r)
	{
		int k=0;


		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement pstmt=con.prepareStatement("insert into ratetab values(?)");
			pstmt.setInt(1,r);

			 k = pstmt.executeUpdate();
			if(k>0)
			{
				System.out.println("rating succesful");
			}
			else
			{
				System.out.println("unsuccesful rating");
			}


		}
			catch(Exception m)
			{
				System.out.println("Exception:"+m);
			}

		return k;
	}

}
