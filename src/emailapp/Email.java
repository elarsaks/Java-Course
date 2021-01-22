package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Constructor to receive firstName & lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// Call method asking for the department - return the department 
		this.department = setDepartment();
		System.out.println("Department is " + this.department);
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES:  \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none \n Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales"; } 
		else if(depChoice == 2) {
			return "dev";}
		else if(depChoice == 3) {
			return "acct";}
		else { return ""; }
	}
	
	// Generate random password
	
	// Set the mailbox capacity
	
	// Set the alternate email
	
	// Change password
}
