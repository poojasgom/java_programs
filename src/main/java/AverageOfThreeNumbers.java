import java.util.Scanner;

public class AverageOfThreeNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

      System.out.println("Avg of 3 numbers is  " +findAverage(num1,num2,num3));

  }

  private static int findAverage(int num1, int num2, int num3) {

    return (num1+num2+num3)/3;
  }
}
