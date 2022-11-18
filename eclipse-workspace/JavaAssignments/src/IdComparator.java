import java.util.Comparator;

class IdComparator implements Comparator<Employee> {
   public int compare(Employee o1, Employee o2) {
      if (o1.getId() < o2.getId()) {
         return -1;        
      }else if (o1.getId() > o2.getId()) {          
         return 1;
      } else {
         return 0;        
      }
   }
}