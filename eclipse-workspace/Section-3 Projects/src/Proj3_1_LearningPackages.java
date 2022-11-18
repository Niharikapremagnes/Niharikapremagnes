import java.util.Scanner;

public class Proj3_1_LearningPackages {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int packnum,numcourse,basecost=0,costpercourse=0,numincluded = 0,totalcost=0;
		System.out.println("Welcome to Learning Program !");
		System.out.println("Learning Package1: $10 per month\nincludes 2 courses per month (each additional course is $6)");
		System.out.println("Learning Package2: $12 per month\nincludes 4 courses per month (each additional course is $4)");
		System.out.println("Learning Package3: $15 per month\nincludes 6 courses per month (each additional course is $3)");
		System.out.println("Which of the packages do you want ? 1/2/3");
		 packnum=input.nextInt();
		System.out.println("How many courses did you enroll this month ?");
		numcourse=input.nextInt();
		switch(packnum) {
		case 1: basecost=10;costpercourse=6;numincluded=2;
		if(numcourse>numincluded) {
			totalcost=basecost+(numcourse-numincluded)*costpercourse;
		}
		else {
			totalcost=basecost;
		}
		System.out.println("total cost is :$"+totalcost);
		break;
		case 2: basecost=12;costpercourse=4;numincluded=4;
		if(numcourse>numincluded) {
			totalcost=basecost+(numcourse-numincluded)*costpercourse;
		}
		else {
			totalcost=basecost;
		}
		System.out.println("total cost is :$"+totalcost);
		break;
		case 3: basecost=15;costpercourse=3;numincluded=6;
		if(numcourse>numincluded) {
			totalcost=basecost+(numcourse-numincluded)*costpercourse;
		}
		else {
			totalcost=basecost;
		}
		System.out.println("total cost is :$"+totalcost);
		break;
		default: System.out.println("Enter valid package number");		
		}
		
		
}
}