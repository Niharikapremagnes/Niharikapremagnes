
public class HouseDemo {
	public static void main(String[] args) {
	House myHouse=new House();
	House yourHouse=new House();
	
	myHouse.setNumStories(2);
	myHouse.setNumWindows(6);
	myHouse.setColor("red");
	
	printHouseData(myHouse);
	System.out.println();
	printHouseData(yourHouse);
	
	/*yourHouse.setNumStories(3);
	yourHouse.setNumWindows(10);
	yourHouse.setColor("blue");*/
	
	/*System.out.println("My House is "+ myHouse.getColor() + " and has " +myHouse.getNumStories()+" Stories and "+ myHouse.getNumWindows() + " windows.");
	System.out.println();
	System.out.println("Your House is "+ yourHouse.getColor() + " and has " +yourHouse.getNumStories()+" Stories and "+ yourHouse.getNumWindows() + " windows.");*/
	
}
	public static void printHouseData(House house) {
		System.out.println("House is "+ House.getColor() +
				" \nand has " +House.getNumStories()+"  Stories and "+
				"\n"+ House.getNumWindows()+" windows.");
	}
}
