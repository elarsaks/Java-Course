package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name; 
	String sSN;
	double balance;
	
	static int index = 10000;
	String accountNumber;
	double rate;
	
	// Constructor to set base  properties and initialize account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println(getBaseRate());
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}

	// List common methods - transactions
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("\nDepositing $" + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now $" + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"\nNAME: " + name + 
				"\nACCOUNT NUMBER: " + accountNumber + 
				"\nBALANCE: " + balance + 
				"\nRATE; " + rate + "%"
				);
	}

}
