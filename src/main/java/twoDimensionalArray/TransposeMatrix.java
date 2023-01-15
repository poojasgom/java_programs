package twoDimensionalArray;
//row to column. column to row swap.
public class TransposeMatrix {

  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

    int row = matrix.length;
    int col = matrix[0].length;
    System.out.println(row);
    System.out.println(col);
    int[][] newMatrix = new int[col][row];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        newMatrix[j][i] = matrix[i][j];
      }
    }
    printMatrix(newMatrix);
  }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] +" ");
      }
      System.out.println();
    }
  }
}
