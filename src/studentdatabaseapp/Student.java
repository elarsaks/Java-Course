package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private int studentId;
	private String courses;
	private int tuitionBalance;
	private int costOfCourse;
	
	// Construction: promt student to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name.");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name.");
		this.lastName = in.nextLine();
		
		System.out.println(" 1 - Freshmen\n 2 -for Sophmore\n 3 - for Junior\n 4 - for Senior\nEnter student class level.");
		this.gradeYear = in.nextInt();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear);
	}
	
	// Generate ID
	
	// Enroll in courses
	
	// View balance and pay tuition
	
	// Show status

}
