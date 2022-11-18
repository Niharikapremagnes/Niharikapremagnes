
public class Proj_7_3_CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proj_7_3_Circle unit=new Proj_7_3_Circle();
		Proj_7_3_Circle mine=new Proj_7_3_Circle(5);
		Proj_7_3_Circle yours=new Proj_7_3_Circle(12.75);
		PrintCircleData(unit);
		PrintCircleData(mine);
		PrintCircleData(yours);

	}

	private static void PrintCircleData(Proj_7_3_Circle circle) {
		// TODO Auto-generated method stub
		System.out.println("r= "+ circle.getRadius());
		System.out.println("r= "+ String.format("%2f",circle.circumference()));
		System.out.println("r= "+ String.format("%2f",circle.area()));
	}

}
