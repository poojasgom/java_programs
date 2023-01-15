package ArrayList;
//O(n)
//take 2 pointer on each end and compare its sum to target and increment /decrement lp and rp
// based on if the sum is greater or less.
import java.util.ArrayList;

public class PairSumUsing2PointerApproach {

  public static void main(String[] args) {
    ArrayList<Integer> list  = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    int target = 5;
    System.out.println(isPairSum(list,target));
  }

  private static boolean isPairSum(ArrayList<Integer> list, int target) {

    int lp = 0;
    int rp = list.size()-1;
    while (lp<rp){
      if(list.get(lp)+list.get(rp) == target){
        System.out.println(list.get(lp)+", "+list.get(rp));
        return true;
      }
      else if (list.get(lp)+list.get(rp) < target){
        lp++;
      }else if(list.get(lp)+list.get(rp) > target){
        rp--;
      }
    }
    return false;
  }
}
