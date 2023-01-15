package Recursin;

public class PrintxtopowerOfN {

  //f(2^3) = X * f(n-1)
  //O(n^2)
  public static int printpower(int x, int n){

    if(n==0){
      return 1;
    }
    int fnm1 = printpower(x,n-1);
    int fn = x * fnm1;
    return fn;
  }
  public static void main(String[] args) {
    System.out.println(printpower(2,4));
  }
}
