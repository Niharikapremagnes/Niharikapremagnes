import java.util.ArrayList;
//import java.util.HashSet;

public class CustomerDetaills {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CustomerDB> Custlist=new ArrayList<>();
		Custlist.add(new CustomerDB("kumar",10,22));
		Custlist.add(new CustomerDB("Niharika",1,21));
		Custlist.add(new CustomerDB("Rajesh",3,23));
		Custlist.add(new CustomerDB("Vinod",2,20));
		Custlist.add(new CustomerDB("Bhavya",5,18));
		Custlist.add(new CustomerDB("Bhavani",4,27));
		Custlist.add(new CustomerDB("Agnes",6,24));
		Custlist.add(new CustomerDB("Pavani",7,31));
		Custlist.add(new CustomerDB("Lavanya",9,26));
		Custlist.add(new CustomerDB("Srinivas",8,28));
		
		System.out.println("Unsorted List");
	      System.out.println(Custlist);
		//HashSet<String> set=new HashSet(list);  

	}

}
