import java.util.Scanner;

public class isNumberEven {

  public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int num = sc.nextInt();
    boolean isEven = isEven(num);
    System.out.println(num +" is even ? " +isEven);
  }

  private static boolean isEven(int num) {
    if(num%2 == 0){
      return true;
    }
    else{
      return false;
    }
  }
}
