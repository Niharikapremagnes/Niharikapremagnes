import java.util.ArrayList;
import java.util.Scanner;

public class Proj_4_2_ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList <Integer> nums =new ArrayList<>();
		System.out.println("Enter 0 or more to put into the list or -1 to exit ");
		int in=input.nextInt();
		
		while(in>=0) {
				nums.add(in);
				System.out.println("Enter 0 or more to put into the list or -1 to exit ");
				in=input.nextInt();
		}
		System.out.println("Exited!");
		for(int names: nums) {
			System.out.println(names);
		}
			

	}

}
