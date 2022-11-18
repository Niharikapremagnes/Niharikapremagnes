import java.util.Random;

public class FunWith2DArrays {

	public static void main(String[] args) {
		int[][] my2DArray= new int[2][3];
		fill2DArray(my2DArray);		
		PrintArray(my2DArray);
		twice2DArray(my2DArray);
		PrintArray(my2DArray);

	}
	
	private static void fill2DArray(int[][] my2dArray) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for(int i=0;i<my2dArray.length;i++) {
			for(int j=0;j<my2dArray[i].length;j++) {
			my2dArray[i][j]=rand.nextInt(100);	
			}
		}
		twice2DArray(my2dArray);
	}
	private static void PrintArray(int[][] my2dArray) {
		// TODO Auto-generated method stub
		for(int []arr: my2dArray) {
			for(int num:arr) {
				System.out.print(num+ " ");
			}
			System.out.println();
		}
		
		
	}
	public static void twice2DArray(int [][]array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
			array[i][j]*=array[i][j];	
			}
		}
	}
	
}
