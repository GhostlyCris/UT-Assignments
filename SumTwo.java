/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z
# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 2

# Date: 09/14/21 

# Summary: Sun of two numbers and guess the value

https://youtu.be/UPBfwxT1rfc
 */

import java.util.Scanner;
public class SumTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        //Ask user for numbers for input while we declare variables;
        System.out.print("Please enter your a number: ");
        double valueOne = input.nextDouble();
		System.out.print("Please enter your a number: ");
        double valueTwo = input.nextDouble();
		
		//calculate the total;
		double total = valueOne + valueTwo;
		
		//Ask user for their guess;
		System.out.print("Now we add the two numbers and you guess the total: ");
		double guess = input.nextDouble(); 
		
		//Now we compare with if else statements;
		if ( guess < total && guess >= (total - 5) ) {
		System.out.println("You almost got it.");
		}

		else if (guess > total && guess <= total + 5 ) {
		System.out.println("Keep trying");
		}

		else if (guess > (total + 5) || guess < (total -5)  ) {
		System.out.println("You are way off the mark");
		}
		 
		else if (guess == total) {
			System.out.println("You got it!");
		}
	
	
	}
}