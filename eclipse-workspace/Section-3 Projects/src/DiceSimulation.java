import java.util.Random;

public class DiceSimulation {
public static void main(String[] args) {
	Random random=new Random();
	int count=0;
	while(count<10) {
		int dice=random.nextInt(6)+1;
		System.out.println(dice);
		count++;
	}
	}
}
