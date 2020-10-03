package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.catalina.User;

import Connection.CrudConnect;

public class Method 
{
	String uid,name,adress,contact;

	public String getUid()
	{
		return uid;
	}

	public void setUid(String uid) 
	{
		this.uid = uid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAdress()
	{
		return adress;
	}

	public void setAdress(String adress) 
	{
		this.adress = adress;
	}

	public String getContact()
	{
		return contact;
	}

	public void setContact(String contact) 
	{
		this.contact = contact;
	}
	public int addUser()throws SQLException
	{
		Connection con=CrudConnect.Connect();
		
		String Sql="insert  into crud values(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(Sql);
		
		ps.setString(1,uid);
		ps.setString(2, name);
		ps.setString(3, adress);
		ps.setString(4, contact);
		
		int res=ps.executeUpdate();
		return res;
	}
	public int updateUser()throws SQLException
	{
		Connection con=CrudConnect.Connect();
		String sql="update crud set name=?,adress=?,contact=? where uid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2,adress);
		ps.setString(3, contact);
		ps.setString(4, uid);
		
		int res=ps.executeUpdate();
		return res;
	}
	public int deleteUser()throws SQLException
	{
		Connection con=CrudConnect.Connect();
		String sql="delete from crud where uid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, uid);
		
		int res=ps.executeUpdate();
		return res;
	}
	/*public ResultSet showByUid()throws SQLException
	{
		Connection con=CrudConnect.Connect();
		String sql="show *from crud where uid=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, uid);
		
		ResultSet rs=ps.executeQuery();
		return rs;
	}*/
	public ArrayList<Method> getAllUser()throws SQLException
	{
		Connection con=CrudConnect.Connect();
		
		String sql="Select *from crud";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		ArrayList<Method> allUser=new ArrayList<>();
		
		while(rs.next())
		{
			String Uid=rs.getString("uid");
			String N=rs.getString("name");
			String a=rs.getString("adress");
			String c=rs.getString("contact");
			
			Method user=new Method();
		
			user.setUid(Uid);
			user.setName(N);
			user.setAdress(a);
			user.setContact(c);
			
			allUser.add(user);
		}
			return allUser;  		
	}
	public Method getUser()throws SQLException
	{
		Connection con=CrudConnect.Connect();
		
		String sql="Select *from crud where uid=?";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, uid);
		
		ResultSet rs=ps.executeQuery();
		Method user=new Method();
		
		if(rs.next())
		{
			String Uid=rs.getString("uid");
			String N=rs.getString("name");
			String a=rs.getString("adress");
			String c=rs.getString("contact");
		
			user.setUid(Uid);
			user.setName(N);
			user.setAdress(a);
			user.setContact(c);
		}
		return user; 
	}
}

