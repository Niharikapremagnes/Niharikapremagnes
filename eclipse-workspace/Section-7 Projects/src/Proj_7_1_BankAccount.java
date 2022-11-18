
public class Proj_7_1_BankAccount {
	private String owner;
	private int balance=2000;
	private int amount=0;
	public Proj_7_1_BankAccount(String owner) {
		this(owner,0);
		
	}
	public Proj_7_1_BankAccount(String owner, int balance) {
		this.owner=owner;
		this.balance=balance;	
	}
	public int deposit(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(amount+" credited");
		}
		else {
			System.out.println("Error! Deposit money more than Rs.0");
		}
		return balance;
		
	}
	public int withDrawal(int amount) {
		if(amount>0 && amount<balance) {
			balance-=amount;
			System.out.println(amount+" debited");
		}
		else {
			System.out.println("Insufficient balance");
		}
		return balance;
		
	}
	public String getOwner() {
		return owner;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getAmount() {
		return amount;
	}
}
