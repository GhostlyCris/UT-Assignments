/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 11

# Problem: 1

# Date: 11/19/21 

# Summary:quotient

#  		Problem 1 (10 Points)
	Write a Java program that meets the following requirements:
		a) Prompts the user to enter two random numbers between 0 and 45.
		   Name the first and second random numbers generated your first name_num1
		   and your last name_num 2 respectively. For example jane_num1 and doe_num2.
		b) Divide the first random number generated with the second random 
		   number generated.
		c) Make sure that if the second number generated is 0, the program throws
		   an Arithmetic exception that reads "sorry bud, we don't accept 0
		   divisors."
		d) Print out the result.
https://youtu.be/XlUGyEj-iVM
*/


import java.util.Scanner;
public class Bases{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Set the quitting condition
		int jo_num1 = 1;
		
		do
		{
		//Ask user to enter two integers
		System.out.println("Please enter the first number that is between 0 and 45.");
		double cris_num1 = input.nextDouble();
		
		System.out.println("Please enter the second number that is between 0 and 45.");
		double zaragoza_num = input.nextDouble();
		
		//check if second number is 0
			if(zaragoza_num != 0)
			{
			System.out.println("The quotient of the two numbers, (" + cris_num1+ " , " + zaragoza_num + ") is: " + 
			String.format("%.5f",(cris_num1/zaragoza_num)));
			System.out.println("-1 to exit.");
			jo_num1= input.nextInt();
			}
			else
			{
			System.out.println("Arithmetic exception: Sorry bud, we don't accept 0 divisors.");
			System.out.println("-1 to exit.");
			jo_num1= input.nextInt();
			}
		
		} while(jo_num1 != -1 );
		
	}
}