package BackTracking;

public class NQueensChkSolnExistAndPrintOneOfThem {
  public static boolean nQueenApproach(char[][] board, int row) {

    //base case
    if (row == board.length) {
      //printBoard(board);
      return true;
    }
    //put Q in each column, add code to remove Q and put X to change location as needed.
    for (int j = 0; j < board.length; j++) {
      if (isSafe(board, row, j)) {
        board[row][j] = 'Q';
        if (nQueenApproach(board, row + 1)) { //chck if there is a solution and return true if
          // there is.
          return true;
        } else {
          board[row][j] = 'X';
        }
      }
    }
    return false;
  }

  private static boolean isSafe(char[][] board, int row, int col) {

    //VERTICAL UP
    for(int i = row-1;i>=0;i--){
      if(board[i][col]=='Q'){
        return false;
      }
    }

    //LEFT DIAGONAL UP
    for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
      if(board[i][j]=='Q'){
        return false;
      }
    }

    //RIGHT DIAGONAL UP

    for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
      if(board[i][j]=='Q'){
        return false;
      }
    }
    return true;
  }

  private static void printBoard(char[][] board) {
    System.out.println("--------------CHESS BOARD------------");
    for(int i =0;i<board.length;i++){
      for(int j = 0; j<board.length;j++){
        System.out.print(board[i][j] +" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    int n=4;
    char[][] board = new char[n][n];
    //initialize
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        board[i][j]='X';
      }
    }
   if(nQueenApproach(board,0)){
     System.out.println("POSSIBLE");
     printBoard(board);
   }
   else{
     System.out.println("SOLN not possible");
   }
  }

}
