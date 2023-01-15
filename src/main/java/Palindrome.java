import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int result =  isPalindrome(number);
    System.out.println("The number "+number +" is a palindrome? "+isEqual(number,result));
  }

  private static int isPalindrome(int number) {
    int reverse = 0;
    while (number>0){
      int lastDigit = number%10;
      reverse = (reverse*10)+lastDigit;
      number = number/10;
    }
    return reverse;
  }

  private static boolean isEqual(int number, int result){
    if(number==result) return true;
    return false;
  }
}
