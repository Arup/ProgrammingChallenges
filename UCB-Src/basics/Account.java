package basics;

public class Account {
	Account parentAccount;
    // This class represents a bank account whose current
    // balance is a nonnegative amount in US dollars.

    // Initialize an account with the given balance. 
    public Account (int balance, Account pAccount) {
        this.myBalance = balance;
        this.parentAccount= pAccount;
    }
    
    // Initialize an account with the given balance. 
    public Account (int balance) {
    	this(balance,null);
    }
    
    // Add the given amount to the account.
    public void deposit (int amount) {
        if (amount < 0) {
            System.out.println ("Cannot deposit negative amount.");
        } else {    
            this.myBalance = this.myBalance + amount;
        }
    }
    
    // Subtract the given amount from the account
    // if possible.  If the amount would leave a
    // negative balance, print an error message and
    // leave the balance unchanged.
    /*
    public void withdraw (int amount) {
        if (amount < 0) {
            System.out.println ("Cannot withdraw negative amount.");
        } else if (this.myBalance < amount) {
            System.out.println ("Insufficient funds");
        } else {
            this.myBalance = this.myBalance - amount;
        }
    }*/
    
    public boolean withdraw (int amount) {
    	   if (amount < 0) {
               System.out.println ("Cannot withdraw negative amount.");
               return false;
           } else if (this.myBalance > amount) {
               this.myBalance=this.myBalance-amount;
               return true;
           }else if (this.myBalance < amount && this.parentAccount!=null) {
                 parentAccount.withdraw(amount-this.balance());
          	     this.myBalance=0;
               return true;
           } else{
        	   return false;
           }
    }
    
    // Return the number of dollars in the account.
    public int balance ( ) {
        return this.myBalance;
    }
    // Merge account "anotherAcct" into this one by 
    // removing all the money from anotherAcct and 
    // adding that amount to this one.
    public void merge (Account anotherAcct) {
        /* put something here */
    	this.myBalance+=anotherAcct.myBalance;
    	anotherAcct.myBalance=0;
    }

    
    // instance variables:
	private int myBalance;
	
}