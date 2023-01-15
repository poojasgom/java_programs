package Recursin;
//f(n) = f(n-1)+n
public class PrintFrom1to10 {

  public static void main(String[] args) {
    int n = 10;
    printHere(10);
  }

  public static void printHere(int n){
    if(n==1){
      System.out.println(n);
      return;
    }
    printHere(n-1);
    System.out.println(n);
  }
}
