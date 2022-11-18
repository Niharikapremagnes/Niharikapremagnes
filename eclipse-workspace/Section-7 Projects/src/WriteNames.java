import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class WriteNames {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("Niharika");
		names.add("Prem");
		names.add("Agnes");
		names.add("Pidithi");
		names.add("Lucky");
		names.add("bhavya");
	try {
		PrintWriter pw = new PrintWriter("Names.txt");
		for(String name: names) {
			//System.out.println(name);
			pw.println(name);
		}
		pw.close();
		}
	catch(FileNotFoundException ex) {
		System.out.println("Can't write the file !");
	}
		
	}
	}
