package ArrayList;
//O(n)
//take 2 pointers one at start and one at end.. find area and then compare to maxWater ,
// increment leftptr or decrement rightpointer based on which ever is small, as the small one
// always defines the amount of water that can be stored.
import java.util.ArrayList;

public class FindMaxWaterStoredPointersApproach {


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

  private static int findContainerWithMaxWater(ArrayList<Integer> height) {
    int max_water =0;

    int lp = 0;
    int rp = height.size()-1;
    while (lp<rp){
      int heightOfcontainer = Math.min(height.get(lp), height.get(rp));
      int widthOfContainer = rp-lp;
      int currWater = heightOfcontainer*widthOfContainer;
      max_water = Math.max(max_water,currWater);

      //if lp
      if(height.get(lp)<height.get(rp)){
        lp++;
      }else{
        rp--;
      }
    }
    return max_water;
  }
}
