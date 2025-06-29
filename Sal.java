/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 13

# Problem: 1

# Date: 12/2/21 

# Summary: Play with salaries

#  	Problem 1
	Write a Java program that has an array representing salaries
	between 0 and 75000. Assume there are 10 people earning salaries.
	Write a recursive method that returns the average of all the 
	salaries(8 points).
*	
	
*	(8 Points.)
https://youtu.be/7KOfA5G3K30
*/

import java.util.Scanner;
public class Sal{
	//recursive compute average of sal[]   rec == recursion == to average salary
	static double rec(double sal[],int i, int j) // i ==end   j==size
	{
		//last element
		if (i == j-1)
			return sal[i];
		//when 0. divide sum total so far by j-1
		if (i == 0)
            return ((sal[i] + rec(sal, i+1, j))/j);
		
		//sum
		return (sal[i] + rec(sal, i + 1, j));
	}
	
	public static void main(String[] args) {
		//create scanner
		Scanner input = new Scanner(System.in);
		//talk to end user
		//System.out.println("Please enter number of salaries to be entered.");
		int size = 10; //input.nextInt(); //later adjust so it can be any size
		
		//initialize a size
		System.out.println("Please enter 10 salaries so they can be averaged.");
		System.out.println("Salaries between 0 and 75000, please.");
		//initialize array and num check
		double [] salaries= new double[size];
		double num =0;
		//loop adding salaries into array
		for(int i =0; i < size; i++)
		{
			num = input.nextDouble();
			//check if number is in range
			if(num >= 0 && num <=75000)
				salaries[i] = num;
			else {
				System.out.println("Enter a value within the range.");
				num = input.nextDouble();
				salaries[i] = num;
			}
		}
		//talk and give average
		System.out.println("The average of the salaries is: " + rec(salaries,0,size));
	}
}