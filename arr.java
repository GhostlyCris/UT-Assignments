/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 7

# Problem: 3

# Date: 10/22/21 

# Summary:Explain an array while making one

#  	Problem 3
	For this part of the problem, create a YouTube video that 
	explains your understanding of arrays. Write and explain in
	the video a simple Java program that implements an array.
	Show the YouTube link in your submission. 
	(5 Points.)

https://youtu.be/t6bftIoBllQ
*/
import java.lang.Math;
import java.util.Scanner;
public class arr{
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Pick a number any number, but don't go overboard or it may feel like forever.");
	int n = input.nextInt();
	String [] story = new String [n];
	System.out.println("Type the number of words or just hitting enter when you feel like it.");
	//int counter = 0;
	for (int i = 0; i < story.length; i++)
		{
			story[i] = input.next();
			//counter++;
		}
	
	System.out.println("Here is what you typed\n\n");
	for (int i = 0; i < story.length; i++)
		{
			System.out.print(story[i] + " ");
		}
		//System.out.println("The totals words typed are: " + counter);
	}
}