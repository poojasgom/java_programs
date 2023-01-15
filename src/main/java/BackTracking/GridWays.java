package BackTracking;
//O(2^n+
// m)
//find number of ways to reach  from (0,0) to (n-1,m-1) in a n*m grid. Allowed moved right and
// down.
//assume i am on (0,0) if i go right then i have more (x,y+1) ways to reach to target and if i
// move down then i have (x+1, y) ways to reach to target.
// if i am on target then 1 way (go to itself) to reach the target.
public class GridWays {

  public static int findGridWays(int n, int m, int indexForRow, int indexForCol){
    //base case
    if(indexForCol==m-1 || indexForRow==n-1){
      return 1;
    }else if(indexForRow==n || indexForCol==n){
      return 0;
    }
    int way1 = findGridWays(n, m, indexForRow+1, indexForCol);
    int way2 = findGridWays(n,m, indexForRow, indexForCol+1);
    int totalWay = way1+way2;
    return totalWay;
  }
  public static void main(String[] args) {
    int n=3, m=3;
    System.out.println(findGridWays(n,m,0,0));
  }
}