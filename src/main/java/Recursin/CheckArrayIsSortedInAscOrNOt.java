package Recursin;

// fn-1 > fn
public class CheckArrayIsSortedInAscOrNOt {

  public static boolean isSortedInAsc(int[] arr, int i){
    if(i==arr.length-1){
      return true;
    }

    if(arr[i+1] >=arr[i]){
      return isSortedInAsc(arr, i+1);
    }else{
      return false;
    }
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,5,1};
    System.out.println(isSortedInAsc(arr, 0));
  }
}
