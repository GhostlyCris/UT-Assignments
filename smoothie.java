/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name :Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 4

# Problem: 2

# Date: 09/28/21 

# Summary: order a smoothie already, geezus

# https://youtu.be/AXNYYIs0kLA

*/
import java.util.Scanner;

public class smoothie {
	public static void main(String[] args) {
		// start of scanner object
		Scanner input = new Scanner (System.in);
		
		//initialize variables	
		boolean quit = false;
		double money = 0;
		
		//Initialize strings a order list
		String name= "";
		String s = " ";
		String Order = " \n";
		//Unnecessary shortening of order list for time saving
		String Straw = "Strawberry";
		String Pine = "Pineapple";
		String Mango = "Mango";
		String Bana = "Banana";
		String Spin = "Spinach";
		String Kale = "Kale";
		
		
		//give the user their options;
		System.out.println("1-  Strawberry: $5.25");
		System.out.println("2 - Pineapple: 	$4.15");
		System.out.println("3 - Mango:   	$6.12");
		System.out.println("4 - Banana:	$5.00");
		System.out.println("5 - Kale: 	$3.13");
		System.out.println("6 - Spinach:   	$4.33");
		System.out.println("7 - quit");
	
		//time for asking for their name
		System.out.println("Name (first only): ");
		name = input.next();
		
		//ask user for choice
		System.out.println("Pick your smoothies via number selection: ");
				//loop for switch to continue until deciding to quit
			    do
				{	//initialize choice to take in values so it doesn't disrupt the program's flow
					int choice = input.nextInt();
					//switch for list
					switch (choice %7) //modulus 7 cause 7 options
					{ 	//cases for the smoothie options each with blocks of same code for adding to order and money to variables with system print statements to let you know they have been selected and added to order
						case 1: 
						{
							System.out.println("Strawberry was selected");
							Order = s.concat(Order + Straw + "\n");							
							money += 5.25;
						}		
						break;	
						case 2: 
						{	
							System.out.println("Pineapple was selected");
							Order = s.concat(Order + Pine + "\n");	
							money += 4.15;
						}
						break;
						case 3: 
						{	
							System.out.println("Mango was selected");
							Order = s.concat(Order + Mango + "\n");
							money += 6.12;
						}
						break;
						case 4: 
						{
							System.out.println("Banana was selected");
							Order = s.concat(Order + Bana + "\n");
							money += 5;
						}
						break;
						case 5:
						{
							System.out.println("Kale was selected");
							Order = s.concat(Order + Kale + "\n");
							money += 3.13;
						}
						break;
						case 6: 
						{
							System.out.println("Spinach was selected");
							Order = s.concat(Order + Spin + "\n");
							money += 4.33;
						}
						break;
						case 7 :quit = true; //enable exit option and format money to 2 floating points
						default: System.out.println(Order + "The total is: $" + String.format("%.2f",money)); return;
					} 
				}while(quit!=true);
	}
}
