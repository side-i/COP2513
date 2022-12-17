import java.util.Date;
public class PE9_3 {
   public static void main(String[] args){
      Date date = new Date();
      int elapsedTime = 10000;

      for (int i = 1; i < 8; i++){
         date.setTime(elapsedTime);
         System.out.println(date.toString());
         elapsedTime *= 10;
      }//End for
      
      System.out.println(date.getTime());      
   }//End main method
}//End class