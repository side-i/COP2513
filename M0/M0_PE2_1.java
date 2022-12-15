import java.util.Scanner;
public class M0_PE2_1 {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int stars = 0;
      int lines = 0;
      
      System.out.println("How many stars");
      stars = s.nextInt();
      System.out.println("How many lines");
      lines = s.nextInt();
      
      while (lines > stars){
         System.out.println("Error, number of line is greater than stars, enter a new number of lines");
            lines = s.nextInt();
      }//End of while loop
      
      for (int j = 0; j < lines; j++){
         for (int i = 0; i < stars; i++){
            System.out.print("*");
         }//End nested for loop
         System.out.print("\n");
         stars -= 1;
      }//End for loop
   }//End of main
}//End of class
