package bankaccountapp;

public class Savings extends Account{
	// List properties specific to the savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		
		System.out.println("NEW SAVINGS ACCOUNT");
	}
	
	// List any methods specific to savings account
}
