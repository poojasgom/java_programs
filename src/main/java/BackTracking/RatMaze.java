package BackTracking;

public class RatMaze {

  public static void main(String[] args) {
    int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 1, 1, 1}};
    solvemaze(maze);
  }

  private static boolean solvemaze(int[][] maze) {
    int n = maze.length;
    int sol[][] = new int[n][n];
    if (solvemazeUtil(maze, 0, 0, sol) == false) {
      System.out.println("Solution does not exist");
      return false;
    }
    printSolution(maze);
    return true;
  }

  private static void printSolution(int[][] maze) {
    for (int i = 0; i < maze.length; i++) {
      for (int j = 0; j < maze.length; j++) {
        System.out.print(maze[i][j]+" ");
      }
      System.out.println();
    }
  }

  private static boolean solvemazeUtil(int[][] maze, int x, int y, int[][] sol) {
    if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
      sol[x][y] = 1;
      return true;
    }
    //check if maze[x][y] is valid
    if (isSafe(maze, x, y) == true) {
      if (sol[x][y] == 1) {
        return false;
      }
      sol[x][y] = 1;

      if (solvemazeUtil(maze, x + 1, y, sol)) {
        return true;
      }

      if (solvemazeUtil(maze, x, y + 1, sol)) {
        return true;
      }
      sol[x][y] = 0;
      return false;
    }
    return false;
  }

  private static boolean isSafe(int[][] maze, int x, int y) {
    //if(x,y outside maze) return false
    return (x>=0 && x<maze.length && y>=0 && y<maze.length && maze[x][y]==1);
  }
}
