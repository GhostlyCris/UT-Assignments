/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 7

# Problem: 1

# Date: 10/19/21 

# Summary: Schedule 

#  	Problem 1
	
	Write a program that asks the user to enter the number of employees
	in an organization, the employees' names, and the number of hours they
	worked during the week from Monday through Friday. The program should
	display the names of employees and the total number of hours
	they worked in the week.
	
   (10 Points.)
https://youtu.be/t6bftIoBllQ
*/

import java.util.Scanner;
public class Schedule{
	public static void main(String[] args) {
		//Start looking for thingies
		Scanner input = new Scanner (System.in);
		//Say something familiar
		System.out.println("Please enter the number of employees in your organization.");
		//Grab a number
		int n = input.nextInt();
		//Start 2 new 
		String [] Name = new String [n];
		int [] hWorked = new int [n];
		//loop the grabbing of unsightly information
		for (int i = 0; i<Name.length; i++)
		{
			System.out.println("Please enter the first name of the employee and hours worked\nfrom Monday through Friday.\n\n");
			Name[i] = input.next();
			hWorked[i] = input.nextInt();
		}
		//loop the printing in order
		for(int i = 0; i < Name.length; i++)
		{
			System.out.println(Name[i] + "\t" + hWorked[i]);
		}
	}
}
