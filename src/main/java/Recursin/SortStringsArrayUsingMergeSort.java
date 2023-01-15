package Recursin;
/*
pplyMergesorttosortanarrayofStrings.(Assumethatallthecharactersinall the Strings are in lowercase). (EASY
Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}Sample Output 1: arr = { "earth", "mars", "mercury","sun"}
 */
public class SortStringsArrayUsingMergeSort {

  public static String[] sortStrings(String[] arr, int lo, int hi){

    //BASE CASE
    if(lo==hi){
      String[] A = {arr[lo]};
      return A;
    }
    //find mid.
    int mid = lo+(hi-lo)/2;

    // recursion until we have just 1 element in array.
   String[] arr1 = sortStrings(arr, lo, mid);
   String[] arr2 = sortStrings(arr, mid+1, hi);
   String[] arr3 = mergeSort(arr1, arr2);
return arr3;
  }

  private static String[] mergeSort(String[] arr1, String[] arr2) {
    int m = arr1.length;
    int n = arr2.length;
    String arr3[] = new String[m+n];
    int index = 0;
    int i=0, j=0;

    while(i<m && j <n){
      if(isAlphabeticallySmall(arr1[i], arr2[j])){
        arr3[index] = arr1[i];
        i++;index++;
      }
      else{
        arr3[index] = arr2[j];
        j++; index++;
      }
    }

    //if left has more than right then add remianing to temp.
    while(i<m){
      arr3[index] = arr1[i];
      i++;
      index++;
    }

    while(j<n){
      arr3[index] = arr2[j];
      j++;
      index++;
    }

return arr3;

  }

  public static void printArray(String[] arr){
    for(int i = 0; i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  private static boolean isAlphabeticallySmall(String str1, String str2) {
    if((str1.compareTo(str2))<0)
      return true;
    return false;
  }

  public static void main(String[] args) {
    String[] arr = { "sun", "earth", "mars", "mercury"};
    String[] a = sortStrings(arr, 0, arr.length-1);
    printArray(a);
  }
}
