package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudConnect 
{
	public static Connection Connect()throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		String url="jdbc:mysql://localhost:3306/crud";
		String user="root";
		String password="";
		
		Connection con=DriverManager.getConnection(url, user, password);
		
		return con;
	}
}
