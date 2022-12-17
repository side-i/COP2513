public class AccountTester {
   public static void main(String[] args){
      Account user = new Account(1122, 20000);
      user.setAnnualInterestRate(4.5);
      user.withdraw(2500);
      user.deposit(3000);
      System.out.println("The balance is : " + user.getBalance() + 
                        "\nThe monthyly interest is: " + user.getMonthlyInterest() +
                        "\nThe account was created on " + user.getDateCreated());
   }//End main
}//End AccountTester class