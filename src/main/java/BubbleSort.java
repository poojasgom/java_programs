//approach - big bubbles come out of the tube first when water is boiled. So big numbers are
// first placed in the right position and then we repeat until the least num is sorted.
// time complexity - O(n2)
public class BubbleSort {

  public static void bubbleSort(int arr[]){
    for(int i = 0; i < arr.length-1;i++){ // n times
      for(int j =0; j<arr.length-1-i;j++){ // n - i times.
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    printArr(arr);
  }

  public static void printArr(int arr[]){
    for(int i = 0; i< arr.length;i++){
      System.out.print(arr[i]);
    }
  }
  public static void main(String args[]){
    int[] arr = {5,4,3,2,1};
 bubbleSort(arr);
  }
}
