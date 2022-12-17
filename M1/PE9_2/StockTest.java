public class StockTest {
   public static void main(String[] args){
   Stock s1 = new Stock("Oracle Corporation", "ORCL");
   s1.setPreviousClosingPrice(34.5);
   s1.setCurrentPrice(34.35);
   
   System.out.println("The percent change for " + s1.name + " (" + s1.symbol + ") is \n" +
      s1.getPercentChange());
   }//End main
}//End StockTest