package ArrayList;

public class pivotPoint {

public static int findPivotValue(int[] arr){
  int sum = 0;
  for(int i =0;i<arr.length;i++){
    sum+=arr[i];
  }

  int start = 0, index=0;
  for(index = 0; index<arr.length;index++){
    sum = sum - arr[index];
    if(start == sum){
      return index;
    }
    start = start+arr[index];
  }
  return -1;
  }
  public static void main(String[] args) {
    int x[] = {1,7,3,6,5,6};
    System.out.println(findPivotValue(x));
  }
}
