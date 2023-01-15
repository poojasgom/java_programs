package Recursin;

public class TilingProblem {

  public static int findNumberOfTiles(int n){ //2 X n(length)

    //base case
    if(n==0 || n==1){
      return 1;
    }
    //kaam
    //make choice

    int verticalTilefnm1 = findNumberOfTiles(n-1); //once you place 1 tile of 2*1 vertically then
    // there are remaining n-1 space to be filled
    int horizontalfnm2 = findNumberOfTiles(n-2); //once you place 1 tile of 2*1 horizontally then
    // there are remaining n-2 space to be filled

    int totalWays = verticalTilefnm1 + horizontalfnm2;
    return totalWays;
  }
  public static void main(String[] args) {
    System.out.println(findNumberOfTiles(4));
  }
}
