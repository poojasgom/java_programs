package ArrayList;

import java.util.ArrayList;
//BFS = O(n^2)
//For given n lines on x axis , use 2 lines to form a container such that it holds max water/
public class FindMaxWaterStored {

  public static int findContainerWithMaxWater(ArrayList<Integer> height){
    int max_water =0;
    //Line 1 in the x axis
    for(int i=0;i<height.size();i++){
      //Line 2 on x axis to compare and find the amount of water stored b/w these 2 lines.
      for(int j=i+1;j<height.size();j++){
        int heightOfContainer = Math.min(height.get(i), height.get(j)); //min height of 2 heights
        // will be the amountof water that can be stored
        int widthOfContainer = j-i; //diff b/w 2 indices is the width
        int area = heightOfContainer*widthOfContainer; //current water stored.
        max_water = Math.max(area, max_water);
      }
    }
    return max_water;
  }
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    //1,8,6,2,5,4,8,3,7
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.println(findContainerWithMaxWater(height));
  }
}
