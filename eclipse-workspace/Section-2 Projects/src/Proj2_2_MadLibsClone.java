import java.util.Scanner;

public class Proj2_2_MadLibsClone {

	public static void main(String[] args) {
		String adjective1, girls_name, adjective2, occupation1, place, clothing, hobby;
		String adjective3, occupation2, boys_name, mans_name;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter adjective 1:");
		adjective1 = input.nextLine();
		System.out.println("Enter girls name:");
		girls_name = input.nextLine();
		System.out.println("Enter adjective 2:");
		adjective2 = input.nextLine();
		System.out.println("Enter Occupation 1:");
		occupation1 = input.nextLine();
		System.out.println("Enter place:");
		place = input.nextLine();
		System.out.println("Enter clothing:");
		clothing = input.nextLine();
		System.out.println("Enter hobby:");
		hobby = input.nextLine();
		System.out.println("Enter adjective 3:");
		adjective3 = input.nextLine();
		System.out.println("Enter Occupation 2:");
		occupation2 = input.nextLine();
		System.out.println("Enter Boys name:");
		boys_name = input.nextLine();
		System.out.println("Enter mans name:");
		mans_name = input.nextLine();
		System.out.println();
		System.out.print("There once was a " + adjective1 + " girl named "+ girls_name +", who was a " + adjective2 +" "+  occupation1 + " in the Kingdom of " + place+".");
		System.out.print(" She loved to wear "+ clothing + " and to "+ hobby + ". She wanted to marry the "+ adjective3 +" "+ occupation2+ " named "+ boys_name + " but her father, King "+ mans_name + " forbid her from seeing him.");
	}

}
