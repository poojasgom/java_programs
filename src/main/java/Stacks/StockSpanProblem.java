package Stacks;

//Gven rates of stock for each day find the span for which the stock was <=today's price.
//Approach : make a span array -> in this we store span currentIndex-IndexofPrevHigh from stack.
//insert in stack first the first element index, now for 2nd element chck if any element in stack
// is less than current stock price, if yes remove elements from stack until 2nd remains high
// than all elements from stack and store the index of that element- stackIndex.

import java.util.Stack;

public class StockSpanProblem {


  private static void stocksSpan(int[] stocks, int[] span) {

    Stack<Integer> s = new Stack<>();
    span[0] =1; //always as no other elements to compare on before 0.
    s.push(0);
    for(int i=1;i<stocks.length;i++){
      int currPrice  = stocks[i];
      //chck if curre price is > then eleme in stocks keep removing elements from stack until we
      // reach element that is greater.
      while (!s.isEmpty() && currPrice > stocks[s.peek()]){
        s.pop();
      }
//if all elements are removed - occurs when currStockrate>=allprev
      if(s.isEmpty()){
        span[i] = i+1;
      }else{
        int prevHigh = s.peek();
        span[i] = i-prevHigh;
      }
      s.push(i);
    }
   }


  public static void main(String[] args) {
    int stocks[] = {100,80,60,70,60,85,100};
    int span[] = new int[stocks.length];
    stocksSpan(stocks,span);
    for(int i=0;i<span.length;i++){
      System.out.println(span[i]+" ");
    }
  }

}
