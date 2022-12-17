import java.util.Scanner;
public class Prog {
   public static void main(String[] args){
      System.out.println("whats your name? ");
      String name = (new Scanner(System.in)).nextLine();
      Greeter g1 = new Greeter();
      g1.setGreetings("Yo, ");
      g1.greet(name);
      
      Greeter g2 = new Greeter();
      g2.setGreetings("Good day, ");
      g2.greet(name);
      
      Greeter[] greeters = new Greeter[3];
      
      for (int i = 0; i < greeters.length; i++){
         //Lets create each greeter, put it in the array
         greeters[i] = new Greeter();
         //then customize each of their greetings
        
         if (i == 0)
            greeters[i].setGreetings("#" + i + "says: Yo, ");
         else if (i == 1)
            greeters[i].setGreetings("#" + i + "says: Howdy, ");
         else if (i == 2)
            greeters[i].setGreetings("#" + i + "says: Yeehaw, ");
      }// end for
      
      //Lets make them all say hello
      for(int i=0 ; i < greeters.length ; i++)
         greeters[i].greet(name);
   }//End main
   
}//End class