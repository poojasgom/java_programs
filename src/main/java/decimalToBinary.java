import java.util.Scanner;

//Divide each digit by 2and get the remainder.
// 7 :2 -> quo :3 rem 1 -> quo
public class decimalToBinary {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    convertFromDecimalToBnary(num);
  }

  private static void convertFromDecimalToBnary(int num) {
    int pow = 0;
int binNum = 0;
    while(num>0){
       int rem = num%2;
        binNum = binNum + rem*(int)Math.pow(10, pow);
        num = num/2;
        pow++;
    }
    System.out.println(binNum);
  }


}
