import java.util.*;
public class sumof3numbersUsingScanner {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraiser = sc.nextFloat();

    float total = (pen+pencil+eraiser);
    float totalWithTax = total+18%(total);
    System.out.println(totalWithTax);
    int $ = 24;
  }
}
