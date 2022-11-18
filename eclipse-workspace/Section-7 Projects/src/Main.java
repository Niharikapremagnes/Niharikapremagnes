/*'import java.util.*;
public class Main {
public static void main(String[] args) {
	BitSet obj=new BitSet(10);
	for(int i=5;i>0;i--) {
		obj.set(i);
		obj.clear(3);
		System.out.println(obj);
	}
}
}*/
class JAVATHREAD implements Runnable{
	public void run() {
		Main.main.notify();
	}
}
class Main implements Runnable{
	public static Main main;
	private int obj;
	public Main() {
		obj=10;
	}
	public void run() {
		System.out.println(main.obj);
	}
	public static void main(String[] args)throws InterruptedException{
	Thread thread1= new Thread(new Main());
	Thread thread2= new Thread(new Main());
	thread1.start();
	thread2.start();
	System.out.println("Thread");
	}
}