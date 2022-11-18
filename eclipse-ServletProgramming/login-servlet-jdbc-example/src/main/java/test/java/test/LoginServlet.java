package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException{
				PrintWriter pw= res.getWriter();
				res.setContentType("text/html");
				String username=req.getParameter("uname");
				String password=req.getParameter("pswd");
				
				try {
					//boolean status=false;
					Class.forName("oracle.jdbc.driver.OrcaleDriver");	
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost1521:xe","system","root");
					OraclePreparedStatement preparedStatement= (OraclePreparedStatement) con.prepareStatement("select * from Login where username=? and password=?");{
						OracleResultSet rs=(OracleResultSet) preparedStatement.executeQuery();
						if(rs.next()) {
							pw.println("Login Successful");
							RequestDispatcher rd= req.getRequestDispatcher("dis");
							rd.forward(req, res);
						}
						else {
							pw.println("User Login Invalid !!!");
							RequestDispatcher rd= req.getRequestDispatcher("Login.html");
							rd.forward(req, res);
						}
					}
					
					
				}
				catch(SQLException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
