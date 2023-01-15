// idea is reverse of bubble sort. here we find the least element and we push to front.
public class SelectionSort {

  public static void selectionSOrting(int[] arr){
    for(int i =0; i<arr.length-1; i++){
      int minPos = i; // current iteration i is the minimum value and then we compare with next
      // and swap to j as needed.
      for(int j =i+1; j<arr.length;j++){
        if(arr[i] > arr[j]){
          minPos = j; // change Min to j index.
        }
      }

      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;
    }
    printArr(arr);
  }


  public static void printArr(int arr[]){
    for(int i = 0; i< arr.length;i++){
      System.out.print(arr[i]);
    }
  }

  public static void main(String[] args) {
int[] arr = {5,4,3,2,1};
    selectionSOrting(arr);
  }
}
