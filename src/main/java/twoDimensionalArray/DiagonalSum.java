package twoDimensionalArray;

public class DiagonalSum {

  //diagonalSum
  public static int findDiagonalSumNestedLoops(int mattrix[][]){
    // Approach 1: O(n^2)
    int sum = 0;

    for(int i = 0; i<mattrix.length;i++){
      for(int j = 0; j<mattrix.length;j++){

        //Primary Diagonal
        if(i==j){
          sum+=mattrix[i][j];
        }
        //SecondaryDiagonal
        else if(i+j == mattrix.length-1){
          sum+=mattrix[i][j];
        }
      }
    }
    return sum;
  }

  //Time complexity O(n) space complexity O(1)
  public static int findDiagonalSumOptimized(int mattrix[][])
    {

      int sum =0;
     for(int i=0; i<mattrix.length;i++){
       //PD
       sum+=mattrix[i][i];
       //SD - also handling overlapping condition.
       if(i != mattrix[i][mattrix.length-i-1]){
         sum+=mattrix[i][mattrix.length-i-1];
       }
     }
     return sum;
    }

    public static void main(String[] args) {
    int matrix[][] = { {1, 2, 3, 4},
                      { 5, 6,  7,  8},
                       {9, 10, 11, 12},
                      {13, 14, 15, 16}};
    System.out.println("The diagonal sum is " +findDiagonalSumOptimized(matrix));
    }
  }


