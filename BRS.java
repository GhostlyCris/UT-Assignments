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

# Date: 09/16/21 

# Summary: Explanation of boolean, relational operators, and switch statements  

https://youtu.be/UPBfwxT1rfc
*/

import java.util.Scanner;
public class BRS {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        //Ask user for numbers for input while we declare variables;
        System.out.print("Please enter a number: ");
        double valueOne = input.nextDouble();
		System.out.print("Please enter a second number: ");
		double valueTwo = input.nextDouble();
		
		//Ask user for yes or no;
		System.out.print("Please enter true or false: ");
		boolean valueThree = input.nextBoolean();
		boolean yes = true;
		boolean no = false;
		
		if (valueThree == yes) {
		System.out.println(valueThree + " is " + yes + " and you love my example");
		}

		else {System.out.println(valueThree + " has been declared as " + no + " and you deny my example love, rude.");}
		
		//Now we compare with if else statements for number one;
		if ( valueOne  <= 18.5 ) {
		System.out.println("You entered a low first number");
		}

		else if (valueOne  > 18.5 && valueOne <= 34.9 ) {
		System.out.println("You found the first middle range of numbers with first number");
		}

		else if (valueOne  >= 35 && valueOne <= 59.9 ) {
		System.out.println("You found the second range of middle numbers with the first number");
		}

		else if (valueOne  >= 60)  {
		System.out.println("You found the high range with the first number");
		}
		
		//Second number comparisons
		if ( valueTwo <= 18.5 ) {
		System.out.println("You entered a low second number");
		}

		else if ( valueTwo > 18.5 && valueTwo <= 34.9 ) {
		System.out.println("You found the first middle range of numbers with the second number");
		}

		else if ( valueTwo >= 35 && valueTwo <= 59.9 ) {
		System.out.println("You found the second range of middle numbers with the second number");
		}

		else if ( valueTwo >= 60)  {
		System.out.println("You found the high range with the second number");
		}
		
		//Determine wether valueOne is biger, lesser, or equal to valueTwo;
		if (valueOne  == valueTwo) {
		System.out.println("You entered the same number twice, good job.");
		}
		
		if ( valueOne < valueTwo ) {
		System.out.println("The first number is smaller than the second");
		}
		
		if ( valueOne > valueTwo ) {
		System.out.println("The first number is bigger than the second. ");
		}
	
		int valueFour = (int)valueTwo;
		switch (valueFour%7){
		case 0: System.out.println("You unknowingly chose silliness");
		break;
		case 1: System.out.println("You unknowingly chose to burn the world");
		break;
		case 2: System.out.println("You unknowingly chose make a billionare homeless");
		break;
		case 3: System.out.println("You unknowingly chose to sin");
		break;
		case 4: System.out.println("You unknowingly chose to have no sense of humor");
		break;
		case 5: System.out.println("You unknowingly chose the wicked thrills of staying at home on vacation");
		break;
		case 6: System.out.println("You unknowingly chose tomorrow as a day to workout");
		break;
		case 7: System.out.println("You unknowingly chose tomorrow to call your mother");
		break;
		default: System.out.println("You unknowingly made the Chilli Hot Peppers popular again");
		}
		
		
		
		
	}
}