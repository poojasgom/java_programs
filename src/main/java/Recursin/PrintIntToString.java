package Recursin;

//209 - print as two zero nine.
public class PrintIntToString {

  public static void printfromIntToString(int num){

    String digit[]  = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine"
        , "ten"};

    if(num==0){
      return;
    }
    int lastDigit = num%10;
    printfromIntToString(num/10);
    System.out.print(digit[lastDigit]+" ");
  }

  public static void main(String[] args) {
    printfromIntToString(209);
  }
}
