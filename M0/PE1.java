import java.util.Scanner;
public class PE1 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int data = 0;
      int sum = 0;
      System.out.println("Enter an int value (the program exits if 0): ");
      data = input.nextInt();
      
      while (data != 0){
         sum += data;
         System.out.println("Enter an int value (the program exits if 0): ");
         data = input.nextInt();
      }//End of while loop
      
      System.out.println("The sum is " + sum);
   }//End main
}//End class