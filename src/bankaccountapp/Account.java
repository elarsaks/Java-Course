package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name; 
	String sSN;
	double balance;
	String accountNumber;
	double rate;
	
	// Constructor to set base  properties and initialize account
	public Account(String name) {
		System.out.println("NAME:" + name);
		System.out.println("\nNEW ACCOUNT: ");
	}

	// List common methods

}
