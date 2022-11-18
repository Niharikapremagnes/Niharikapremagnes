import java.sql.*;


public class JavaDatabaseConnection {
public static void main(String[] args) throws SQLException{	
	try {
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from credentials where scenario='rewardscard'");
		while(rs.next()) {
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		}}
	catch(SQLException e) {
		System.out.println(e);
	}
}}
