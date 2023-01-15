//prog to decide when is the best day to buy / sell stock to get max profit Prg returns max
// profit for the given prices for a stock for a few days.
public class ArrayBuySellStock {

  public static  int buySellStock(int[] stockPrice){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0; i<stockPrice.length;i++){
      if(stockPrice[i] > buyPrice){ // profit case
       int profit = stockPrice[i] - buyPrice; //today's profit
        maxProfit = Math.max(profit, maxProfit); // profit until today.
      }
      else{ //loss case, dont sell just buy stock
        buyPrice = stockPrice[i];
      }
    }
return maxProfit;
  }


  // home work :

  public static int getMaxProfit(int[] prices){
    int maxProfit = 0;
    int buyingPrice = Integer.MAX_VALUE;
    for(int i =0; i<prices.length;i++) {

      if (prices[i] > buyingPrice) { // profit
        int profit = prices[i] - buyingPrice;
        maxProfit = Math.max(profit, maxProfit);
      }
      else{ // dont sell , just buy
        buyingPrice = prices[i];
      }
    }
      return maxProfit;
  }
  public static void main(String[] args) {
//int prices[] = {7,1,5,3,6,4}; //profit
    int prices[] = {7,6,4,3,1}; // loss - return 0.

    System.out.println("Max profit that could be made is 5 as we buy with 1 and sell on 6 price. "+getMaxProfit(prices));
  }
}
