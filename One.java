/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 13

# Problem: 2

# Date: 12/2/21 

# Summary: dividing till its less than one

#  	Problem 1
	 Use recursion to write a Java program that takes a 
     positive number as an input and keeps dividing that number
     by 2 until the result is less than 1, at which time
	output the result.	 (7 points) 
*	
	
*	(8 Points.)
https://youtu.be/7KOfA5G3K30
*/
import java.util.Scanner;
public class One{
	//method for division
	public static double rec(double num)
	{	
		//check if num is less than 1
		if(num < 1.0) //base case
			return num; //last num
		//System.out.println(num);
		return rec(num/2);
	}
	//recursion - calling on one's own method till base case is met
	
	public static void main(String[] args)
	{
		//create scanner
		Scanner input = new Scanner(System.in);
		double number = 0;
		System.out.println("Give us a number and we will divide it till its less than one.");
		number = input.nextDouble();
		if(number <0)
		{
			System.out.println("Please enter a positive number.");
			main(args);
		}
		else
			System.out.println("The remaining number is :" + rec(number));
	}
}