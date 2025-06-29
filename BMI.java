/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 2

#Problem: 2

# Date: 09/14/21 

# Summary: Using BMI to induce fear of weight and give someone anerexia  

https://youtu.be/UPBfwxT1rfc
*/

import java.util.Scanner;
public class BMI {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        //Ask user for numbers for input while we declare variables;
        System.out.print("Please enter your a BMI number: ");
        double valueOne = input.nextDouble();
		
		//Now we compare with if else statements;
		if ( valueOne <= 18.5 ) {
		System.out.println("Underweight");
		}

		else if (valueOne > 18.5 && valueOne <= 24.9 ) {
		System.out.println("Normal weight");
		}

		else if (valueOne >= 25 && valueOne <= 29.9 ) {
		System.out.println("Please, watch what you eat and take steps for your health ");
		}

		else if (valueOne >= 30)  {
		System.out.println("Please, consider exercise and diet");
		}
	
	
	}
}