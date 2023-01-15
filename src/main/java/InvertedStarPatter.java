import java.util.Scanner;

public class InvertedStarPatter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int linesToPRint = sc.nextInt();
    for(int i = linesToPRint;i>0;i--){
      for(int j = 1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
