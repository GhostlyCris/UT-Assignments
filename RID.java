/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 3

#Problem: 2

# Date: 09/21/21 

# Summary: detect if rocketID has symbol(s) and digit(s)

# WS3Schools gave some help understanding how to check against multiple items at once without using regex from java util by using (.*) to check anything
*/
import java.util.Scanner;
public class RID {
	// Check if RID is valid or not with a method;
	 public static boolean validRocketID(String rocketID)
    {
            boolean valid = false;
			int rockLength = String.valueOf(rocketID).length();
            if (rockLength != 9) //could just say rocketID.length() != 9 then false;
            {
				System.out.println("rocketID must be less than 10 and more than 8 characters in length, so 9 digits.");
            valid = false;
            }
			else 
			{
				//System.out.println("rocketID must be less than 10 and more than 8 characters in length, so 9 digits.");
				valid = true;
			}
            //tell string compressed wise to check against digits in numbers
            String numbers = "(.*[0-9].*)";
            if (!rocketID.matches(numbers ))
            {
				System.out.println("rocketID must all be numbers");
                valid = false;
            }
			
			
			//check string against symbols
            String specialChars = "(.*[@,#,%,*,!,^,$].*$)";
            if (rocketID.matches(specialChars ))
            {
                System.out.println("rocketID must have no special character");
                valid = false;
            }
			String letters= "(.*[a-z,A-Z].*)";
			if (rocketID.matches(letters))
			{
				System.out.println("rocket number must not have letters");
				valid = false;
			}
            return valid; 
    }
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//ask user for rocketID;
		System.out.print("Please enter a rocketID of of 9 digits, with no characters and with no special symbol(s)(@,#,%,*,!,^): ");
            String rocketID1 = input.next();
 
        boolean validRocketID = validRocketID(rocketID1);
		
		if(validRocketID == true){
        System.out.print(rocketID1.substring(0,2) + "-" + rocketID1.substring(2,5) + "-"  + rocketID1.substring(6,9));
	    // System.out.println(rocketID1 + " is a valid rocket number, awesome!");
		}
		else 
		{
			System.out.println(rocketID1 + " is a invalid rocket number, please try again");
		}
		
    }
   
   
}
//150mg / kg