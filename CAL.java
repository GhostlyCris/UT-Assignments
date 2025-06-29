/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 4

# Problem: 1

# Date: 09/27/21 

# Summary: Exam name and grade average finder, low score finder, and class failure rate representation --not optimistic I see

# https://youtu.be/AXNYYIs0kLA

*/
import java.util.Scanner;
import java.lang.Math;
public class CAL {
	public static void main(String[] args) {
		// start of scanner object
		Scanner input = new Scanner (System.in);
		
		String firstName = "";
		String lastName ="";
		
		//initialize variables
		int grade;
		int counter = 0;
		int lowestScore = 50;
		int lowCounter=0;
		String failingStudent = "";
		String s= "";
		double rate = 0;
		
		//do while loop
		do
		{   
			//do all this
			System.out.println("Enter first and last name of student: ");
			firstName = input.next();
			lastName = input.next();
			System.out.println("Enter the student's score: ");
			
			//increment counter for how many total iterations
			counter++;
			grade = input.nextInt();
			
			//check for grade if low score
			if (grade <=50)
			{
				//compare last lowscore with grade to see which is lower using the min method
				if (Math.min(lowestScore,grade) != lowestScore)
				{
				//update the lowest score if the new entered grade is lower
				lowestScore = grade;
				failingStudent = s.concat(firstName +" "+ lastName);
				}
				//leaving blank for future edition
				else
				{
				}	
				//update low counter for how many have low grades
			lowCounter++;
			}
			else
			{ 
			}
			
			
		}
		while (counter<6);
		rate = ((double)lowCounter/(double)counter) *100;
		
		System.out.println("Total scores entered: " + counter);
		
		System.out.println("Total number of students that failed the exam: "+ lowCounter);
		
		System.out.println("Percentage of class that failed the exam: " + String.format("%.2f",rate) + "%");
		
		System.out.println(failingStudent + " received the lowest score (" + lowestScore + ").");
		
	}
}