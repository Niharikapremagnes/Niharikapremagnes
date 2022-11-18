import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter("out.txt");
			pw.println("Hello there !");
			pw.println("I'm Niharika");
			pw.println("Holla!");
			pw.close();
		}
		catch(FileNotFoundException ex) {
			System.out.println("Can't write the file !");
			//System.out.println(ex.getMessage());
		}

	}

}
