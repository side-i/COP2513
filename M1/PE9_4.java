import java.util.Random;

public class PE9_4 {
   public static void main(String[] args){
      Random x = new Random(1000);
      
      for (int i = 0; i < 49; i++){
         System.out.println(x.nextInt(100));
      }//End for loop
   }//End main
}//End class