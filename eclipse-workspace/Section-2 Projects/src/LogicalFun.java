
public class LogicalFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isRaining = false;
		boolean isWarm = true;
		boolean combined = isRaining && isWarm;
		System.out.println(combined);
		boolean combined1 = isRaining || isWarm;
		System.out.println(combined1);
		boolean combined2 = !isRaining;
		System.out.println(combined2);

	}

}
