package factory;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class ConnectionPool 
{
	Connection con;
	DataSource ds;
	public ConnectionPool()
	{
		try{
		InitialContext ic=new InitialContext();
		ds=(DataSource)ic.lookup("java:comp/env/jdbc/mysql");
		}
		catch(Exception e){}
	}
	public Connection  getConnection()
	{
		try{
			con=ds.getConnection();
		}catch(SQLException e){}
		return con;
	}
	public void freeConnection(Connection con)
	{
		try{
			con.close();
		}
		catch(Exception e){}
	}

}
