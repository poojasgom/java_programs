import java.util.Scanner;

public class SumOfNumbers {

  public static void main(String[] args) {
    int evenSum = 0;
    int oddSum = 0;
    int choice = 1;
    do {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter a number ");

      int number = obj.nextInt();
      if (number % 2 == 0) {
        evenSum = evenSum + number;
      } else {
        oddSum = oddSum + number;
      }

      System.out.println("Do you want to continue ? Enter 1 for yes and 0 for no");
      choice = obj.nextInt();

    } while (choice == 1);

    System.out.println("Sum of even number =" +evenSum);

    System.out.println("Sum of odd number =" +oddSum);
  }
}
