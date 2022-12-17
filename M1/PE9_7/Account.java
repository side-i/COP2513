import java.util.Date;
public class Account {
   
   private int id = 0;
   private double balance = 0;
   private static double annualInterestRate = 0;
   private Date dateCreated = new Date();
   
   public Account() {
   }
   
   public Account(int id, double balance){
      this.id = id;
      this.balance = balance;
   }
   
   public String getDateCreated() {
      return dateCreated.toString();
   }
   
   public int getId(){
      return id;
   }//End getId
   
   public void setId(int id){
      this.id = id;
   }//End setId
   
   public double getBalance(){
      return balance;
   }//End getBalance
   
   public void setBalance(double balance){
      this.balance = balance;
   }//End setBalance
   
   public double getAnnualInterestRate() {
      return annualInterestRate;
   }//End getInterestRate
   
   public void setAnnualInterestRate(double annualInterestRate){
      this.annualInterestRate = annualInterestRate;
   }//End setAnnualInterestRate
   
   public double getMonthlyInterestRate() {
      return annualInterestRate / 12;
   }//end getMonthlyInterestRate
   
   public double getMonthlyInterest() {
      return (balance * getMonthlyInterestRate()) / 100;
   }//End getMonthlyInterest
   
   public void withdraw(int amount){
      balance -= amount;
   }//End withdraw
   
   public void deposit(int amount){
      balance += amount;
   }//End deposit
}//End class