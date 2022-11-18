import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Dept name:");
		String name=input.nextLine();
		switch(name){
		case "CSE":
		case "cse":
			System.out.println("You had a Cultural Event This event");
			break;
		case "ECE":
		case "ece":
			System.out.println("You had a technical Event tomorrow");
			break;
		case "MECH":
		case "mech": 
			System.out.println("You had a Workshop this weekend");
			break;
		default: System.out.println("Enter Correct Dept Name");
		}
	}

}
