import java.util.Scanner;

public class NameParser {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your first name along with your last name:");
		String name=input.nextLine();
		int indexOfSpace=name.indexOf(" ");
		String firstname=name.substring(0,indexOfSpace);
		String lastname=name.substring(indexOfSpace + 1);
		firstname=firstname.toUpperCase();
		lastname=lastname.toLowerCase();
		System.out.println("Full name : "+ name);
		System.out.println("First name : "+firstname);
		System.out.println("last name : "+lastname);
	}

}
