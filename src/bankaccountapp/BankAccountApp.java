package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "/home/elarsaks/Desktop/java-course/bankAccounts.csv";
		
		/*
		Checking chkacc1 = new Checking("Tom Wilson", "548615482", 1500);
		Savings savacc1 = new Savings("Rich Lowe", "562485285", 2500);
		
		chkacc1.showInfo();
		savacc1.showInfo();
		*/
		
		// Read CSV file then create new accounts based on that data
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolders) {
			System.out.println("NEW ACCOUNT: ");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
		}
	}

}
