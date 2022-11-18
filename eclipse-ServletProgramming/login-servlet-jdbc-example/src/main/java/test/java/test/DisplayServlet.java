package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	throws IOException, ServletException{
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		String username=req.getParameter("uname");
		pw.println("welcome"+ username);
		
		
	}
	
}
