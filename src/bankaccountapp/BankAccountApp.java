package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		
		Checking chkacc1 = new Checking("Tom Wilson", "548615482", 1500);
		Savings savacc1 = new Savings("Rich Lowe", "562485285", 2500);
		
		chkacc1.showInfo();
		savacc1.showInfo();
		
		// Read CSV file then create new accounts based on that data

	}

}
