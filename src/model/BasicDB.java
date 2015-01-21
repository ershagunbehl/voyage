package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import factory.ConnectionPool;
import factory.beanclass;


public class BasicDB 

{
	Connection con;
	PreparedStatement pstmt;
	ResultSet rst;
	public void registerCustomers(String a,String b,String c, String d)
	{
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
			int k= 0;
		pstmt=con.prepareStatement("insert into custinfotab values(?,?,?,?)");
		pstmt.setString(1,a);
		pstmt.setString(2,b);
		pstmt.setString(3,c);
		pstmt.setString(4,d);
		k = pstmt.executeUpdate();
		if(k>0)
		{
			System.out.println("registration succesful");
		}
		else 
		{
			System.out.println("unsuccesful registration");
		}

		}
		catch(Exception e)
		{
			System.out.println("SQL Panga : "+e); 
		}
		finally{
			pool.freeConnection(con);
		}
	
	}
	
	public String checkUsernameAndPassword(String a, String b) {
		{	String s=null;

				ConnectionPool pool=new ConnectionPool();
				con=pool.getConnection();
				try
				{
				
					pstmt=con.prepareStatement("select * from custinfotab where Firstname=? and Password=?");
					pstmt.setString(1,a);
					pstmt.setString(2,b);
					ResultSet rst=pstmt.executeQuery();
					if(rst.next())
					{
						s="yes";
						System.out.println("Records found in database,Login sucessful");
					}
					else 
					{
						s="no";
						System.out.println("Records not found in dB,login unsucessful");
					}
				}
					catch(Exception e)
					{
						System.out.println("Exception:"+e);
					}
					
				finally
				{
					pool.freeConnection(con);
				}
				return s;

		}
	}
	public void registerBlog(String a, String b, String c, String d, String e,
			String f, String g) {
		// TODO Auto-generated method stub
		

		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
			int k= 0;
		pstmt=con.prepareStatement("insert into bloginfotab values(?,?,?,?,?,?,?)");
		pstmt.setString(1,a);
		pstmt.setString(2,b);
		pstmt.setString(3,c);
		pstmt.setString(4,d);
		pstmt.setString(5,e);
		pstmt.setString(6,f);
		pstmt.setString(7,g);
		
k = pstmt.executeUpdate();
		if(k>0)
		{
			System.out.println("Blog registration succesful");
		}
		else 
		{
			System.out.println("unsuccesful Blog registration");
		}

		}
		catch(Exception z)
		{
			System.out.println("SQL Panga : "+z); 
		}
		finally{
			pool.freeConnection(con);
		}
	

	
	}
	

	


	public void getInfo(String a, String b)
	{
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
		
			pstmt=con.prepareStatement("select * from custinfotab where Firstname=? and Password=?");
			pstmt.setString(1,a);
			pstmt.setString(2,b);
			ResultSet rst=pstmt.executeQuery();
			if(rst.next())
			{
			System.out.println("LOGIN SUCCESFUL");
			}
		else
		{
			System.out.println("LOGIN UNSUCCESFUL");
		}
		}
			catch(Exception e)
			{
				System.out.println("Exception:"+e);
			}
			
		finally
		{
			pool.freeConnection(con);
		}
		
		}
	public beanclass getLocInfo(int d)
	{
		beanclass p = null;
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
		
			pstmt=con.prepareStatement("select * from loctab where id=?");
			pstmt.setInt(1, d);
			ResultSet rst=pstmt.executeQuery();
			if(rst.next())
			{
				p=new beanclass(rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getInt(6));
			}
			}
			catch(Exception e)
			{
				System.out.println("Exception sql panga:"+e);
			}
			
		finally
		{
			pool.freeConnection(con);
		}
		return p;
		
		
		}
	public int packageRegister(int id,String way, String destination, String date,
			String type, int adults, int children, int infant, String fclass) {

			int k=0;
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
			
		pstmt=con.prepareStatement("insert into packageinfotab values(?,?,?,?,?,?,?,?,?)");
		pstmt.setInt(1, id);
		pstmt.setString(2,way);
		
		pstmt.setString(3,destination);
		pstmt.setString(4,date);
		pstmt.setString(5,type);
		pstmt.setInt(6, adults);
		pstmt.setInt(7, children);
		pstmt.setInt(8, infant);
		pstmt.setString(9, fclass);
		k = pstmt.executeUpdate();
		if(k>0)
		{
			System.out.println("registration succesful");
		}
		else 
		{
			System.out.println("unsuccesful registration");
		}

		}
		catch(Exception e)
		{
			System.out.println("SQL Panga : "+e); 
		}
		finally{
			pool.freeConnection(con);
		}
		return k;

	}

	public beanclass getHolidayTypeInfo(int v)
	{
	beanclass p = null;
	ConnectionPool pool=new ConnectionPool();
	con=pool.getConnection();
	try
	{
	
		pstmt=con.prepareStatement("select * from holidaytypetab where id=?");
		pstmt.setInt(1, v);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next())
		{
			p=new beanclass(rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10),rst.getString(11),rst.getString(12),rst.getString(13),rst.getString(14),rst.getString(15),rst.getString(16),rst.getString(17),rst.getString(18),rst.getString(19),rst.getString(20));
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception sql panga:"+e);
		}
		
	finally
	{
		pool.freeConnection(con);
	}
	return p;
	}
	public beanclass fetchInfo(int id,String destination)
	{
		beanclass p = null;
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
		
			pstmt=con.prepareStatement("select * from packageinfotab where id=?");
			pstmt.setInt(1, id);
			ResultSet rst=pstmt.executeQuery();
			if(rst.next())
			{
				p=new beanclass(rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getInt(6),rst.getInt(7),rst.getInt(8),rst.getString(9));
			}
			
			pstmt=con.prepareStatement("select * from budgetinfo where destination=?");
			pstmt.setString(1, destination);
			ResultSet rst1=pstmt.executeQuery();
			if(rst1.next())
			{
				p=new beanclass(rst.getInt(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10));
			}
			
			
			
			}
			catch(Exception e)
			{
				System.out.println("Exception sql panga:"+e);
			}
			
		finally
		{
			pool.freeConnection(con);
		}
		return p;
		
		
		}
	public beanclass getInfoBySession(String f)
	{
		beanclass p = null;
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
		
			pstmt=con.prepareStatement("select * from custinfotab where Firstname=?");
			pstmt.setString(1, f);
			ResultSet rst=pstmt.executeQuery();
			if(rst.next())
			{
				p=new beanclass(rst.getString(2),rst.getString(3),rst.getString(4));
			}
			
			}
			catch(Exception e)
			{
				System.out.println("Exception sql panga:"+e);
			}
			
		finally
		{
			pool.freeConnection(con);
		}
		return p;
		
		
		
	}
	public void modifyCustInfo(String fn, String ln, String email, String npd) 
	{
	int k=0;
		
		ConnectionPool pool=new ConnectionPool();
		con=pool.getConnection();
		try
		{
		
			pstmt=con.prepareStatement("update custinfotab set Lastname=?,Email=?,Password=? where Firstname=?");
			
			pstmt.setString(1, ln);
			pstmt.setString(2, email);
			pstmt.setString(3, npd);
			
			pstmt.setString(4, fn);
			
			k = pstmt.executeUpdate();
			if(k>0)
			{
				System.out.println("modification succesful");
			}
			else 
			{
				System.out.println("unsuccesful modification");
			}

			}
			
		
			catch(Exception e)
			{
				System.out.println("Exception sql panga:"+e);
			}
			
		finally
		{
			pool.freeConnection(con);
		}
		
		
	}
	
	

public beanclass fetchPackageInfo(String destination)
{
	beanclass p = null;
	ConnectionPool pool=new ConnectionPool();
	con=pool.getConnection();
	try
	{
	
		pstmt=con.prepareStatement("select * from budgetinfo where destination=?");
		pstmt.setString(1, destination);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next())
		{
			p=new beanclass(rst.getInt(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9),rst.getString(10));
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception sql panga:"+e);
		}
		
	finally
	{
		pool.freeConnection(con);
	}
	return p;
	
	
	}
}
