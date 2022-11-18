import java.util.ArrayList;
import java.util.Scanner;

public class Proj_4_3_ParallelFile {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList <String> name =new ArrayList<>();
		ArrayList <Integer> age =new ArrayList<>();
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter a Name:\t");
			String n =input.nextLine();
			name.add(n);
			System.out.println("Enter age:\t");
			int a=input.nextInt();
			age.add(a);
			input.nextLine();
		}
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i)+" is "+age.get(i)+" old ");
		}

	}

}
