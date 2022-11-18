
public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Count Down Method");
		countDown(10);
		System.out.println("Count Up Method");
		countUp(2,8);

	}

	private static void countUp(int i, int j) {
		// TODO Auto-generated method stub
		
		if(i<=j) {
			
			System.out.println(i);
			countUp(i+1,j);
		}
		
	}

	private static void countDown(int i) {
		// TODO Auto-generated method stub
		
		if(i>=0) {
			
			System.out.println(i);
			countDown(i-1);
		}
		
	}

}
