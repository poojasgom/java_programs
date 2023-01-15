import java.util.Scanner;

public class PrintPrimeInARange {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    primeInThisRange(num);
  }

  private static boolean isPrime(int num) {
boolean isPrime=true;
    if (num == 2) return true;
    for(int i=2;i<=Math.sqrt(num);i++){
      if(num%i == 0 ){
       isPrime = false;

      }
    }
    return isPrime;
  }

  public static void primeInThisRange(int num){
    for(int i=2;i<=num;i++){
      if(isPrime(i)){
        System.out.print(i+ " ");
      }
    }
    System.out.println();
  }

}
