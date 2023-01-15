package BackTracking;

public class NQueensCountWays {
static int count= 0;
  public static int NQueensCount(char[][] board, int row){

    //base case
    if(row==board.length){
      count++;
      return count;
    }

    //Place each queen in each of n cols.
    for(int j=0;j<board.length;j++){
      if(isSafe(board,row, j)) {
        board[row][j] = 'Q';
        NQueensCount(board, row + 1);
        board[row][j] = 'X';
      }
    }
    return count;
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


  public static void main(String[] args) {
   int n=2;
    char[][] board  = new char[n][n];
    //Initialize
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board.length;j++){
        board[i][j]='X';
      }
    }
    int count = NQueensCount(board,0);
    System.out.println(count);
  }

}