/*# Name : Cristian Z-GhostlyCris

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 1

# Date: 9/6/2021

# Summary: Calculates area of triangle based on user input
*/
/* 	Problem 1
	
*	Write a program that asks the user to enter the base and height
    of a triangle and calculates its area.
	
	Here is a sample output.
	
	Please enter the base of the triangle:4
	Please enter the height of the triangle:8
	
	The area of a triangle of base 4 and height 8 is 16.
*	(5 Points.)
*/

import java.util.Scanner;
public class TriangleArea {
	public static void main(String[] args) {
		 Scanner input = new Scanner (System.in);
        //Take in base from user
        System.out.print("Please enter the base of the triangle: ");
        double base = input.nextDouble();
        
        //Take height from user;
		System.out.print("Please enter the height of the triangle: ");
        double height = input.nextDouble();
		
		//Calculate area for triangle
		double area = (base*height)/2;
        System.out.println("The area of a triangle of base " + base +  " and height " + height + " is "+ area );
	}
}