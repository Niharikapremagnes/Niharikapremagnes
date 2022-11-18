import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int guesscount=0;
		Random random = new Random();
		int compnum=random.nextInt(101)+1;
		int ourguess;
		boolean guessnum=false;
		while(!guessnum) {
			System.out.println("Enter your Guessed Integer: ");
			ourguess=input.nextInt();
			guesscount++;
			if(ourguess>=1 && ourguess<=100) {
				if(ourguess==compnum) {
					System.out.println("Congratualations ! you have guessed in " + guesscount +" Attempts.Thanks for playing !");
					guessnum=true;
				}
				else if(ourguess>compnum) {
					System.out.println("Your guess was high!");
				}
				else {
					System.out.println("Your guess was low");
				}
			}
			else {
				System.out.println("That was a wasted guess! you must pick between 1 and 100 inclusive!");
			}
			
			
		}
		
	}
}
