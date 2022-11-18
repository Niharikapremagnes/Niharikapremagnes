
public class MethodOverloading {
	public static void main(String []args) {
		int result=getResults(5);
		System.out.println(result);
		result=getResults(5,4);
		System.out.println(result);
		String String_result=getResults("happy","one");
		System.out.println(String_result);
	}

	private static String getResults(String string, String string2) {
		// TODO Auto-generated method stub
		String n=string+" "+string2;
		return n;
	}

	private static int getResults(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	private static int getResults(int i) {
		// TODO Auto-generated method stub
		return i*2;
	}

}
