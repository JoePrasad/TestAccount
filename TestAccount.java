
package account;


public class TestAccount {
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private String dateCreated;
    private double monthlyInterestRate;
    private double monthlyInterest;
    private int months;
    private double withdraw;
    private double deposit;

    
    
    public double getMonthlyInterestRate() {
        monthlyInterestRate = (annualInterestRate/12)/100;
       return monthlyInterestRate;
         
    }
  
    public double getMonthlyInterest() {
       monthlyInterest = balance*monthlyInterestRate;
       return monthlyInterest;
    }
  
    public void withdraw(double amount) {
       balance -= amount;
      
        }
   
    public void deposit (double am) {
        balance += am;
    }
   
    public double getBalance() {
        return balance;
    }
   
    public void setBalance(int balance){
        this.balance = balance;
    }
   
   
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
   
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
   
    public double getID(){
        return id;
    }
   
    public void setID(int id) {
        this.id = id;
    
}
    public String getDateCreated() {
        return dateCreated;
    }
    public double getWithdraw() {
        return withdraw;
    }
    
    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
    
    public double getDeposit() {
        return deposit;
    }
    
    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
    
            
}
