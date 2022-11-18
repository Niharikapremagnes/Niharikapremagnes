import java.util.ArrayList;
import java.util.Scanner;

public class Proj_5_NamesPermutations {

public static void main(String[] args) {
		
		ArrayList<String> FirstNames=new ArrayList<>();
		ArrayList<String> LastNames=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		String fullname;
		String Firstname;
		String Lastname;
		int indexOfSpace;
		final int Num_Names=5;
		
		for(int i=0;i<Num_Names;i++) {
		System.out.println("please enter name " +i +": \t");
		fullname=input.nextLine();
		indexOfSpace=fullname.indexOf(" ");
		Firstname=fullname.substring(0, indexOfSpace);
		Lastname=fullname.substring(indexOfSpace + 1);
		FirstNames.add(Firstname);
		LastNames.add(Lastname);
		}
		for(int i=0; i<FirstNames.size();i++) {
			for(int j=0;j<LastNames.size();j++) {
			System.out.println(FirstNames.get(i) + " "+ LastNames.get(j));
			
		}}
}}
