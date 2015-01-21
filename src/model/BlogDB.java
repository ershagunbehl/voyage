package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import factory.ConnectionPool;

public class BlogDB {

	Connection con;
	PreparedStatement pstmt;
	ResultSet rst;


	public void showRecords() {
		// TODO Auto-generated method stub
		
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
		pstmt=con.prepareStatement("select * from bloginfotab");
		rst=pstmt.executeQuery();
		System.out.println(con);
				System.out.println(pstmt);
		while(rst.next())
		{
			System.out.println(rst.getString(2)+" "+rst.getString(4));
		}
		}
		catch(Exception e){System.out.println("SQL Panga : "+e); }
		finally{
			pool.freeConnection(con);
		}
	}

		
	}


