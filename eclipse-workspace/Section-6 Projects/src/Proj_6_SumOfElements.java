import java.util.ArrayList;

public class Proj_6_SumOfElements {

	public static void main(String[] args) {
		ArrayList<Integer> somelist=new ArrayList<>();
		somelist.add(10);
		somelist.add(22);
		somelist.add(55);
		somelist.add(121);
		int sum=sumElements(somelist);
		System.out.println("sum: " + sum);

	}
	public static int sumElements(ArrayList<Integer> list) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		return sum;
	}

}
