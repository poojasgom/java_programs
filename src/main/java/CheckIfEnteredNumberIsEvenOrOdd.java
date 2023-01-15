import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckIfEnteredNumberIsEvenOrOdd {

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Please enter a number : ");
    double x = obj.nextInt();
    if(x>=0){
      System.out.println(x + " is positive");
    }
    else{
      System.out.println(x+ " is negative");
    }
  }
}
