public class TODOTest{
   public static void main(String[] args){
      // testing TODO class
      TODO one = new TODO();
      TODO two = new TODO("Write some code", "Anything, really, just anything will do...");
      System.out.println(one);
      System.out.println(two);
      
      one.setDone(true);
      System.out.println(one);
      one.setDone(false);
      System.out.println(one);
      
      
      // testing TODOList class
      TODOList list = new TODOList(2); 
      list.add(one);
      list.add(two);
      System.out.println(list);
      list.add(one);
      list.add(two);
      System.out.println(list);
      
      // testing TODOv2 class
      /*
      TODOv2 v21 = new TODOv2();
      TODOv2 v22 = new TODOv2("Write some code", "Anything, really, just anything will do...");
      TODOv2 v23 = new TODOv2("another task", "Running out of ideas here...");
      System.out.println(TODOv2.toStringAll());
      */
      
   }// end of main method

} // end of class