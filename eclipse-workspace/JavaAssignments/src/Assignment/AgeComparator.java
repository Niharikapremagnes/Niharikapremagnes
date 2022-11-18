package Assignment;
import java.util.Comparator;


class AgeComparator implements Comparator<CustomerDB> {
	   public int compare(CustomerDB o1, CustomerDB o2) {
	      if (o1.getAge() < o2.getAge()) {
	         return -1;        
	      }else if (o1.getAge() > o2.getAge()) {          
	         return 1;
	      } else {
	         return 0;        
	      }    
	   }
	}