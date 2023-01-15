import java.util.Scanner;

public class CheckIfANumberIsPrime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i < Math.sqrt(num); i++) { //done to reduce the duplicates being processed.
      if(num==2) isPrime=true;
else {
        if (num % i == 0) {//is n completely divisible by i then its not prime
          isPrime = false;
        }
      }
    }
    if (isPrime == true) {
      System.out.println("PRIME");
    } else {
      System.out.println("Not Prime");
    }
  }
}
