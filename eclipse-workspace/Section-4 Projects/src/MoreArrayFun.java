
public class MoreArrayFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		for(int i=0;i<array.length;i++) {
			array[i]=i+1;
		}
		for(int num:array) {
			System.out.println(num);
		}
	}

}
