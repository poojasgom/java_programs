import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
 int fact=1;

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int number = sc.nextInt();
    System.out.println(number);

   for(int i=1;i<=number;i++){
     fact = fact*i;
   }
    System.out.println("The factorial is " +fact);
  }
}
