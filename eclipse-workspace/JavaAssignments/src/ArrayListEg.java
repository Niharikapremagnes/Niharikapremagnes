import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> namelist =new ArrayList<>();
		namelist.add("Niharika");
		namelist.add("prem");
		namelist.add("agnes");

		for(String names: namelist) {
			System.out.println(names);
		}
	}

}