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
public class ELC {
	//adding method
	public static void add(double num1, double num2)
	{
		double result = num1 + num2;
		System.out.println("Adding "+ num1 +" and "+ num2 + " = " + result );
	}
	
	//subtraction method
	public static void subtract(double num1, double num2)
	{
		double result = num1 + num2;
		System.out.println("Subtracting "+ num2 +" from "+ num1 + " = " + result );
	}
	
	//multiplication method
	public static void multiply(double num1, double num2)
	{
		double result = num1 * num2;
		System.out.println("Multiplying "+ num1 +" and "+ num2 + " = " + result );
	}
	
	//method to divide
	public static void divide(double num1, double num2)
	{
		if(num2!=0)
		{   
			double result = (num1 / num2);
			System.out.println("Dividing "+ num1 +" by "+ num2 + " = " + result); 
		}
		else
		{
			System.out.println("Division by zero is not allowed");
		}
	}
		
	//exponenentiation reffered to as power for this method
	public static void power(double num1, double num2)
	{
		double result = Math.pow(num1, num2);
		System.out.print(num1 + " To the power (exponent) " + num2 + " = " + result);
	}
	
	//Bang method
	public static void bang(double num1)
	{	double pounds = num1;
		double kgs = (num1/2.2046);
		double limit = 150 * kgs;
		double bangs = 300;
		double death = limit/ bangs ;
		
		System.out.println("First we take your weight and convert it to kilograms. -- " + String.format("%.2f",kgs) + "kgs");
		System.out.println("Then we calculate the limit for a human by taking kgs per 150mg\nto find the limit of what can be handled. -- " + String.format("%.2f",limit) + "mg" );
		System.out.println("Then we divide the total amount by the amount of caffiene in Bang energy drinks(300mg)" );
		System.out.println("From here we can calculate the number of drinks\nit would take to reach totally unforseen consequence(s).");
		System.out.println("To achieve this it would take: -- " + String.format("%.2f",death) + " Bang energy drinks");
		System.out.println("Would you like to continue? (e) or (c)");
	}
	
	//main
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		//talk to user
		System.out.println("Welcome to the English Language Calculator.");
		System.out.println("We will be using two numbers and then applying an operation.");
		
		//initialize operator and flag
		char operator = '*';
		char flag ='*';
		//initialize numbers
		double num1 =0, num2 = 0;
		do
			{	
				int nums =0; // num checker
				//check number and if fail send to bottom
				try
				{
				nums++;
				System.out.println("Please enter a number.");
				num1 = num.nextDouble();
				nums++;
				System.out.println("Please enter a number.");
				num2 = num.nextDouble();
				}
				catch(Exception Number)
				{
					System.out.println("Exception: Not a valid number. Ex: 1, 1.0, -1.0");
					//tell you which number is wrong
					if(nums==1)
					{System.out.println("The first number entered was invalid.");}
					else{System.out.println("The second number entered was invalid.");}
				}
				
			System.out.println("Please type in a operator type. Ex: + , - , * , / , ^ ");
			operator = num.next().charAt(0);
			//Choice selection for operation
			//method selected to say the things from switch selection
			switch(operator)
			{
			case '+':add(num1,num2);
			break;
			case '-':subtract(num1,num2);
			break;
			case '*':multiply(num1,num2);
			break;
			case '/':divide(num1,num2); 
			break;
			case '^':power(num1,num2);
			break;
			default: System.out.println("Exception: operator is not valid."); 
			}
			
			//Continuation flag and not using a boolean value cause it's my program. It also doesn't require the hint
			System.out.println("Enter (e) to quit or continue with (c).");
			flag = num.next().charAt(0);
			//I know if they used something else
				//try to be nice and let them choose if they want to continue or retry
				if((flag != 'e') && (flag !='c'))
				{	
					System.out.println("Exception: Neither (e) or (c) was entered. (b) does something cool. ");
					System.out.println("You have 2 tries to correct this. ");
					for(int counter = 0; counter <= 2; counter++)
					{   
						//attempt fix or close or do something fun with bang energy drinks
						switch(flag)
						{
							//Fun bang energy hidden here
						case 'b': System.out.println("Please enter your weight in pounds.");
										try{ num1 = num.nextDouble();
											bang(num1);
											}
										catch(Exception Number) 
										{	System.out.println("Exception: Not a valid number. Ex: 1, 1.0, -1.0");	}
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
		while( ((flag != 'e') || (flag == 'c')) );
	}	
}