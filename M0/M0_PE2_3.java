import java.util.Scanner;
public class M0_PE2_3 { 
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      double grade = 0.0;
      double sum = 0.0;
      int count = 0;
      
      while (true){
         System.out.println("Input a grade");
         grade = s.nextDouble();
         if (grade < 0)
            break;
         else if (grade > 100){
            System.out.println("The grade must be between 0 and 100.0, inclusive");
            continue;
         }//End if statement
         else {
            sum += grade;
            count++;
         }//End else
      }//End while loop
      System.out.println("The average of all the grades is " + (sum / count));
   }//End main
}//End class