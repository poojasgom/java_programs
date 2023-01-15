public class HWTrappedRainWater {

  public static int trappedWater(int[] heightOfBars){
    // calculte leftMax bar
    int[] leftMax = new int[heightOfBars.length];
    leftMax[0] = heightOfBars[0];
    for(int i = 1; i<leftMax.length;i++){
      leftMax[i] = Math.max(heightOfBars[i], leftMax[i-1]);
    }

    // calculate right max bar
    int[] rightMax = new int[heightOfBars.length];
    rightMax[heightOfBars.length-1] = heightOfBars[heightOfBars.length-1];
    for(int j = heightOfBars.length-2; j >=0;j--){
      rightMax[j] = Math.max(heightOfBars[j], rightMax[j+1]);
    }
    // loop
    int totTrappedWater = 0;
    for(int i =0; i< heightOfBars.length;i++){
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      totTrappedWater += waterLevel - heightOfBars[i] * 1;//(assuming width of bar is 1);
    }
    return totTrappedWater;
    //find water level min(left, right)
    // trapped water = waterlevel - helght of bar * width of bar.
  }
  public static void main(String[] args) {
    //int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int[] height = {4, 2, 0, 3, 2, 5};
    System.out.println(trappedWater(height));
  }
}
