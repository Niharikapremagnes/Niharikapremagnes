import java.util.Scanner;

public class Fraternity {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to Fraternity Social Organization");
		System.out.println("Enter your Age: ");
		int age=input.nextInt();
		System.out.println("Enter your Gender: M/F ?");
		char gender= input.next().charAt(0);
		if(age>=19 && gender=='M'|| gender=='m') {
				System.out.println("You are Eligible, You can join fraternity !");
	}
		else {
			System.out.println("Not eligible !!");
		}
	}
}
