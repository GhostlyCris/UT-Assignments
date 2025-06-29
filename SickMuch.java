/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 5

# Problem: 2

# Date: 10/08/21 

# Summary: Covid-19 Diagnoses done sloppily and some reason with not all void methods "?"

# https://youtu.be/okO8KZh1TP8

*/

import java.util.Scanner;
public class SickMuch{
	//method for mild
	public static String mild(String sick){
			Scanner input = new Scanner(System.in);
			//ask for more input
			System.out.println("Do they have a cough, chills, shortness of breath or feel tired lately? (yes/no)");
			String value = input.next();
			switch (value){
		case "yes": System.out.println("Lets ask more questions.");moderate(sick);
		break;
		//stop statement for if it could be mild
		case "no": System.out.println("We may need to run some confirmatory blood tests. Likely either a Mild case of covid-19 or something else.");
		}return "You probably just have a cold or mild covid-19 case but lets run some blood tests in-case.";
		}
		//method for moderate
		public static String moderate(String sick){
			Scanner input = new Scanner(System.in);
			//ask for more input
			System.out.println("Do they have a drop in blood pressure, inflammation, and/or pneumonia? (yes/no)");
			String value = input.next();
		switch(value){
		    case "yes": System.out.println("Let's ask more questions."); severe(sick);
			break;
			//end statement for moderate
			case "no": System.out.println("Could be a moderate case of covid-19 but lets run some blood tests to confirm.");
			}
			return "We may need to run some confirmatory blood tests. Could be a moderate case of covid-19 though.";
		}
		//method for severe
		public static void severe(String sick){
			System.out.println("You likely have a severe case of covid-19, but lets do some blood tests to confirm.");
			return;
		}
		//main method
	public static void main(String[] args) {
		//initialize important stuff
		Scanner input = new Scanner(System.in);
		String value = "";
		String sick = "";
		double fever;
		//ask from the get go if they have any symptoms
		System.out.println("Do they have any of theses symptoms: 98.6 F t 100.4 F, respiratory symptoms, aches, pains, and dry cough? (yes/no)");
		switch(value = input.next()){
		    case "yes": {System.out.println("Please enter the temperature of patient"); 
						fever= input.nextDouble();
				if (fever < 90) {System.out.println("Are you sure? Tell me again, please.");
					fever = input.nextDouble();}
				else if (fever < 96) {System.out.println("Your hypothermia is severe.");
				System.out.println("You have a different issue. Let's take some blood to confirm if it could be covid-19 or at least another illness.");} 
					else if( fever < 98.6)
					{System.out.println("Your temp is low.");
					mild(sick);}
					else if (fever <= 100.4 && fever >= 98.6)
					{System.out.println("You have a fever going of " + fever); 
					mild(sick);}
					else if (fever >100.4)	
					{System.out.println("You have a moderate fever of " + fever);
					moderate(sick);}
									else System.out.println("A problem has occured");}
				break;
				case "no": {System.out.println("lets move onto other questions."); 
				mild(sick);}
		}
	}
		
		
}