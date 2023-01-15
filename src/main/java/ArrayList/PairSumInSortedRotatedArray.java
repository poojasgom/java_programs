package ArrayList;
//O(n)
//lp = n
import java.util.ArrayList;

public class PairSumInSortedRotatedArray   {

  public static void main(String[] args) {
    ArrayList<Integer> list  = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
    System.out.println(isPairSum(list,target));
  }

  private static boolean isPairSum(ArrayList<Integer> list, int target) {
int breakingPoint=0;
int n = list.size();
    // find pivot = or the breaking point-> where the i+1 >i in a sorted array.
    for(int i=0; i<list.size();i++){
      if(list.get(i)>list.get(i+1)){
        breakingPoint=i;
        break;
      }
    }
    int lp = breakingPoint+1;
    int rp = breakingPoint;

    while (lp!=rp){
      //case 1 :
      if(list.get(lp)+list.get(rp) == target){
        return true;
      }else if(list.get(lp)+list.get(rp)<target){ //case 2:
        lp = (lp+1)%n;
      }else  if(list.get(lp)+list.get(rp)>target){     //case 3:
        rp = (n+rp-1)%n;
      }
    }
    return false;
  }
}
