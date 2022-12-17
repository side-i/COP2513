public class Fan {
   final int SLOW = 1;
   final int MEDIUM = 2;
   final int FAST = 3;
   
   private int speed = SLOW;
   private boolean on = false;
   private double radius = 5;
   public String color = "blue";
   
   public Fan() {
   }
   
   public int getSpeed() {
      return speed;  
   }
   
   public void setSpeed(int speed){
      this.speed = (speed > 0 && speed < 4) ? speed :  1;
   }
   
   public boolean isOn() {
      return on;  
   }
   
   public void turnOn(boolean on){
      this.on = on;
   }

   public double getRadius() {
      return radius;  
   }
   
   public void setRadius(double radius){
      this.radius = radius;
   }
   
   public String getColor(){
      return color;
   }

   public void setColor(String color){
      this.color = color;  
   }
   
   public String toString(){
      if (on == true)
         return speed + " " + color + " " + radius;
      else
         return "fan is off " + color + " " + radius;
   }
}//End class