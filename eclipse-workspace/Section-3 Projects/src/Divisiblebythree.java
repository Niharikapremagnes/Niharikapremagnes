import java.util.Scanner;

public class Divisiblebythree {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int in=input.nextInt();
	if(in%3==0) {
		System.out.println(in+" is divisible by 3");
	}
	else {
		System.out.println(in+" is not divisible by 3");	
	}
}
}
