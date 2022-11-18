package serverClientDao;

import java.sql.*;


public class StudentDAO {
	Connection con=null;
	public void connect() {
		String host="localhost";
		String port="3306";
		try {
			con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/niharika","root","root");
			System.out.println("Connection Successful....");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	public Student getStudent(int rollno){
		Student s=new Student();
		s.rollno=rollno;	
		try {
			String Query="select sname from student where rollno="+rollno;
			//Class.forName("com.sql.jdbc.Driver");
			connect();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(Query);
			rs.next();
			String name=rs.getString(1);
			s.sname=name;
			return s;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		String Query="insert into student values(?,?)";
		try {
			PreparedStatement pst= con.prepareStatement(Query);
			pst.setInt(1,s.rollno);
			pst.setString(2,s.sname);
			pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
