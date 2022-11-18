import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Callable;

public class PickFruitsWithInvokeAll {
	public static void main(String[] args) {
		AppleTree[] appleTrees= AppleTree.newTreeGarden(6);
		
		Callable<Void> applePicker1=createApplePicker(appleTrees,0,2,"Alex");
		Callable<Void> applePicker2=createApplePicker(appleTrees,2,4,"Bob");
		Callable<Void> applePicker3=createApplePicker(appleTrees,4,6,"Carol");
		
		ForkJoinPool.commonPool().invokeAll(asList(applePicker1,applePicker2,applePicker3));
		
		System.out.println();
		System.out.println("All fruits colleted !");
	}

	private static Collection asList(Callable<Void> applePicker1, Callable<Void> applePicker2,
			Callable<Void> applePicker3) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Callable<Void> createApplePicker(AppleTree[] appleTrees, int fromIndexInclusive, int toIndexExclusive, String workerName) {
		// TODO Auto-generated method stub
		return()->{
			for(int i=fromIndexInclusive;i<toIndexExclusive;i++) {
				appleTrees[i].pickApples(workerName);
			}
			return null;
		};
		
	}
}
	