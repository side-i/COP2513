public class FanTester {
   public static void main(String[] args){
      Fan f1 = new Fan();
      Fan f2 = new Fan();
      
      f1.setSpeed(f1.FAST);
      f1.setRadius(10);
      f1.setColor("yellow");
      f1.turnOn(true);
      
      f2.setSpeed(f2.MEDIUM);
      f2.setRadius(5);
      f2.setColor("blue");
      f2.turnOn(false);
      
      System.out.println(f1.toString());
      System.out.println(f2.toString());

   }//End main
}//End class