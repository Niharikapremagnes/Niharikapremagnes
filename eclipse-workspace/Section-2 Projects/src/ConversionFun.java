
public class ConversionFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myDouble=3.14;
		float myFloat= (float)3.14;
		System.out.println(myFloat);
		float myFloat1= 3.14f;//narrowing/lossy conversion
		double float1=myFloat1; // widening / loss less conversion
		System.out.println(float1);

	}

}
