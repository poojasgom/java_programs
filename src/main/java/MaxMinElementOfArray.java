import java.util.Collections;
    import java.util.Scanner;

/*
https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
//Clue : pair.
Time Complexity: O(n) - each item visited once.
Auxiliary Space: O(log n) as the stack space will be filled for the maximum height of the tree formed during recursive calls same as a binary tree.
 */
class MaxMinElementOfAnArray {

  public static void main(String[] args) {
    int[] arr = initializeArray();
    Pair myMinMax =   findMinMax(arr);
    System.out.println("The max is :"+ myMinMax.max +"and the min is :"+myMinMax.min);
  }

  static class Pair {
    int min;
    int max;
  }

  private static Pair findMinMax(int[] arr) {
    Pair minmax = new Pair();
    int min = 0;
    int max = 0;

    // Case 1: If the array has only 1 element, then nothing to compare with. The elenent is max and min both.
    if (arr.length == 1) {
      minmax.min = arr[0];
      minmax.max = arr[0];
      return minmax;
    }
    // Case 2: More than 1 element in array. So initialize min and max with 1st and 2nd values of array and compare.
    else {
      if (arr[0] > arr[1]) {
        minmax.min = arr[1];
        minmax.max = arr[0];
      } else {
        minmax.min = arr[0];
        minmax.max = arr[1];
      }

      // now compare with rest of elements of array.
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > minmax.max) {
          minmax.max = arr[i];
        } else if (arr[i] < minmax.min) {
          minmax.min = arr[i];
        }
      }
    }
    return minmax;
  }

  private static int[] initializeArray() {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array : ");
    int size = obj.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the elements :");
    for (int i = 0; i < size; i++) {
      arr[i] = obj.nextInt();
    }
    return arr;
  }
}