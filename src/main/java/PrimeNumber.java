import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("Is my number Prime ? " +isPrimeOptimized(num));

}

  private static boolean isPrime(int num) {
 boolean isPrime=true;
 if(num==2) return true;
    for(int i=2;i<=num-1;i++){
      if(num%i == 0){
        isPrime=false;
        return isPrime;
      }
    }
    return isPrime;
  }

  private static boolean isPrimeOptimized(int num) {
    // to not do repetitiive work 2*3 = 3*2 -> we only need to do until 2*3..
    boolean isPrime=true;
    if(num==2) return true;
    for(int i=2;i<=Math.sqrt(num);i++){
      if(num%i == 0){
        isPrime=false;
        return isPrime;
      }
    }
    return isPrime;
  }

  }
