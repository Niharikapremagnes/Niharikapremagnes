package section2;

public class FinalProduct implements SeriesMarkerInterface,FunctionalInterface {

	public FinalProduct(int pid,String pname, double pcost) {
		FinalProduct.p_id=pid;
		FinalProduct.p_name=pname;
		FinalProduct.p_cost=pcost;
	}
	public static void main(String[] args) {
		FunctionalInterface p1;
		p1=new FinalProduct(2,"Niharika Prem Agnes",200);
		
		showDetails();

	}

	public static String showDetails() {
		// TODO Auto-generated method stub
		System.out.println(a);
		System.out.println("Pid: " + p_id + " Pname: "+ p_name+ " Pcost: "+p_cost);
		return null;
	}

}
