package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class DisplayServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws IOException, ServletException{
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		String name=req.getParameter("name");
		pw.println("name= "+name);
		
		
	}
	
}
