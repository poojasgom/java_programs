package Recursin;

//first print n and then decrease count of n and print rest.

public class PrintInDecreasingOrder {

  public static void printFromNto1(int n){
    if(n==1){
      System.out.println(1);
      return;
    }
    System.out.println(n);
    printFromNto1(n-1);
  }

  public static void main(String[] args) {
    int n = 10;

    printFromNto1(10);
  }
}
