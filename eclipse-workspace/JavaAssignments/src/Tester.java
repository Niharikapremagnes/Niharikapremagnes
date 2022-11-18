import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

	      employees.add(new Employee(1, 2000, "A"));
	      employees.add(new Employee(4, 2600, "D"));
	      employees.add(new Employee(2, 2300, "C"));
	      employees.add(new Employee(3, 2500, "B"));
	      employees.add(new Employee(5, 2400, "E"));
	      employees.add(new Employee(7, 2900, "F"));
	      employees.add(new Employee(9, 2700, "G"));
	      employees.add(new Employee(8, 2100, "H"));
	      employees.add(new Employee(6, 2200, "I"));
	      employees.add(new Employee(10, 2800, "J"));

	      System.out.println("Unsorted List");
	      System.out.println(employees);

	     
	      Collections.sort(employees);

	     
	      System.out.println("Sorted List on Name");
	      System.out.println(employees);
	      
	    //  System.out.println("Reversing the Comparator sorting");  
	      //  Comparator<Employee> cmp = Collections.reverseOrder(new NameComparator()); 
	      
	     Collections.sort(employees, new IdComparator());

	      System.out.println("Sorted List on Id");
	      System.out.println(employees);

	      
	      Collections.sort(employees, new SalaryComparator());

	     
	      System.out.println("Sorted List on Salary");
	      System.out.println(employees);
	   

	}

}
