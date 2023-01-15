public class ArrayFindDuplicate {

  public static void main(String[] args) {
    int[] arr = {1,4,5,7};
   //boolean result = findIfDuplicateExist(arr);
    //System.out.println(result);
    //findLargestInArray(arr);
    System.out.println("Index of 5 is " +binarySearch(arr, 5));
  }
  public static boolean findIfDuplicateExist(int[] arr){
    for(int i = 0;i<arr.length;i++){
      for(int j =i+1; j<arr.length;j++)
      if(arr[i] == arr[j]){
       return true;
      }
    }
    return false;
  }

  //Linear search = O(n) -> i traverse all the elements of the array to find the max
  // in array
  public static void findLargestInArray(int[] arr){
    int largest = Integer.MIN_VALUE; //-infinty
    for(int i = 0;i<arr.length;i++){

        if(arr[i]>largest){
        largest = arr[i];
        }
    }
    System.out.println("The largest is "+largest);

  }

  //Binary search = find the center and then compare with the key to find if equal found and if
  // less search left of the mid and if key>mid then traverse right of the array. Now again find
  // mid and repeat process. Ex: Dictionary search.
//Time complexity : we split and search again and again until we find key , worst case we scan
// whole array and may / may not find match,
  public static int binarySearch(int[] arr, int key){
    int start = 0;
    int end = arr.length-1;

    while(start<=end){ //arr with just 1 elem is also calculated.

      int mid = (start+end)/2;
      if(arr[mid] == key){ return mid;}
      if(arr[mid] > key){ end = mid -1;}
      if(arr[mid]<key){start = mid+1;}
    }
    return -1;
  }
}
