/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 8

# Problem: 1

# Date: 10/26/21 

# Summary:taxes

#  		Problem 1
	The United States Federal Income tax for taxes for 2020-2021
    is available at this link: https://www.bankrate.com/finance/taxes/tax-brackets.aspx
	The four tax filing categories are: 0 - single filer, 2 - head of household, 
	3 - married filing jointly or qualifying widow, and 4 - married filing
	separately. 
	
	Write a Java program that prompts the user to enter the name, filing status, and
	annual income. The program returns the federal income tax due. (20 Points)
	
	A sample run should look like:
	Enter your name: Jane Doe
	Enter your 2020 federal income: 48,000
	Enter your filing status: single
	
	Jane Doe, the federal income tax for an annual salary of
	48,000 for a single filer is $4,800.

*/

import java.lang.Math;
import java.util.Scanner;
public class tax{
	public static void main(String[] args) {
		//scanner
	Scanner input = new Scanner (System.in);
	//name
	System.out.println("Enter your first and last name: ");
	//input
	String name = input.nextLine();
	//say 2020 income question
	System.out.println("Enter your 2020 federal income with no commas: ");
	double salary = input.nextDouble();
	//ask status
	System.out.println("Enter your filing status: \nExamples: 1 - single filer\n2 - head of household\n3 - married filing jointly or qualifying widow \n4 - married filing separately.");
	
	double tIncome = 0;
	double uRate = 0;
	double toTax = 0;
	int status = input.nextInt();
	String fileName = "";
	switch(status %4)
	{
		case 1: fileName ="Single";
		break;
		case 2:fileName ="Head of household";
		break;
		case 3:fileName ="Married filing jointly or qualifying widow";
		break;
		case 4:fileName ="Married filing separately";
		break;
		
	}
	tIncome = salary; //too stubborn to remove an extra variable so we keep it
	switch (status %4)
	{case 1:
	{   //tIncome compares to higher value
		  if (tIncome <= 9950) {
                toTax += tRange(0, 9950, 10.00, tIncome);//trange method
                uRate = 10.00; //tax percentage
            } else if (tIncome <= 37950) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 37950, 12.00, tIncome);
                uRate = 12.00;
            } else if (tIncome <= 91900) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 37950, 12.00, tIncome);
                toTax += tRange(37950, 91900, 22.00, tIncome);
                uRate = 22.00;
            } else if (tIncome <= 191650) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 37950, 12.00, tIncome);
                toTax += tRange(37950, 91900, 22.00, tIncome);
                toTax += tRange(91900, 191650, 24.00, tIncome);
                uRate = 24.00;
            } else if (tIncome <= 416700) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 37950, 12.00, tIncome);
                toTax += tRange(37950, 91900, 22.00, tIncome);
                toTax += tRange(91900, 191650, 24.00, tIncome);
                toTax += tRange(191650, 416700, 32.00, tIncome);
                uRate = 32.00;
            } else if (tIncome <= 418400) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 37950, 12.00, tIncome);
                toTax += tRange(37950, 91900, 22.00, tIncome);
                toTax += tRange(91900, 191650, 24.00, tIncome);
                toTax += tRange(191650, 416700, 32.00, tIncome);
                toTax += tRange(416700, 418400, 35.00, tIncome);
                uRate = 35.00;
            } else {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 37950, 12.00, tIncome);
                toTax += tRange(37950, 91900, 22.00, tIncome);
                toTax += tRange(91900, 191650, 24.00, tIncome);
                toTax += tRange(191650, 416700, 32.00, tIncome);
                toTax += tRange(416700, 418400, 35.00, tIncome);
                toTax += tRange(418400, Integer.MAX_VALUE, 37.00, tIncome);
                uRate = 37.00;
            }
	}
	break;
	case 2:
	{	
		if (tIncome <= 14200) {
                toTax += tRange(0, 14200, 10.00, tIncome);
                uRate = 10.00;
            } else if (tIncome <= 54200) {
                toTax += tRange(0, 14200, 10.00, tIncome);
                toTax += tRange(14200, 54200, 12.00, tIncome);
                uRate = 12.00;
            } else if (tIncome <= 86350) {
                toTax += tRange(0, 14200, 10.00, tIncome);
                toTax += tRange(14200, 54200, 12.00, tIncome);
                toTax += tRange(54200, 86350, 22.00, tIncome);
                uRate = 22.00;
            } else if (tIncome <= 164900) {
                toTax += tRange(0, 14200, 10.00, tIncome);
                toTax += tRange(14200, 54200, 12.00, tIncome);
                toTax += tRange(54200, 86350, 22.00, tIncome);
                toTax += tRange(86350, 164900, 28.00, tIncome);
                uRate = 28.00;
            } else if (tIncome <= 209400) {
                toTax += tRange(0, 14200, 10.00, tIncome);
                toTax += tRange(14200, 54200, 12.00, tIncome);
                toTax += tRange(54200, 86350, 22.00, tIncome);
                toTax += tRange(86350, 164900, 28.00, tIncome);
                toTax += tRange(164900, 209400, 32.00, tIncome);
                uRate = 32.00;
            } else if (tIncome <= 523600) {
                toTax += tRange(0, 14200, 10.00, tIncome);
                toTax += tRange(14200, 54200, 12.00, tIncome);
                toTax += tRange(54200, 86350, 22.00, tIncome);
                toTax += tRange(86350, 164900, 28.00, tIncome);
                toTax += tRange(164900, 209400, 32.00, tIncome);
                toTax += tRange(209400, 523600, 35.00, tIncome);
                uRate = 35.00;
            } else {
                toTax += tRange(0, 14200, 10.00, tIncome);
                toTax += tRange(14200, 54200, 12.00, tIncome);
                toTax += tRange(54200, 86350, 22.00, tIncome);
                toTax += tRange(86350, 164900, 28.00, tIncome);
                toTax += tRange(164900, 209400, 32.00, tIncome);
                toTax += tRange(209400, 523600, 35.00, tIncome);
                toTax += tRange(523600, Integer.MAX_VALUE, 37.00, tIncome);
                uRate = 37.00;
			}
		}
		break;
		case 3:
	{if (tIncome <= 19900) {
                toTax += tRange(0, 19900, 10.00, tIncome);
                uRate = 10.00;
            } else if (tIncome <= 81050) {
                toTax += tRange(0, 19900, 10.00, tIncome);
                toTax += tRange(19900, 81050, 12.00, tIncome);
                uRate = 12.00;
            } else if (tIncome <= 172750) {
                toTax += tRange(0, 19900, 10.00, tIncome);
                toTax += tRange(19900, 81050, 12.00, tIncome);
                toTax += tRange(81050, 172750, 22.00, tIncome);
                uRate = 22.00;
            } else if (tIncome <= 329850) {
                toTax += tRange(0, 19900, 10.00, tIncome);
                toTax += tRange(19900, 81050, 12.00, tIncome);
                toTax += tRange(81050, 172750, 22.00, tIncome);
                toTax += tRange(172750, 329850, 28.00, tIncome);
                uRate = 28.00;
            } else if (tIncome <= 418850) {
                toTax += tRange(0, 19900, 10.00, tIncome);
                toTax += tRange(19900, 81050, 12.00, tIncome);
                toTax += tRange(81050, 172750, 22.00, tIncome);
                toTax += tRange(172750, 329850, 28.00, tIncome);
                toTax += tRange(329850, 418850, 32.00, tIncome);
                uRate = 32.00;
            } else if (tIncome <= 628300) {
                toTax += tRange(0, 19900, 10.00, tIncome);
                toTax += tRange(19900, 81050, 12.00, tIncome);
                toTax += tRange(81050, 172750, 22.00, tIncome);
                toTax += tRange(172750, 329850, 28.00, tIncome);
                toTax += tRange(329850, 418850, 32.00, tIncome);
                toTax += tRange(418850, 628300, 35.00, tIncome);
                uRate = 35.00;
            } else {
                toTax += tRange(0, 19900, 10.00, tIncome);
                toTax += tRange(19900, 81050, 12.00, tIncome);
                toTax += tRange(81050, 172750, 22.00, tIncome);
                toTax += tRange(172750, 329850, 28.00, tIncome);
                toTax += tRange(329850, 418850, 32.00, tIncome);
                toTax += tRange(418850, 628300, 35.00, tIncome);
                toTax += tRange(628300, Integer.MAX_VALUE, 37.00, tIncome);
				uRate = 37.00;
			}
		
	}
	break;
	case 4:
	{if (tIncome <= 9950) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                uRate = 10.00;
            } else if (tIncome <= 40525) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 40525, 12.00, tIncome);
                uRate = 12.00;
            } else if (tIncome <= 86375) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 40525, 12.00, tIncome);
                toTax += tRange(40525, 86375, 22.00, tIncome);
                uRate = 22.00;
            } else if (tIncome <= 164925) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 40525, 12.00, tIncome);
                toTax += tRange(40525, 86375, 22.00, tIncome);
                toTax += tRange(86375, 164925, 28.00, tIncome);
                uRate = 28.00;
            } else if (tIncome <= 209425) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 40525, 12.00, tIncome);
                toTax += tRange(40525, 86375, 22.00, tIncome);
                toTax += tRange(86375, 164925, 28.00, tIncome);
                toTax += tRange(164925, 209425, 32.00, tIncome);
                uRate = 32.00;
            } else if (tIncome <= 314150) {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 40525, 12.00, tIncome);
                toTax += tRange(40525, 86375, 22.00, tIncome);
                toTax += tRange(86375, 164925, 28.00, tIncome);
                toTax += tRange(164925, 209425, 32.00, tIncome);
                toTax += tRange(209425, 314150, 35.00, tIncome);
                uRate = 35.00;
            } else {
                toTax += tRange(0, 9950, 10.00, tIncome);
                toTax += tRange(9950, 40525, 12.00, tIncome);
                toTax += tRange(40525, 86375, 22.00, tIncome);
                toTax += tRange(86375, 164925, 28.00, tIncome);
                toTax += tRange(164925, 209425, 32.00, tIncome);
                toTax += tRange(209425, 314150, 35.00, tIncome);
                toTax += tRange(314150, Integer.MAX_VALUE, 37.00, tIncome);
                uRate = 37.00;
			}
			
		
	
	break;}
	
	}
	//Print the final thing
	System.out.println(name + ", " + "the federal income tax for an annual salary of " + salary + " for a " + fileName + " is " + toTax + ".");
	
	}
	//method for comparing income 
	public static double tRange(int lower, int higher, double uRate, double tIncome) {
		Scanner input = new Scanner (System.in);
	    double toTax = 0.0;
        double usingcalculatortax = 0;
		//compare and math the pain away on its own
        if (tIncome > higher)
            usingcalculatortax = higher;
        else
            usingcalculatortax = tIncome;
        toTax = ((double) usingcalculatortax - (double) lower) * uRate / 100;
		
        return toTax;
    }
}
	

