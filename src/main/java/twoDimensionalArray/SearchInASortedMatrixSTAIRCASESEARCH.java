package twoDimensionalArray;

public class SearchInASortedMatrixSTAIRCASESEARCH {

  //Find key in a sorted matrix(int matrix[][]){
  public static boolean findKeyInSortedMatrix(int matrix[][], int key){

    int row = 0, column = matrix.length-1;
    while (row<matrix.length && column>=0){
      if(matrix[row][column] == key){
        System.out.println("Key found at position " +"(" +row+", "+column+")");
        return true;
      }

      if(key < matrix[row][column]){
column--; //go left
      }
      else{
        row++; // go down.
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = { {1, 2, 3, 4},
        { 5, 6,  7,  8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};

    findKeyInSortedMatrix(matrix,15);
  }
}
