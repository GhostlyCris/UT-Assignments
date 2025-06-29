/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 9

# Problem: 2

# Date: 11/02/21 

# Summary: Prime numbers between 7 and 79, decreasing order

#  		Problem 2
	Write a program that displays all the prime numbers
	greater than 7 and less than 79 in decreasing order.(7 points).
	https://youtu.be/tfrsGr7TB-g

*/

import java.lang.Math;
import java.util.Scanner;
public class prime{
	public static void main(String[] args) {
		//Scanner input = new Scanner (System.in);
		System.out.println("The range we are checking primes for are between 7 and 79.");
		// b and a or lower and upper bounds
		//primeVal is the signal / flag that it is prime
		int i, j, primeVal, a, b;
		b = 79;
		a = 7; 
		
		//loop through each number from upper to lower so we can descend
		for(i = b ; i >= a ; i--)
		{   //get rid of non prime or composite numbers
			if (i==1 || i==0)
				continue;
			//flag for prime
			primeVal = 1; 
			
			//check if it is even
			for(j = 2; j <= i /2; ++j)
			{
				if ( i % j == 0)
				{
					primeVal = 0;
					break;
				}
			}
			//flag = 1 means i is prime, 0 is not
			if (primeVal == 1)
				System.out.print(i + "  ");
		}
	}
}