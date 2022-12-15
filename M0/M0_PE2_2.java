import java.util.Scanner;
public class M0_PE2_2 {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = 0;
            
      while (n != -1){
         System.out.println("Enter a value");
         n = s.nextInt();
         if (n == -1) break;
         for (int i = n; i > 0; i--){
            if (i % 2 != 0)
               System.out.print(i + "...");
         }//End for loop
         
         System.out.println();
         
      }//End while loop
   }//End of main
}//End of class