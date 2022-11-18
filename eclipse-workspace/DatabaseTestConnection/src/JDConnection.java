import java.sql.*;

public class JDConnection {

	public static void main(String[] args) throws SQLException {
		try {
		Class.forName("com.sql.cj.jdbc.Driver");	
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo","root","root");
		Statement s=con.createStatement();
		String sql="select * from credentials where scenario='zerobalancecard'";
		ResultSet rs=s.executeQuery(sql);
		while(rs.next()) {
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		}
	}
		catch(SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
