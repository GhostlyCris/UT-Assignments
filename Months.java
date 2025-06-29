/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 5

# Problem: 1

# Date: 10/06/21 

# Summary: months from march to august with total days

# https://youtu.be/okO8KZh1TP8

*/

import java.util.Scanner;
public class Months {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	// Prompt the user to enter year
	System.out.print("Enter full year (ex:1999): ");
	int year = input.nextInt();
	
	// Prompt the user to enter month
	System.out.print("Enter month as a number between 1 and 12: ");
	int month = input.nextInt();
	
	//Telling month and name
	System.out.println(" ");
	System.out.println("The month is: " + numberOfDaysInAMonth(month) + "\n" 
	+ "And the year is: " + year );
	
	//Initialize variables
	int totalDays = 0;
	int numberOfDaysInMonth = 0;
	totalDays += getNumberOfDaysInMonth(year, month);
	
	//Tell em the correct number of days for any month
	System.out.println("The total days for this month in this year is: " + totalDays);
	totalDays = 0;
	
	//tell em needless things
	System.out.println("");
	System.out.println("Total days was set back to: " + totalDays);
	System.out.println("Using this year: " + year);
	
	run(year,month);
	}
	//Get the month 
	public static String numberOfDaysInAMonth (int month) {
	String monthName = "";
		switch (month %12) {
			case 1: monthName = "January"; break;
			case 2: monthName = "February"; break;
			case 3: monthName = "March"; break;
			case 4: monthName = "April"; break;
			case 5: monthName = "May"; break;
			case 6: monthName = "June"; break;
			case 7: monthName = "July"; break;
			case 8: monthName = "August"; break;
			case 9: monthName = "September"; break;
			case 10: monthName = "October"; break;
			case 11: monthName = "November"; break;
			case 12: monthName = "December";
			}
	//print month's body
	return monthName;
	}
	
	// Get the number of days in a month
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || 
		month == 8 || month == 10 || month == 12)
		return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
		return 30;
		if (month == 2) return isLeapYear(year) ? 29 : 28;
	return 0; // If month is incorrect
	}
	// Determine if it is a leap year 
	public static boolean isLeapYear(int year) {
	return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	//method to just repeat print statements
	public static void run(int year, int month){
	int totalDays = 0;
	//Hardcode the print of March to August
	System.out.println("We are adding all the months from March to August\n");
	System.out.println("Month & Days of Month & Total Days added");
	System.out.println("----------------------------------------");
	for (int x = 3; x<8;x++)
	{
	numberOfDaysInAMonth(month = x);
	totalDays += getNumberOfDaysInMonth(year, x);
	System.out.println( numberOfDaysInAMonth(x) + "\t\t " + getNumberOfDaysInMonth(year, x) + "\t\t" + totalDays );
	}
	return ;	
	}
}