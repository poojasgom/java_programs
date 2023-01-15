package Recursin;
//print from 1 to n.
public class PrintNumbersInINcreasingOrder {
//f10 = f(n-1)+n
  public static void printNumberIncOrder(int n){

    if(n == 1){
      System.out.println(1);
      return;
    }
   printNumberIncOrder(n-1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    printNumberIncOrder(10);
  }

}
