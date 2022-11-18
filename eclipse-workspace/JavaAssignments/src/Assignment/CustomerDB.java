package Assignment;

public class CustomerDB implements Comparable<CustomerDB> {
	 private String CustName;
	   private int id;
	   private int Age;
	   
	   public CustomerDB(String CustName,int id,int Age) {
		   this.setCustName(CustName);
		   this.setId(id);
		   this.setAge(Age);
		   
	   }

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public int compareTo(CustomerDB o) {
		
		return CustName.compareTo(o.CustName);
	}

	public String toString() {
	      return "\n[Id: " + id + ", Age: " + Age + ", name: " + CustName +" ]";
	   }

}
