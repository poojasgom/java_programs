package Recursin;

public class SearchInRotatedArray {

  public static void main(String[] args) {

    int arr[] = {4,5,6,7,0,1,2};
    int target = 0;
    int indx = getTargetIndex(arr, 0, 0, arr.length-1);
    System.out.println(indx);
  }

  private static int getTargetIndex(int[] arr, int target, int si, int ei) {
    //BASE CASE
    if(si>ei){
      return -1;
    }
    //first find mid
    int mid = si+(ei-si)/2;

    //best case found.
    if(arr[mid] == target){
      return mid;
    }

    // Mid is on line 1 (quote the number on groph , this will form 2 lines
    if(arr[si]<=arr[mid]) {
      //case A: left
      if (arr[si] <= target && target <= arr[mid]) {
return getTargetIndex(arr, target, si,mid-1);
      }
      else{
        //case B : right
          return getTargetIndex(arr, target, mid+1,ei);
        }
    }
    //mid is on Line 2.
    else{
      if(arr[mid]<=target && target <=arr[ei]){
        return getTargetIndex(arr, target, mid+1, ei);
    }
      else{
        return getTargetIndex(arr, target, si, mid-1);
      }
    }
  }
}
