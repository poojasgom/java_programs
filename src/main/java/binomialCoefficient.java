import java.util.Scanner;

//n!/r!*(n-r)!
public class binomialCoefficient {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    int factn = findFactorial(n);
    int factr = findFactorial(r);
    int factnsubr = findFactorial(n-r);

    int bnoCoeff = factn / factr *(factnsubr);
    System.out.println("My BinomialCoeff is " +bnoCoeff);
  }

  private static int findFactorial(int num){
    int fact = 1;
    for(int i=1; i<=num;i++){
      fact=fact*i;
    }
    return fact;
  }

}
