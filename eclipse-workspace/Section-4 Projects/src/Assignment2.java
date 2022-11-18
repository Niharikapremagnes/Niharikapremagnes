import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 10 Numbers: ");
		for(int i=0;i<array.length;i++) {
			int in=input.nextInt();
			array[i]=in;
		}
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}


	}

}
