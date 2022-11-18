package section2;

public class StaticThis {
	
	static int num=0;
	StaticThis(int num){
		this.num=num;
		System.out.println("Num value: "+num);
	}
	static void funct() {
		System.out.println("This is a static method");
	}
	static {
		System.out.println("Running a static initialization block");
		num++;
	}
	public static void main(String []args) {
		StaticThis in= new StaticThis(10);
		in.funct();
		
	}

}
