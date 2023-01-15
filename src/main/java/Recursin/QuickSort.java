package Recursin;
//pivot and partition
//worst case occurs when the array is already sorted.
public class QuickSort {

  public static void doQuickSort(int[] arr, int si, int ei){
    //BASE CASE
    if(si>=ei){
      return;
    }

    //Assume pivot = last element
    int partitionIndex = partition(arr, si, ei);
    doQuickSort(arr, si, partitionIndex-1);
    doQuickSort(arr, partitionIndex+1, ei);

  }


  private static int partition(int[] arr, int si, int ei) {
    int pivot = arr[ei];
    int i = si -1; // to make place for the element to be inserted.

    for(int j=si; j<ei;j++){
      if(arr[j] <=pivot){
        i++;
        //swap
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    //store pivot at right spot
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
  }

  public static void printArray(int[] arr){
    for(int i = 0; i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  public static void main(String[] args) {
int arr[] ={6,3,9,8,2,5};
doQuickSort(arr, 0, arr.length-1);
    printArray(arr);
  }
}
