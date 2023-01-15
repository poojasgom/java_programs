public class PrintReverseOfANumber {

  public static void main(String[] args) {
    int number = 1234455;
    while (number > 0) {
      int currentNumber = number % 10;
      System.out.println(currentNumber);
      number = number / 10;
    }
  }
}
