/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Project: English language calculator

# Date: 11/19/21 

# Summary: Calculate the answer

 */

import java.lang.Math;
import java.util.Scanner;
public class ELC2 {
	//word generator method
	public static String word(int num1)
	{ 	String word="";
		if((num1 == (Math.abs(num1) * -1))&& num1 != 0)
		{word = "negative ";}
		switch(Math.abs(num1))
		{case 0:word += "zero";		break; 
		 case 1:word += "one";		break;	
		 case 2:word += "two";		break;	
		 case 3:word += "three";	break;	
		 case 4:word += "four";		break;	
	 	 case 5:word += "five";		break;	
		 case 6:word += "six";		break;	
		 case 7:word += "seven";	break;	
		 case 8:word += "eight";	break;	
		 case 9:word += "nine";		break;	
		}
		return word;
	}
	//adding method
	public static int add(int num1, int num2)
	{
		int result = num1 + num2;
		return result;
	}
	//subtraction method
	public static int subtract(int num1, int num2)
	{
		int result = num1 - num2;
		return result;
	}
	//multiplication method
	public static int multiply(int num1, int num2)
	{
		int result = num1 * num2;
		return result;
	}
	//method to divide
	public static int divide(int num1, int num2)
	{   
		int result = (num1 / num2);	
		return result;
	}	
	//exponentiation referred to as power for this method
	public static int power(int num1, int num2)
	{
		int result =(int) Math.pow(num1, num2);
		return result;
	}
	
	
	//Bang method
	public static void bang(int num1)
	{	int pounds = num1;
		int kgs =(int) (num1/2.2046);
		int limit = 150 * kgs;
		int bangs = 300;
		int death = limit/ bangs ;
		
		System.out.println("First we take your weight and convert it to kilograms. -- " + kgs + "kgs");
		System.out.println("Then we calculate the limit for a human by taking kgs per 150mg\nto find the limit of what can be handled. -- " + limit + "mg" );
		System.out.println("Then we divide the total amount by the amount of caffeine in Bang energy drinks(300mg)" );
		System.out.println("From here we can calculate the number of drinks\nit would take to reach totally unforeseen consequence(s).");
		System.out.println("To achieve this it would take: -- " + death + " Bang energy drinks");
		System.out.println("Would you like to continue? (e) or (c)");
	}
	
	//main
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		//talk to user
		System.out.println("\nWelcome to the English Language Calculator.");
		System.out.println("We will be using two, single digits and then applying an operation. 0-9 ");
		
		//initialize operator and flag
		char operator = '*';
		char flag ='*';
		//initialize numbers
		int num1 =0, num2 = 0;
		do
			{	
				int nums =0; // num checker
				//check number and if fail send to bottom
				try
				{
				nums++;//position handler
				System.out.println("Please enter the first number.");
				num1 = num.nextInt();
				if(Math.abs(num1)>9)//check if bigger than 9
				{num1 ='a'; System.out.println("Number one was invalid."); main(args);}//send back to start
				nums++;
				System.out.println("Please enter the second number.");
				num2 = num.nextInt();
				if(Math.abs(num2)>9)
				{num2 ='a'; System.out.println("Number two was invalid."); main(args);
				}
				}
				catch(Exception Number)
				{
					System.out.println("Exception: Not a valid number. Ex: 1, -1");  //not a number entered
					//tell you which number is wrong
					if(nums==1)
					{System.out.println("The first number entered was invalid.");}
					else{System.out.println("The second number entered was invalid.");}
				}
				if((Math.abs(num1) >= 0 && Math.abs(num1) <= 9) && (Math.abs(num2) >= 0 && Math.abs(num2) <= 9))
				{	
			System.out.println("Please type in a operator type. Ex: + , - , * , / , ^ ");
			operator = num.next().charAt(0);
			//Choice selection for operation
			//method selected to say the things from switch selection
			switch(operator)
			{
			case '+':System.out.println(word(num1) + " plus " + word(num2) + " is " + add(num1,num2));
			break;
			case '-':System.out.println(word(num1) + " minus " + word(num2) + " is " +subtract(num1,num2));
			break;
			case '*':System.out.println(word(num1) + " times " + word(num2) + " is " +multiply(num1,num2));
			break;
			case '/': if (num2 != 0){System.out.println(word(num1) + " divide by " + word(num2) + " is " +divide(num1,num2));} 
						else { System.out.println("Division by zero is not allowed"); }
			break;
			case '^':System.out.println(word(num1) + " to the power " + word(num2) + " is " +power(num1,num2));;
			break;
			default: System.out.println("Exception: operator is not valid."); 
			}
			
			//Continuation flag and not using a boolean value cause it's my program. It also doesn't require the hint
			System.out.println("Enter (e) to quit or continue with (c).");
			flag = num.next().charAt(0);
			//I know e or c
			switch(flag)
			{case 'e':System.exit(0);
			break;
			 case 'c':main(args);
			 break;
			 default:
			//I know if they used something else
				//try to be nice and let them choose if they want to continue or retry
					
					System.out.println("Exception: Neither (e) or (c) was entered. (b) does something cool. ");
					System.out.println("You have 2 tries to correct this. ");
					for(int counter = 0; counter <= 2; counter++)
					{   
						//attempt fix or close or do something fun with bang energy drinks
						switch(flag)
						{
							//Fun bang energy hidden here
						case 'b': System.out.println("Please enter your weight in pounds.");
										try{ int num3 = num.nextInt();
											bang(num3);
											}
										catch(Exception Number) 
										{	System.out.println("Exception: Not a valid number. Ex: 1, -1");	}
										
								  System.out.println("\n");
								  flag = num.next().charAt(0);
						break;
						case 'e':System.exit(0); //kill program
						break;
						case 'c':flag = 'c'; counter =2;  //Continue program
						break;		  
						default:  System.out.println("Please try again. (e) or (c)"); //keep trying to select
								  System.out.println("Tries: "+ (counter +1) );		  //Possibly force continue on you 
								  flag = num.next().charAt(0); 						  //by just passing whatever the last character
								  if(flag == 'e' || flag == 'c')
									  counter++; 
						}
					}
				
				}
			} 				  
				
		}
		while( ((flag != 'e') || (flag == 'c')) );
	}	
}