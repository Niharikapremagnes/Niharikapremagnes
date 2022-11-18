
public class StringMethod1 {

	public static void main(String[] args) {
		String name="Niharika";
		String compared="John Baugh";
		for(int i=0; i<name.length();i++) {
			System.out.print(name.charAt(i)+" ");
		}
		System.out.println();
		if(name.compareTo(compared)>0) {
			System.out.println("name > compared");	
		}
		else {
			System.out.println("name <= compared");
		}
	}

}
