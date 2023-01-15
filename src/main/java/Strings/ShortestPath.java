package Strings;
//O(n)shortest path = sqrt(X^2 +Y^2)
public class ShortestPath {

  private static float getShortestPathToDestination(String givenPath){
  // coordinates initialization
    int x=0, y=0; float shortestPath=0;

    for(int i=0; i<givenPath.length();i++){
      if(givenPath.charAt(i)=='N'){
        y++;
      }else if(givenPath.charAt(i)=='S'){
        y--;
      }else if(givenPath.charAt(i)=='E'){
        x++;
      }
      else if(givenPath.charAt(i) =='W'){
        x--;
      }

      //use formula to find shortestpath
      int X2 = x*x;
      int Y2 = y*y;
      shortestPath = (float) Math.sqrt(X2 + Y2);

    }
    return shortestPath;
  }

  public static void main(String[] args) {
    String givenPath = "WNEENESENNN";
    System.out.println(getShortestPathToDestination(givenPath));
  }
}
