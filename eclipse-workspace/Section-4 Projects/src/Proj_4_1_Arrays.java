import java.util.Scanner;

public class Proj_4_1_Arrays {
	public static void main(String[] args) {
		int array[]=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any 5 Numbers: ");
		for(int i=0;i<array.length;i++) {
			int in=input.nextInt();
			array[i]=in;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println("Entered 5 Numbers are: "+ array[i]*2);
		}
		
	}

}
