package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Method;
@WebServlet(urlPatterns = "/updateNew")
public class UpdateUser extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String uid=req.getParameter("uid");
		String n=req.getParameter("name");
		String a=req.getParameter("adress");
		String c=req.getParameter("contact");
		
		RequestDispatcher rd=req.getRequestDispatcher("insert.jsp");
		Method user=new Method();
		user.setUid(uid);
		user.setName(n);
		user.setAdress(a);
		user.setContact(c);
		try 
		{
			int res=user.updateUser();
			if(res==1)
			{
				req.setAttribute("msg", "Succesfully Updated");
			}
			else
			{
				req.setAttribute("msg", "Failed");
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
