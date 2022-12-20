public class TODOList {
   private TODO[] tasks;
   private int capacity;
   private int size;
   
   public TODOList() {
      this(10); //Default capacity is 10
   }
   
   public TODOList(int capacity){
      this.capacity = capacity;
      size = 0;
      tasks = new TODO[capacity];
   }
   
   public void add (TODO task){
      if (capacity >= size){
         TODO[] tmp = (new TODO[capacity*2]);
         System.arraycopy(tasks, 0, tmp, 0, tasks.length);
         tasks = tmp;
      }
      
      tasks[size++] = task;
   }
   
   public String toString(){
      String result = "";
      for (TODO e: tasks){
       if (e!=null) result += e.toString() + "\n";
      }//end for  
      return result;
   }

}//End TODOList