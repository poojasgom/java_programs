package BackTracking;

public class SudokuSolver {

  public static boolean solveMySudoko(int[][] sudoku, int row, int col) {

    //base case
    if (row == 9 && col == 9) {
      return true;
    } else if (row == 9) { //more cols than rows
      return false;
    }

    //to go to next row
    if (col + 1 == 9) {
      col = 0;
      row = row + 1;
    }

    // recursion - kaam
    for (int digit = 0; digit < 9; digit++) {
      if (sudoku[row][col] == 0) {
        if (isSafe(sudoku, row, col, digit)) {
          sudoku[row][col] = digit;
          if (solveMySudoko(sudoku, row, col + 1)) {
            return true;
          } else {
            sudoku[row][col] = digit;
          }
        }
      } else {
        solveMySudoko(sudoku, row, col + 1);
      }
    }
    return false;
  }

  public static void main(String[] args) {

  }

  private static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
    //check horizontal
    for (int i = 0; i <= 8; i++) {
      if (sudoku[i][col] == digit) {
        return false;
      }
    }
    //check vertical
    for (int j = 0; j <= 8; j++) {
      if (sudoku[row][j] == digit) {
        return false;
      }
    }

//check grid
    int sr = (row / 3) * 3;
    int sc = (row / 3) * 3;
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (sudoku[i][j] == digit) {
          return false;
        }
      }
    }
    return true;
  }
}
