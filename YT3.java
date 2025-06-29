/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 3

#Problem: 3

# Date: 09/24/21 

# Summary: concatenation [✓], max method [✓], the 
	 random method [✓], and escape sequences for special characters [✓]

# Problem 3
	 Assignment:
	 Create a YouTube video that explains your understanding
	 of the concepts of string concatenation [✓], max method [✓], the 
	 random method [✓], and escape sequences for special characters [✓]
	 in Java. Explain with the help of a Java program(s) of your own. 
	 The video should be between 5 minutes to 15 minutes long. 
	 Include the link to your video in the comment sections of your code. 
	 
	 https://youtu.be/a2tjNRlAoTc
*/
import java.util.Scanner;
import java.lang.Math;
public class YT3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//String concatenation;
		
		//Ask user for name;
		System.out.println("Enter your first, middle, and last name");
			String firstName = input.next();
			String middleName = input.next();
			String lastName = input.next();
		//Set up strings to concatenate;
			String s1 = String.format("%s%s%s",firstName,middleName,lastName);//format method
			
			String s2 = (firstName + " " + lastName); //plain old string using (+) to con-cat
			
			String s3 =  String.join(" ",firstName,lastName);//join method()
			
			//set a empty string, doesn't have to be, to enter 
			String s= " "; //not needed for String loss error or no such exception occurred;
			String s5= s.concat(firstName +" "+ middleName +" "+ lastName);
			//numbers in strings causes con-cat method to error out depending on where its placed;
			//StringBuffer s4 = new StringBuffer (firstName,lastName);
			//String builder and append issues but thats 3 more ways of concatenating ;
			//Append issues to be solved;
			
		//print out all working concatenation methods;
		System.out.println(firstName + " " + middleName + " " + lastName);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.toString());
		System.out.println(s5);
		
		//max method();		
		System.out.println( Math.max(54,100.56)); //double;	//hard coded values for comparison;
		System.out.println( Math.max(2.3556564,6.3264)); //float;
		System.out.println( Math.max(98745,2)); //integers;
		System.out.println( Math.max(64.32,-64.32)); //long ;
		
		//print an example of just the start of the recursive properties;
		System.out.println("System.out.println(Math.max(Math.max(54,100.56),Math.max(2.3556564, 6.3264)))");
		System.out.println(Math.max(Math.max( 54,  100.56),Math.max( 2.3556564,  6.3264)));
		
		//random method
		double max1 = Math.random() * 65465;
		System.out.println(max1 + " is a random number using the Math.random() method while set for a double. Options include the types int, float, and long");
		
		// backslash for escape sequence commands in strings
		System.out.println("My favorite book is \"The Handmaid's Tale\" by Margaret Atwood");
		
		String crazy = new String ("Crazy? I was crazy once. They put me in a room. A room? A room with a rat. \n A rat, there was a rat\nIt made me crazy\nCrazy? I was crazy once");
		
		System.out.println(crazy);
		
		//other examples include \t - tab.
/*      \b - backspace (a step backward in the text or deletion of a single character).
		\n - new line.
		\r - carriage return. () for left indent after hitting "enter" or rather clearing the screen
		\f - form feed. same but with an indent
		\' single quote.
		\" double quote.
		\\ backslash.
*/
	}
}