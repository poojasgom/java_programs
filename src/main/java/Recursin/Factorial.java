package Recursin;
//n! = n *(n-1)!
public class Factorial {

  private static int fact = 1;

  public static void main(String[] args) {
    int n = 5;
    System.out.print(findFactorial(5));
  }

  public static int findFactorial(int n) {
    // base case
    if (n == 0) {

       return 1;
    }

    int fnm1 = findFactorial(n-1);
    int fn = n*fnm1;

    return fn;
  }
}



