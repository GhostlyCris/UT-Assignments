/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 3

#Problem: 1

# Date: 09/21/21 

# Summary: detect if password has symbol(s) and digit(s)

# WS3Schools gave some help understanding how to check against multiple items at once without using regex from java util by using (.*) to check anything
*/
import java.util.Scanner;
public class Password {
	// Check if password is valid or not with a method;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//ask user for password;
		System.out.print("Please enter a password of at least 10 characters, a digit(s) and with a special symbol(s)(@,#,%,*,!,^): ");
            String password1 = input.next();
 
        boolean validPassword = validPassword(password1);
		
		//boolean validPassword(password1);
		if(validPassword == true)
		{
        System.out.println(password1 + " is a valid password, awesome!");
		}
		else 
		{
			System.out.println("Not quite, please try again");
		}
    }
    public static boolean validPassword(String password1)
    {
            boolean valid = true;
            if (password1.length() >20 || password1.length() < 10)
            {
            System.out.println("Password must be less than 20 and more than 10 characters in length.");
            valid = false;
            }
            //tell string compressed wise to check against digits in numbers
            String numbers = "(.*[0-9].*)";
            if (!password1.matches(numbers ))
            {
                System.out.println("Password must have atleast one number");
                valid = false;
            }
			//check string against symbols
            String specialChars = "(.*[@,#,%,*,!,^].*$)";
            if (!password1.matches(specialChars ))
            {
                System.out.println("Password must have atleast one special character among @#$%*!^");
                valid = false;
            }
            return valid; 
    }
	
   
}
