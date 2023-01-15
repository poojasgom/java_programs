import java.util.Scanner;

public class PrintATriangleStarPattern {

  public static void main(String[] args) {

    //print a right angled triangle
    Scanner sc = new Scanner(System.in);
    System.out.println("enter count");
    int linesToPrnt = sc.nextInt();
    for(int i = 1;i<linesToPrnt;i++){
      for(int j=1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
