import java.util.ArrayList;

public class Proj_7_2_IceCream {
	private String name;
	private int cost;
	private int numScoops;
	private ArrayList<String> toppings;
	
	public Proj_7_2_IceCream(String name,int cost,int numScoops) {
		this.name=name;
		this.cost=cost;
		this.numScoops=numScoops;	
		this.toppings=new ArrayList<>();
	}
	public void addToppings(String topping) {
		toppings.add(topping);
		//return topping;
		
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	public int getNumScoops() {
		return numScoops;
	}
	public void printToppings() {
		for(String tops: toppings) {
			System.out.println(tops);
		}
	
		
	}
}
