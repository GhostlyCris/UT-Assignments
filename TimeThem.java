/*# Name : Cristian Z-GhostlyCris

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 1

# Date: 9/6/2021

# Summary: Calculates area of triangle based on user input

	Problem 4
	Write a program that prompts the user to enter his/her name,
	and the seconds (e.g one million). The program displays 
	the user's name and the number of hours and minutes.
	
	Here is a sample run:
	Enter your name: Auko Otieno
	Enter the seconds: 15000
	
	Hello, Auko Otieno. 
	15000 seconds is 4 hours and 10 minutes.*/
	
import java.util.Scanner;
public class TimeThem {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        //Ask user for name
        System.out.print("Please enter your first and last name: ");
        String name = input.nextLine();
        
		//declare variables set and constants
		final int MIN = 60, HRS = 3600, DYS = 84600;
		int days, seconds, minutes, hours, rDays, rHours;
		
		//Ask user for time in seconds
		System.out.println("Please enter time in as seconds: ");
		int inputs = input.nextInt();
		
		//Calculate with less headache
		days = inputs/DYS;
		rDays = inputs%DYS;
		hours = rDays/HRS;
		rHours = rDays%HRS;
		minutes = rHours/MIN;
		seconds = rHours%MIN;

		
		//int hours = (seconds % 86400 ) / 3600 ;
		//int minutes = ((seconds % 86400 ) % 3600 ) / 60 ;
		
		//Print everything
		System.out.println("Hello, "+ name);
		//
		//System.out.println(inputs + " Seconds is " + hours + " and " + minutes + " minutes." );
		//System.out.println("Or this many days " + days);
	
		
		if (inputs >= HRS ) {
		System.out.println(inputs + " seconds is " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
		}

		else if (inputs >= MIN && inputs < HRS) {
		System.out.println(inputs + " seconds is " + minutes + " minutes " + seconds + " seconds");
		}

		else (inputs < MIN) {
		System.out.println(inputs + " seconds is seconds");
		}
	
	
	
	}
}