//https://youtu.be/iHb7CDr0Pzk
package BankAccount;

/**
 *
 * @author giant
 */
public class SavingsAccount extends BankAccount{
    
    
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
        
    }
 
    public double SavingsAccount(double initialBalance)
    {balance = initialBalance;
        return balance;
    }
    public void applyInterestRate()
    {double InterestRate = 1.00*(2.00/100.00);
        balance += (InterestRate * balance) ;
    }

public double getInterestRate(double initialBalance)
{   
    double InterestRate = 1.00*(2.00/100.00);
    System.out.println("The interest rate total after being applied would be added after the month will be: $" + (String.format("%.2f", (InterestRate*balance))));
    System.out.println("The current interest rate is: " +InterestRate + "%");
    return 0;
}

}

