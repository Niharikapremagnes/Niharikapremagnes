import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
public class Proj_8_1_RectangleFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> rectangleList;
		rectangleList=new ArrayList<>();
		fillArrayList(rectangleList);
		printRectangles(rectangleList);

	}

	private static void printRectangles(ArrayList<Rectangle> rectangleList) {
		// TODO Auto-generated method stub
		for(Rectangle r: rectangleList) {
			System.out.println("Length: "+ r.getLength());
			System.out.println("Width: "+ r.getWidth());
			System.out.println("Area: "+ r.area());
			System.out.println("Perimeter: "+r.perimeter());
			System.out.println();
			
		}
		
		
	}

	private static void fillArrayList(ArrayList<Rectangle> rectangleList) {
		// TODO Auto-generated method stub
		Scanner infile;
		try {
			infile=new Scanner(new File("Rectangle_Data.txt"));
			Rectangle temp;
			double length;
			double width;
			
			while(infile.hasNext()) {
				length=infile.nextDouble();
				width=infile.nextDouble();
				temp=new Rectangle(length,width);
				rectangleList.add(temp);
			}
			infile.close();
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("Error accessing File ");
		}
		
	}

}
