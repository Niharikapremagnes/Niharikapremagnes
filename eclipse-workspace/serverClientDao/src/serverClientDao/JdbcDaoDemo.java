package serverClientDao;

public class JdbcDaoDemo {
	
	public static void main(String[] args) {
		StudentDAO dao=new StudentDAO();
		Student s1=dao.getStudent(160405);
		System.out.println(s1.sname);
		Student s2=new Student();
		s2.rollno=160873;
		s2.sname="Kumar";
		dao.connect();
		dao.addStudent(s2);
	}

	

}
