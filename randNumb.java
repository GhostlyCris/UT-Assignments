/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 6

# Problem: 2

# Date: 10/14/21 

# Summary: random numbers into an array then sort it

#  	Problem 2 
	Write a Java program that instantiates an array and fills it
	with random values between 12 and 87. Then perform a selection sort
	of the array. Then, print out all elements of the array before and 
	after the election sort.

*	(8 Points.)
https://youtu.be/RHfTvY0dZ_c

*/
import java.lang.Math;
import java.util.Scanner;
public class randNumb{
	public static void main(String[] args) {
		//Say something
		System.out.println("\nI shall make an array that has nonsensical numbers that are completely arbitrary.\nAnd I shall show what it looks like before it gets organized and after.\nFor reference the range is from 12 to 87:\n");
		//inital variable and array with a set limit
		int n = 50;
		int temp = 0;
		int [] arbitrary = new int [n];
		//for loop adding those random numbers to the array
		for (int i = 0; i < n; i++)
		{
			arbitrary[i] = (int)((Math.random() * (87-12) + 12));
		}
		//loop
		for (int i = 0; i < arbitrary.length; i++)
		{	//check its not the last number so it adds commas while printing
			if(i != arbitrary.length -1){
			System.out.print(arbitrary[i] + ", ");			
		}	//dont print a comma, just add new lines
		else System.out.print(arbitrary[i] + "\n\n");
		}	//loop to replace numbers in ascending order
		for (int i = 0; i<arbitrary.length; i++)
		{	for(int j = i+1; j <arbitrary.length;j++)
			{
				if(arbitrary[i]>arbitrary[j])
				{
				temp = arbitrary[i];
				arbitrary[i] = arbitrary[j];
				arbitrary[j] = temp;
				}
			}
		}	//talk again
		System.out.println("The array has been sorted in ascending order: ");
		//loop again checking if commas are needed
		for (int i = 0; i < arbitrary.length; i++)
		{	
			if(i != n-1)
			{
			System.out.print(arbitrary[i] + ", ");
			}
			else System.out.print(arbitrary[i] +"\n\n");
		}
	}
}