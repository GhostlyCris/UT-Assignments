/*# Name : Cristian Z-GhostlyCris

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 1

# Date: 9/6/2021

# Summary: Calculates area of triangle based on user input

	Problem 2 
	The current world record of the 100 meters dash is held by
	Usain Bolt at 9.58 seconds. Assuming Usain maintains his record 
	speed, write a computer program that calculates how many minutes 
	it would take Usain to complete a 400 meters dash.
	(5 points)*/

public class UsainBolt {
	public static void main(String[] args) {
		//Tell user Usain Bolt's achievement
		System.out.println("Usain Bolt holds an achievement for a 100 meter dash at 9.58 seconds");
		
		//what if it was a 400 meter dash
		System.out.println("What if it was a 400 meter dash assuming no variables?");
        
		//calculate dash - constant;
		final double DASH = 9.58 * 4;
        
        //Tell user in seconds;
		System.out.println("Well it would be: "+ DASH + " seconds. But what in minutes?");
		
		//Convert to minutes
        final double MINUTES = DASH / 60.00;
		
		//Tell user in minutes
		
        System.out.println("The time in minutes would be: ");
		System.out.format("%.2f", MINUTES );
	}
}