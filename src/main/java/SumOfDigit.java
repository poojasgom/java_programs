import java.util.Scanner;

public class SumOfDigit {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    while (num>0){
      int lastDigit = num%10;
      sum = sum+lastDigit;
      num = num/10;

    }
    System.out.println("My sum of digit is "+sum);
  }
}
