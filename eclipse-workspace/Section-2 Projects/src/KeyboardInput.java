import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, city;
		Scanner keyboard = new Scanner(System.in);
		int age, num;
		System.out.println("Enter name: ");
		name = keyboard.nextLine();
		System.out.println("Enter age: ");
		age=keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter a Real Number: ");
		num=keyboard.nextInt();
		num*=2;
		System.out.println("Real Num: "+ num);
		keyboard.nextLine();
		System.out.println("Enter City: ");
		city = keyboard.nextLine();
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("City: "+ city);
		
	}

}
