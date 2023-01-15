import java.util.Scanner;

public class CheckIfYearIsLeapYeaar {

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the year : ");
    int year = obj.nextInt();
    if(year%4 == 0){
      System.out.println("This is a leap year");
    }
    else{
      System.out.println("This is not a leap year");
    }
  }
}
