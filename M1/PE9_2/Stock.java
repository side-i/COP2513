public class Stock {
   
   String symbol;
   String name; 
   double previousClosingPrice;
   double currentPrice;
   
   public Stock(String newName, String newSymbol){
      name = newName;
      symbol = newSymbol;
   }//End Stock constructor
   
   public void setPreviousClosingPrice(double number){
      previousClosingPrice = number;
   }//End setClosingPrice
   
   public void setCurrentPrice(double number){
      currentPrice = number;
   }//End setCurrentPrice

   public double getPercentChange(){
      return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
   }//End getChangePercent
}//End class