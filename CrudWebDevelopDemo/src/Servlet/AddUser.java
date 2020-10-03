package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Method;


@WebServlet(urlPatterns = "/addNew")
public class AddUser extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
		String u=req.getParameter("uid");
		String ne=req.getParameter("name");
		String a=req.getParameter("adress");
		String c=req.getParameter("contact");
		
		RequestDispatcher rd=req.getRequestDispatcher("insert.jsp");
		
		Method user=new Method();
		//Set All value to user object then that value goes to the Method class
		user.setUid(u);
		user.setName(ne);
		user.setAdress(a);
		user.setContact(c);
		try 
		{
			int res=user.addUser();
			if(res==1)
			{
				req.setAttribute("msg", "Success: ");
			}
			else
			{
				req.setAttribute("msg", "Failed: ");
			}
			rd.forward(req, resp);
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
