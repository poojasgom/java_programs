package Recursin;

//f(n) = n +f(n-1)
public class PrintFromTento1 {

  public static void main(String[] args) {
    int n =10;
    printFromNto1(n);
  }

  public static void printFromNto1(int n){
    if( n == 1){ //BASE CASE
      System.out.println(n); //print until n =1.
      return;
    }
    System.out.println(n+" "); //print current value
    printFromNto1(n-1); // decrement n .
  }
}
