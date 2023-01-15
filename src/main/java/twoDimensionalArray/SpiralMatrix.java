package twoDimensionalArray;


public class SpiralMatrix {

  public static void printSpiralMatrix(int matrix[][]){

    int startRow = 0, startCol =0, endRow = matrix.length-1, endCol = matrix[0].length-1;

    while( startRow <= endRow && startCol<=endCol){
      //Print the topRow
      for(int j= startCol; j<=endCol; j++){
        System.out.print(matrix [startRow][j]+" ");
      }

      //Print rightCol
      for(int i =startRow+1; i<=endRow; i++ ){
        System.out.print(matrix[i][endCol]+" ");
      }

      //Print bottom
      for(int j=endCol-1;j>=startCol;j--){
        if(startCol == endCol)return; // condition to avoid duplicate center to be printed in n*m
        // matrix.
        System.out.print(matrix[endRow][j]+" ");
      }

      // Print left
      for(int i=endRow-1; i>=startRow+1 ; i--){
        if(startRow == endRow)return;
        System.out.print(matrix[i][startCol]+" ");
      }
      startRow++;
      startCol++;
      endCol--;
      endRow--;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int matrix[][] = { {1, 2, 3, 4,6},
        { 5, 6,  7,  8,6},
        {9, 10, 11, 12, 6},
        {13, 14, 15, 16, 6},
        {17, 18, 19, 20, 6},
        {22, 28, 29, 30, 6}};

    printSpiralMatrix(matrix);
  }

}
