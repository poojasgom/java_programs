import java.sql.SQLOutput;
import java.util.Scanner;

public class DisplayAllExeptMultiplesOfTen {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Enter a number ");
      int num = sc.nextInt();
      while (num % 10 != 0) {
        System.out.println("You entered " + num);
        break;
      }
      System.out.println("Do you wish to continue? Enter 1 to continue and 0 to exit");

    }
  }
}
