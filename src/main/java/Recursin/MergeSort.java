package Recursin;
//O(nlogn).
//divide
//mergesort(left) mergeSort(right)
//merge
public class MergeSort {

  public static void doMergeSort(int[] arr, int si, int ei){

    if(si>=ei){
      return;
    }
    //divide
    int mid = si+(ei-si)/2; //ei-si/2
    doMergeSort(arr, si, mid);
    doMergeSort(arr, mid+1, ei);
    merge(arr, si, mid, ei );
  }

  private static void merge(int[] arr, int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];//length of array.
    int i = si; //left part iterator
    int j = mid + 1; //right part iterator
    int k = 0;

    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
      temp[k] = arr[i];
      i++;k++;
      }else{
        temp[k] = arr[j];
        j++;k++;
      }
    }
//left part left over elements
    while (i<=mid){
      temp[k++] = arr[i++];
    }

    //right part left over elements
    while(j<= ei){
      temp[k++] = arr[j++];
    }
//copy temp to original

    for(k=0, i=si; k<temp.length;k++,i++){
      arr[i] = temp[k];

    }
  }

  public static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int[] arr = {6,3,9,5,2,8};
   doMergeSort(arr, 0, arr.length-1);
    printArray(arr);
  }
}
