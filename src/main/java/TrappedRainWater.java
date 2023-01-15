// calcualte left and right max boundary as the min of these is that defines the max amount of
// water in b/w 2 pillars.. formula  = waterLevel - height[of current bar] * width of bar
public class TrappedRainWater {

  public static int findTrappedWater(int[] height){
    //calculate left max - store in array
    int[] leftMax = new int[height.length];
    leftMax[0] = height[0];
    int widthOfBar = 1;

    for(int i=1; i<height.length;i++){
      leftMax[i] =  Math.max(height[i], leftMax[i-1]);
    }

    //calculate right max - store in array
    int[] rightMax = new int[height.length];
    rightMax[rightMax.length-1] = height[height.length-1];

    for(int i=rightMax.length-2; i>=0;i--){
      rightMax[i] =  Math.max(height[i], rightMax[i+1]);
    }

    //loop
    //waterLevel = min(leftmax, rightmax)
    //trapped water = waterlevel - height[i] * width(of the bar);
    int trappedWater=0;
    for(int i=0;i<height.length;i++){
      int waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterLevel - height[i] * widthOfBar;
    }
 return trappedWater;
  }
  public static void main(String[] args) {
    int[] height = {4,2,0,6,3,2,5};
    System.out.println("The total trapped water is "+findTrappedWater(height));
  }
}
