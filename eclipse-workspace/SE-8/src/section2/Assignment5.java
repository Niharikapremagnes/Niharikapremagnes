package section2;

public class Assignment5 implements InterfaceForAssignment {
	public int move() {
		// TODO Auto-generated method stub
		System.out.println("Interface Implementation");
		return id;
	}
	public static void main(String[] args) {
		Assignment5 t=new Assignment5();
		int a=t.move();
		System.out.println(a);
		
	}
	}
