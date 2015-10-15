
package account;



public class Account {

  
    public static void main(String[] args) {
         
     
       
       TestAccount savings = new TestAccount();
       savings.setID(5648);    
       savings.setAnnualInterestRate(3.9); // sets annual interest rate to 3.9%
       savings.setBalance(27000);       // sets balance equal to 27000
       savings.setWithdraw(7500);      // sets withdraw amount to 7500
       savings.setDeposit(11000);     // sets deposit amount to 11,000
       
       
       System.out.println("ID: " + savings.getID());
       System.out.println("Balance: $" + savings.getBalance()); // prints balance
       System.out.println("Annual Interest Rate: " + savings.getAnnualInterestRate());  // prints interest rate
       System.out.println("Date Created: 5/3/2015") ; // prints the date created 
       System.out.println("Monthly Interest: $" + savings.getBalance() * savings.getMonthlyInterestRate() ); // prints the monthly interest
       System.out.println("Monthly interest rate: " + savings.getMonthlyInterestRate()); // prints the monthly interest rate
       
       
    
        
        double interestEarned = 0.0;
        double totalDeposits = 0;
        double totalWithdrawn = 0; // variables used to help print out the total balance
        
        
        
       
        
         System.out.println("Enter amount withdrawn: $" + savings.getWithdraw());
           
         totalWithdrawn = savings.getBalance() - savings.getWithdraw();  // withdraws money from account
         
         System.out.println("Monthly Interest: $" + totalWithdrawn * savings.getMonthlyInterestRate() ); // used getters to obtain monthly interest again
           
           
        
        System.out.println("Enter amount deposited: $" + savings.getDeposit());
           totalDeposits = totalWithdrawn + savings.getDeposit();  // deposits a set amount into account
           
           System.out.println("Monthly Interest: $" + totalDeposits * savings.getMonthlyInterestRate()); // used getters to obtain monthly interest for the 3rd time
           
           
           
           System.out.println("Total Balance: $" + totalDeposits);
           // prints total balance after withdraw and deposit has been made
           
           
    }
    }

    

