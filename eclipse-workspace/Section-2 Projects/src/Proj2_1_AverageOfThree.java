import java.util.Scanner;

public class Proj2_1_AverageOfThree {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a,b,c,res;
		System.out.println("Enter 3 different numbers to find mean :");
		System.out.println("Enter 1st number:");
		a=input.nextInt();
		System.out.println("Enter 2nd number:");
		b=input.nextInt();
		System.out.println("Enter 3rd number:");
		c=input.nextInt();
		res=(a+b+c)/3;
		
		System.out.println("Mean of the 3 numbers :" + res);
	}
}
