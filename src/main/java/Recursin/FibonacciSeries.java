package Recursin;

public class FibonacciSeries {

  //fn = f(n-1)+f(n-2) //f(3)= f(2) +f(1)
  //O(n^2) -> each time the count increases exponentially.
  public static int findMyFibonacciCount(int n){
   if(n==0 || n==1){
     return n;
   }

   int fnm1 = findMyFibonacciCount(n-1);
   int fnm2 = findMyFibonacciCount(n-2);
   int fn =  fnm1+fnm2;
    //System.out.println(fn);
   return fn;
  }

  public static void main(String[] args) {
    System.out.println(findMyFibonacciCount(5));
  }
}
//01123