/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 6

# Problem: 1

# Date: 10/12/21 

# Summary: Play with bills

#  	Problem 1
	Write a Java method that asks the user to enter monthly
	bills for 1) the internet and 2) gas over a period of 12 months.
	The program computes the average of the two bills and  prints
	out a) the lowest monthly bill, b) the highest monthly bill,
    c) the average monthly bill, and d)	the number of monthly bills
	below the average.	
*	
	
*	(8 Points.)
https://youtu.be/RHfTvY0dZ_c
*/


import java.lang.Math;
import java.util.Scanner;
public class Bills{
		public static void main(String[] args) {
			internet();
			gas();
		}
		//method for internet
	public static String internet(){
		//Scanner input
		Scanner input = new Scanner (System.in);
		//initial variables
		double internet, high, low, average, totBills, hInternet, lInternet;
		int counter = 0;
		internet = 0;
		hInternet = 0;
		lInternet = 0;
		totBills = 0;
		high = internet;
		low = 600;
		//print statement
		System.out.println("Please enter your 12 bills for the internet.");
		//for loop the if statements and print statements
		for (int i = 0; i<12; i++)
		{
			System.out.println("Please enter your monthly bill: ") ;
			internet = input.nextDouble();
			totBills += internet;
			if (internet >= 0)
			{       //count
					counter++;
					//compare last high bill with internet to see which is higher using the max method
				if (Math.max(internet,high) != high)
				{
					//update the highest bill
					high = internet;
					hInternet = counter;
				}
					//compare last low bill with internet to see which is lower using the min method
				if (Math.min(internet, low) !=low)
				{
					low = internet;
					lInternet = counter;
				}
			}
		}
		//calculate average
		average = totBills / counter ;
		//print stuff
		System.out.println("The lowest bill is: " + low + " And the month was the: " + lInternet);System.out.println("The highest bill is: " + high + " And the month was the: " + hInternet);
		System.out.println("The average of the bills are: " + String.format("%.2f",average));
		System.out.println("The total of the bills are: " + totBills + " From a total of 12 bills.");
		return "complete";
	}
   //method for gas is same as internet
	public static String gas(){
		//scanner 
		Scanner input = new Scanner (System.in);
		//inital variables
		double gas, high, low, average, totBills, hgas, lgas;
		int counter = 0;
		gas = 0; 
		hgas = 0; 
		lgas = 0;
		totBills = 0;
		high = gas;
		low = 600;
		
		//print
		System.out.println("Please enter your 12 bills for the gas.");
		//loop
		for (int i = 0; i < 12; i++)
		{   //keep printing and checking and comparing
			System.out.println("Please enter your monthly bill: ") ;
			gas = input.nextDouble();
			totBills += gas;
			//checks
			if (gas >= 0)
			{
					counter++;
					//compare last high with gas bill using the max method
				if (Math.max(gas,high) != high)
				{
					high = gas;
					hgas = counter;
				}
				//update the lowest bill for gas with low if the new entered bill is lower, update
				if (Math.min(gas, low) !=low)
				{
					low = gas;
					lgas = counter;
				}
			}
		}
		//average bills
		average = totBills / counter ;
		//print things
		System.out.println("The lowest bill is: " + low + " And the month was the: " + lgas);
		System.out.println("The highest bill is: " + high + " And the month was the: " + hgas);
		System.out.println("The average of the bills are: " + String.format("%.2f",average));
		System.out.println("The total of the bills are: " + totBills + " From a total of 12 bills.");
		return "complete 2";
	}		
		
}
