import java.util.Scanner;

/*
https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
Given an array (or string), the task is to reverse the array/string.
Examples :


Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}

 */
public class ReverseArray {

  public static void main(String[] args) {
   int[] arr=  initializeArray();
    System.out.println("done");
    int[] rvrsArray = reverseArray(arr,0,arr.length-1);
    printReverseArray(arr);
  }

  private static int[] initializeArray() {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter count of elements in array :");
    int size = obj.nextInt();
    int[] arr = new int[size];
    System.out.println("enter elements");
    for (int i = 0; i < size; i++) {
      arr[i] = obj.nextInt();
    }
    return arr;
  }

  public static int[] reverseArray(int[] arr, int start, int end) {
    int[] reverseArray = null;
    int temp = 0;
    while (start <=end) {
      temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }

  public static void printReverseArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ ", ");
    }
  }
}
