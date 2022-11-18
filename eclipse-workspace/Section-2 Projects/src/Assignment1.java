import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n1,n2,n3,n4;
		System.out.println("Enter 1st Real Number: ");
		n1=keyboard.nextInt();
		System.out.println("Enter 2nd Real Number: ");
		n2=keyboard.nextInt();
		System.out.println("Enter 3rd Real Number: ");
		n3=keyboard.nextInt();
		System.out.println("Enter 4th Real Number: ");
		n4=keyboard.nextInt();
		if(n1!=n2 && n2!=n3 && n3!=n4) {
			System.out.println("Different Numbers");
		}
		if(n1>n2||n3>n4||n2>n4) {
			System.out.println("there is a chance for 1 or more greater numbers");
		}
		int sum = n1+n2+n3+n4;
		int diff = n1-n2-n3-n4;
		int mul= n1*n2*n3*n4;
		int div=n1/n2/n3/n4;
		int mod=n1%n2%n3%n4;
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
		
	}

}
