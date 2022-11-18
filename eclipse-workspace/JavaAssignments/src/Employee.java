class Employee implements Comparable<Employee> {
   private int id;
   private int salary;
   private String name;

   public Employee(int id, int salary, String name) {
      this.id = id;
      this.salary = salary;
      this.name = name;
   }

   public int compareTo(Employee o) {        
      return name.compareTo(o.name);
   }

   public String toString() {
      return "\n[Id: " + id + ", salary: " + salary + ", name: " + name +" ]";
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getSalary() {
      return salary;
   }

   public void setSalary(int salary) {
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}