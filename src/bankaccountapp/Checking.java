package bankaccountapp;

public class Checking extends Account {
	// List properties for checking account
	int debitCaredNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
	}
	
	// List any methods specific to the checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Cheking \n");
	}

}
