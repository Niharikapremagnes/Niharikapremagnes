import java.util.Scanner;

public class SumFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int input, sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Non-negative Number to sum :");
		System.out.println("Or Enter Negative Number to exit:");
		input=in.nextInt();
		while(input>=0) {
			sum+=input;
			System.out.println("Enter a Non-negative Number to sum :");
			System.out.println("Or Enter Negative Number to exit");
			input=in.nextInt();
		}
		System.out.println("Sum is : " + sum);

	}

}
