
public class House {
	private static int NumStories;
	private static int NumWindows;
	private static String Color;
	
	public House() {
		NumStories=1;
		NumWindows=4;
		Color="gray";
	}
	
	public static int getNumStories() {
		return NumStories;
	}
	public static void setNumStories(int numStories) {
		NumStories = numStories;
	}
	public static int getNumWindows() {
		return NumWindows;
	}
	public static void setNumWindows(int numWindows) {
		NumWindows = numWindows;
	}
	public static String getColor() {
		return Color;
	}
	public static void setColor(String color) {
		Color = color;
	}
	
}
