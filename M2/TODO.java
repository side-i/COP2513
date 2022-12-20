import java.util.Date;

public class TODO {
   private String title;
   private String description;
   private Date dateCreated;
   private Date dateCompleted;
   private boolean isDone;
   
   public TODO(String title, String description){
      this.title = title;
      this.description = description;
      dateCreated = new Date();
      dateCompleted = null;
      isDone = false;
   }//End constructor
   
   public TODO(){
      this("Default TODO task", "...");
   }//end constructor
   
   public String toString(){
      return "[" + (isDone? "x" : " ") + "] \t" 
         + "-" + title + ": " + description + "\n"
         + "\t   " + "Created on: " + dateCreated + "\n"
         + "\t   " + "Completed on: " + (isDone? dateCompleted: "Not completed yet");
     
   }//end toString
   
   public boolean isDone(){
      return isDone;
   }//end isDone
   
   public void setDone(boolean flag){
      if(flag)
         dateCompleted = new Date();
      else 
         dateCompleted = null;
         
      if (isDone != flag){
         isDone = flag;
      }//end if
   }//End setDone
   
}//end class