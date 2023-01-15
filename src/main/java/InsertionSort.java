// idea = is deck of cards - where we pick an element from unsorted part and put into sorted part.
public class InsertionSort {

  public static void insertionSorting(int[] arr){

    for(int i =1; i<arr.length;i++){
      int curr =i;
      int prev = i-1;

      // finding correct position to insert
      while(prev>=0 && arr[curr] > arr[prev] ){
        arr[prev+1] = arr[prev];
        prev--;
      }

      // insert
      arr[prev+1] = arr[curr];
    }

  }

  public static void main(String[] args) {

  }
}
