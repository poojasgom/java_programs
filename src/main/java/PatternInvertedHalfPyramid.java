public class PatternInvertedHalfPyramid {

  public static void main(String[] args) {
   // printInvertedHalfPyramid(5);
    //printInvertedPyramidWithNumbers(5); i=count; j <=i;print(num) num++
    //leftHalfPyramid(5); - i <=n; j<=i prinT
    //ZeroOnetrianglePattern(5); i+j%2 == 0 print 1 else print 0
    //butterfly_pattern(5);(star(i<=n , j<=i) space = 2(n-i); star( j<=i)
   // solidRhombus(10); // space (n-i) star (n)
    //hollowRhombus(5); - space (n-1) star (1, n on j and i)
    diamondPattern(4); //(n-1) oddnu, = 2*i-1
  }

  public static void printInvertedHalfPyramid(int count){
    for(int i= count; i>=1; i--){
      for(int j =1; j<i; j++){
        System.out.print("*");
      }
      System.out.println();

    }
  }

  public static void printInvertedPyramidWithNumbers(int count){
    //int num = 1;
    for(int i =count;i>0;i--){
      int num = 1;
      for(int j = 1;j<i;j++){
        System.out.print(num);
        num++;
      }
      System.out.println();
    }
  }

  //LOgic = always the sum of row+col = even then print 1 else print 0/
  public static void ZeroOnetrianglePattern(int count){
    int start  = 1;
    for (int i=1;i<=count;i++){
      for(int j = 1;j<=i;j++ ){
        if ((i + j) % 2 == 0) {
          System.out.print(1);
        }
        else{
          System.out.print(0);
        }
      }
      System.out.println();
    }

  }
//always current i =  numofstars, and totalCount-i = space.
  public static void leftHalfPyramid(int count){
    for(int i=1;i<=count;i++){

      //spaces
      for(int j=1;j<=count-i;j++){
        System.out.print(" ");
      }
      //print stars
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void butterfly_pattern(int count){
    for(int i=1;i<=count;i++){
      //first stars + spaces+ stars

      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=1;j<2*(count-i);j++){
        System.out.print(" ");
      }
      for(int j = 1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i = count;i>=1 ; i--){
      for(int j=1; j<=i;j++){
        System.out.print("*");
      }
      for(int j = 1;j<2*(count-i);j++){
        System.out.print(" ");
      }
      for(int j =1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void solidRhombus(int n){
    for(int i=1;i<=n;i++){
      for(int j =1; j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void hollowRhombus(int n ){
    //space stars space
    for(int i=1; i<=n; i++){
      for(int j = 1; j<=(n-i);j++){
        System.out.print(" ");
      }
      for(int j =1; j<=n;j++){
        if(i==n || i == 1 || j== n || j==1 ){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }

      }
      System.out.println();

    }
  }

  public static void diamondPattern(int n){

    for(int i=1;i<=n ;i++){
      for(int j = 1; j<=n-i;j++){
          System.out.print(" ");
        }
      for(int j=1; j<=2*(i)-1;j++ ){
        System.out.print("*");
      }
      System.out.println();
    }

    //2nd half

    for(int i = n ; i>0; i--){
      for(int j=1; j<=n-i;j++){
        System.out.print(" ");
      }

      for(int j = 1; j<=2*i-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
