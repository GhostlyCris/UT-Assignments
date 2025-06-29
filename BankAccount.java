/* This code is my own work. I did not get any help from any online source 
such as chegg.com; from a classmate, or any other person other than the instructor 
or TA for this course. I understand that getting outside help from this course 
other than from the instructor or TA will result in a grade of 0 in this 
assignment and other disciplinary actions for academic dishonesty.

# Name : Cristian Z

# Class: CSET 1200

# Instructor: Dr. Jared Oluoch

# Programming Assignment: 10

# Problem: 1

# Date: 11/12/21 

# Summary: Banking on real examples with possible sleep deprivation

#  	Problem 1
	Write a Java program that accomplishes the following.
	1. A superclass Bank Account that has the following: balance (attribute), 
	and the following methods:getBalance(),deposit(), withdraw().

	2. A checking account that inherits from the Bank Account. 
	In addition, the checking account has monthly fee of $150.55. 
	 The checking account also has the following methods: applyMonthlyfee() 
	 and  getMonthlyfee(). 
	
	3. A savings account that inherits from the Bank Account. 
	In addition, the savings account has an interest rate of 2% and 
	the following methods: applyInterestRate(), SavingsAccount(), 
	and getInterestRate().
	
	Based on the above:
	
	1) write a simple Java program that shows the relationships of the above classes
	and returns the savings amount based on the current amount in the savings account 
	and the interest rate.(15 points)
https://youtu.be/iHb7CDr0Pzk
*/
package BankAccount;
import java.util.Scanner;
/**
 *
 * @author giant
 */
//public class bank {

public class BankAccount
{
    public double balance; 
    
    
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
        
    }
  
    public double getBalance()
    {return balance; 
    }
    
 public void deposit(double amount)
 {
     if(amount !=0)
     {
         balance = balance + amount;
     }
 }
 public void withdraw(double amount)
 {
     if(amount !=0)
     {
     balance = balance - amount;
     }
 }
 

public static void main(String[] args)
{
    //temp values for c and s accounts
    double cM = 1.32;
    double sM = 203.62;
    //Give myself accounts though I could spawn them after i give a name. 
    CheckingAccount cAccount = new CheckingAccount(cM);
    SavingsAccount sAccount = new SavingsAccount(sM);
    //scanner in
    Scanner input = new Scanner(System.in);
    System.out.println("Hi, what is your name?");
    String name = "";
    name = input.nextLine();
    //checking or savings
    int num =0;
    int num1=0;
    double num2= 0;
    //switch on num
    do{ System.out.println("What would you like to do?\n1-See Your checking account?\n2-See your savings account\n3-exit\nWill not end till you use 3.");
        num = input.nextInt();
    //switch wether we want to check the checking, savings, or exit
        switch(num)
        {case 1: {
            //checking route
            System.out.println(cAccount.balance);
            System.out.println("Would you like to make a \n1-deposit(amount)\n2-withdraw(amount)\n3-exit ");
            num1 = input.nextInt();
            //switch on num1 for deposit or withdraw
            switch(num1){
                case 1:System.out.println("How much?");
                    num2=input.nextDouble();
                    cAccount.deposit(num2);break;
                case 2:System.out.println("How much?");
                    num2=input.nextDouble();
                    cAccount.withdraw(num2);break;
                case 3:default:break;    }
                }
        break;
        case 2:{
            //Savings route
            System.out.println("The balance is : " +sAccount.balance + "\n"+ String.format("%.2f",(sAccount.getInterestRate(sM))) );
            System.out.println("Would you like to make a\n1-deposit(amount)\n2-withdraw(amount)?\n3-exit "); 
            num1 = input.nextInt();
             //switch on num1 for deposit or withdraw
            switch(num1){
                case 1: System.out.println("How much?");
                 num2=input.nextDouble();
                    sAccount.deposit(num2);break;
                case 2: System.out.println("How much");
                    num2=input.nextDouble();
                    sAccount.withdraw(num2);break;
                case 3:default:break;    }
        }
        break;
        case 3:{
        }
        default: System.out.println("Bye"); 
                    System.exit(0);
        }
    }while(num !=3);
        
}       

}
//}

