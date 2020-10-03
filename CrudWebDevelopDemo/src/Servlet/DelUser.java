package Servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Method;
@WebServlet (urlPatterns = "/deluser")
public class DelUser extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String uid=req.getParameter("uid");
		Method user=new Method();
		user.setUid(uid);
		RequestDispatcher rd=req.getRequestDispatcher("ShowAll.jsp");
		try {
			int res=user.deleteUser();
			if(res==1)
			{
				req.setAttribute("msg", "Succesfully Deleted");
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
