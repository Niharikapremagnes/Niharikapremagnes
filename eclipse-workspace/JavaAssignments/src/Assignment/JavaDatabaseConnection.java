package Assignment;

import java.sql.*;

public class JavaDatabaseConnection{
	public static void main(String[] args) throws SQLException{
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from credentials");
		while(rs.next()) {
		System.out.print("Username: ");
		System.out.println(rs.getString("username"));
		System.out.print("Password: ");
		System.out.println(rs.getString("password"));
		}
	}
	
}

