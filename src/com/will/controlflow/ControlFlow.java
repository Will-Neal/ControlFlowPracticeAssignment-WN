package com.will.controlflow;


import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		//checkLessThan();
		//checkLessOrGreater();
		//checkTenOrTwenty();
		//checkGrades();
		//checkDayOfTheWeek();	
		calculateIncomeTax();
		}
	
	static void checkLessThan() {
		int x = 7;
		if (x<10) {
			System.out.println("Less than 10");
		}
	}
	
	static void checkLessOrGreater() {
		System.out.println("===============");
		int x = 15;
		if (x<10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
	}
	
	static void checkTenOrTwenty() {
		System.out.println("===============");
		int x = 15;
		if (x>=20) {
			System.out.println("Greater than or equal 20");
		} else if (x>10) {
			System.out.println("Greater than 10 but less than 20");
		} else {
			System.out.println("Less than 10");
		}	
	}
	
	static void checkGrades() {
		Scanner userGrade = new Scanner(System.in);
		System.out.println("Enter grade: ");
		int grade = userGrade.nextInt();
		if (grade > 100) {
			System.out.println("Score out of range");
		} else if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else if (grade >= 0) {
			System.out.println("F");
		} else {
			System.out.println("Score out of range");
		}
		userGrade.close();
	}
	
	static void checkDayOfTheWeek() {
		Scanner userDay = new Scanner(System.in);
		System.out.println("Enter 1-7 to receive corresponding day: ");
		int dayNum = userDay.nextInt();
		switch (dayNum){
		case 1: 
			System.out.println("Monday");
			break;
		case 2: System.out.println("Tuesday");
			break;
		case 3: System.out.println("Wednesday");
			break;
		case 4: System.out.println("Thursday");
		 	break;
		case 5: System.out.println("Friday");
			break;
		case 6: System.out.println("Saturday");
			break;
		case 7: System.out.println("Sunday");
			break;
		default: System.out.println("Day out of Range");
			break;
		}
		userDay.close();
	}
	static void calculateIncomeTax() {
		Scanner userTax = new Scanner(System.in);
		System.out.println("Enter your income: ");
		int income = userTax.nextInt();
		System.out.println("What is your filing status: /n1 = Single; 2 = Married Filing Jointly or Qualified Widower; 3 = Married filing separately; 4 = Head of Household");
		int filingStatus = userTax.nextInt();
		int taxRate = 0;
		
		switch (filingStatus) {
		case 1: if( income >= 327916 ){
			taxRate = 35;
		} else if (income >= 171551) {
			taxRate = 33;
		} else if (income >= 82251) {
			taxRate = 28;
		} else if (income >= 33951) {
			taxRate = 25;
		} else if (income >= 8351) {
			taxRate = 15;
		} else {
			taxRate = 10;
		} break;
		case 2: if( income >= 327916 ){
			taxRate = 35;
		} else if (income >= 208851) {
			taxRate = 33;
		} else if (income >= 137051) {
			taxRate = 28;
		} else if (income >= 67901) {
			taxRate = 25;
		} else if (income >= 16701) {
			taxRate = 15;
		} else {
			taxRate = 10;
		} break;
		
		case 3: if( income >= 186476 ){
			taxRate = 35;
		} else if (income >= 104426) {
			taxRate = 33;
		} else if (income >= 68526) {
			taxRate = 28;
		} else if (income >= 33951) {
			taxRate = 25;
		} else if (income >= 8351) {
			taxRate = 15;
		} else {
			taxRate = 10;
		} break;
		
		case 4: if( income >= 327916 ){
			taxRate = 35;
		} else if (income >= 190201) {
			taxRate = 33;
		} else if (income >= 117451) {
			taxRate = 28;
		} else if (income >= 45501) {
			taxRate = 25;
		} else if (income >= 11951) {
			taxRate = 15;
		} else {
			taxRate = 10;
		} break;
		
		default: System.out.println("Enter a valid filing status");
		  break;
		}
		
		double taxAmount = income * taxRate / 100.00;
		System.out.printf("You owe $%.2f", taxAmount + " in taxes");
		userTax.close();
	}
}
