public class Greeter {
   
   public String msg = "Hello, ";
   
   public void greet(String name){
      System.out.println(getGreetings(name));
      //We are able to call another static method from this one
   }//End greet
   
   public String getGreetings(String name){
      return msg + name;
   }//End getGreetings

   public void setGreetings(String message){
      msg = message;
   }//end setGreetings
}//End class