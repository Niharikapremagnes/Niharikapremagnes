import java.util.concurrent.TimeUnit;
public class AppleTree {

	

	public static AppleTree[] newTreeGarden(int size) {
		AppleTree[] appleTrees=new AppleTree[size];
		for(int i=0;i<appleTrees.length;i++) {
			appleTrees[i]=new AppleTree("Apple tree"+i);
		}
		return appleTrees;
	}

	private final String treeLabel;
	private final int numberOfApples;

	public AppleTree(String treeLabel) {
		this.treeLabel=treeLabel;
		numberOfApples=3;
	}


public int pickApples(String workerName) {
	try {
		System.out.printf("started picking apples from %s \n", treeLabel);
		TimeUnit.SECONDS.sleep(1);
		System.out.printf("picked %d apples from %s \n ", numberOfApples, treeLabel);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	return numberOfApples;
}



 }


