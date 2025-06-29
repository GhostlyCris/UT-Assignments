//this program calculates SphereArea;
/*# Name : Cristian Z-GhostlyCris

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 3 - Youtube video

# Date: 9/8/2021

# Summary: Calculates area of a sphere based on user input
*/
import java.util.Scanner;
public class SphereArea {
	public static void main(String [] args) {
		//Declare variables
		double radius; //declare radius;
		double area; // Declare area;
		
		//Declare constant Value for Pi;
		final double PI = 3.14159; // Declare PI constant
		
		//Ask user for a number for area;
		System.out.print("Please enter a number for the radius of a sphere: ");
		
		//Declare Scanner object;
		Scanner input = new Scanner (System.in);
		
		// Assign value to the radius from user;
		radius = input.nextDouble(); // new val for radius;
		
		//Compute area;
		area = radius * radius * PI * 4;
		
		
		//Display results;
		System.out.println("The area for the sphere with a radius of " + radius + " is " + area); 
		
		
	}
}