import java.util.Scanner;

class primecal implements Interface1{
	public int testNum(int num) {
		int count=0;
		for(int i=1;i<=num;i++)
		{
		   if(num%i==0)
		   {
		        count++;	        
		   }
		}
		if(count==2)
		       System.out.println("prime number ");
		else
		System.out.println("Not a prime number "); 
		return 0;
	}
	
}
public class Prime extends primecal{
	public static void main(String args[]) {
		int num=9;
		Scanner input= new Scanner(System.in);
		primecal in= new primecal();
		in.testNum(num);
		
	}

	
	

}
