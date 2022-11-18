import java.util.Scanner;

public class Assignment_2_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Rating 1-5: ");
		int in=input.nextInt();
		if(in<3) {
			System.out.println("Bad Rating");
		}
		else {
			System.out.println("Good Rating or Average Rating ");
		}
	}

}
