
public class Proj_7_2_IceCreamDemo {

	public static void main(String[] args) {
		Proj_7_2_IceCream o1= new Proj_7_2_IceCream("Arun",30,2);
		Proj_7_2_IceCream o2= new Proj_7_2_IceCream("Amul",40,5);
		
		o1.addToppings("choco chips");
		o1.addToppings("choco nuts");
		o2.addToppings("choco flakes");
		
		System.out.println(o1.getName());
		System.out.println(o1.getCost());
		System.out.println(o1.getNumScoops());
		o1.printToppings();
		
		
		System.out.println(o2.getName());
		System.out.println(o2.getCost());
		System.out.println(o2.getNumScoops());
		o2.printToppings();
	}

}
