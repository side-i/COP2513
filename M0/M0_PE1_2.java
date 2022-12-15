import java.util.Scanner;
public class M0_PE1_2 {
   public static void main(String[] args){
      final double PI = 3.14159;
      Scanner input = new Scanner(System.in);
      double radius = 0.0;
      double area = 0.0;
      
      System.out.println("Enter a number for radius: ");
      radius = input.nextDouble();
      area = (radius * radius) * PI;
      
      System.out.println("The area of the cirle is " + area);
      
   }//End main
}//End class