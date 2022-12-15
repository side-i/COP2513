import java.util.Scanner;
public class M0_PE1_4 {
   public static void main(String[] args){
      int number = 0;
      int guess = 0;
      Scanner input = new Scanner(System.in);
      
      number = (int)(Math.random() * 101);
      guess = -1;
      
      while (true) {
         System.out.print("Enter your guess: ");
         guess = input.nextInt();
         
         if (number == guess){
            System.out.println("Yes, the number is " + number);
            break;
         }//End if
         else if (guess > number)
            System.out.println("Your guess is too high");
         else
            System.out.println("Your guess is too low");
            
      }//End while loop
   }//End main 
}//End class