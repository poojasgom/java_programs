public class ReverseTheNumber {

  public static void main(String[] args) {


int number = 12312312;
int reverse = 0;
int lastDigit=0;
while(number>0){
  lastDigit = number%10;
  reverse = (reverse*10)+lastDigit;
  number = number/10;
  }
    System.out.println(reverse);
}
}
