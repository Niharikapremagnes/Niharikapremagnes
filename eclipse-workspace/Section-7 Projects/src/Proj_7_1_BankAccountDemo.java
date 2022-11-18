
public class Proj_7_1_BankAccountDemo {

	public static void main(String[] args) {
		Proj_7_1_BankAccount c1=new Proj_7_1_BankAccount("Niharika");
		Proj_7_1_BankAccount c2=new Proj_7_1_BankAccount("Niharika Prem Agnes", 40000);
		
		System.out.println(c1.getOwner());
		System.out.println(c1.deposit(1000));
		System.out.println(c2.getOwner());
		System.out.println(c2.deposit(1000));
		System.out.println(c1.withDrawal(1000));
		System.out.println(c2.withDrawal(1000));
		
		
		
	}

}
