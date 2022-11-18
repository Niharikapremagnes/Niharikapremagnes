import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Proj_8_2_CircleFiles {

	public static void main(String[] args) {
		ArrayList<Proj_7_3_Circle> circleList;
		circleList=new ArrayList<>();
		fillArrayList(circleList);
		printRectangles(circleList);
	}

	private static void printRectangles(ArrayList<Proj_7_3_Circle> circleList) {
		// TODO Auto-generated method stub
		PrintWriter Pw;
		try {
			Pw=new PrintWriter("Circles_output.txt");
		
		for(Proj_7_3_Circle r: circleList) {
			
			System.out.println("Radius: "+ r.getRadius());
			System.out.println("Circumference: " + r.circumference());
			System.out.println("Area: "+ r.area());
			System.out.println();
			
			Pw.println("Radius: "+ r.getRadius());
			Pw.println("Circumference: " + r.circumference());
			Pw.println("Area: "+ r.area());
			Pw.println();
			}
		Pw.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Error accessing File ");
			}
		
		}

	private static  void fillArrayList(ArrayList<Proj_7_3_Circle> circleList) {
		// TODO Auto-generated method stub
		Scanner infile;
		try {
			infile=new Scanner(new File("Rectangle_Data.txt"));
			Proj_7_3_Circle temp;
			double radius;
			while(infile.hasNext()) {
				radius=infile.nextDouble();
				temp=new Proj_7_3_Circle(radius);
				circleList.add(temp);
				}
			infile.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Error accessing File ");
		}
		
	}

}
