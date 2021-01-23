package bankaccountapp;

public class Checking extends Account {
	// List properties for checking account
	int debitCaredNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account
	public Checking(String name) {
		super(name);
		System.out.println("NEW CHECKING ACCOUNT");
	}
	// List any methods specific to the checking account

}
