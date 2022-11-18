
public class Proj_7_3_Circle {
	private double radius;
	
	public Proj_7_3_Circle() {
		this(1.0);
		
	}
	public Proj_7_3_Circle(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double circumference() {
		return 2*Math.PI*radius;
	}
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
}
