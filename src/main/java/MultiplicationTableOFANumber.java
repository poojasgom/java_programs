import com.sun.deploy.util.SyncAccess;
import java.util.Scanner;

public class MultiplicationTableOFANumber {

  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    int result=0;
    for(int i=1; i<=10;i++){
      result = number*i;
      System.out.println(result);
    }
  }
}
