import java.util.Arrays;
import java.util.Collections;

/*
Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3
Output: Minimum Difference is 2
Explanation:
We have seven packets of chocolates and we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.

Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5
Output: Minimum Difference is 6

Input : arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} , m = 7
Output: Minimum Difference is 10

Approach :
The idea is based on the observation that to minimize the difference, we must choose consecutive elements from a sorted packet. We first sort the array arr[0..n-1],
then find the subarray of size m with the minimum difference between the last and first elements.
 */
public class ChocoloateDistribution {

  public static void main(String[] args) {
    int[] myArry = {7, 3, 2, 4, 9, 12, 56};
    int size = 3;
    int x = findMinimum(myArry, size);
  }

  private static int findMinimum(int[] myArry, int size) {
   // if array is empty or has just 1 element or the packet size is 0;
    if(myArry.length==0 || myArry.length == 1 || size==0){
      return 0;
    }
    //sort the array
    Arrays.sort(myArry);

    // if length of array is < packet size return 0
    if(myArry.length<size){
      return 0;
    }

    int minDifference = Integer.MAX_VALUE;

    // Find the subarray of size m
    // such that difference between
    // last (maximum in case of
    // sorted) and first (minimum in
    // case of sorted) elements of
    // subarray is minimum.

for(int i=0;i+size-1< myArry.length;i++){

  int diff = myArry[i+size-1] - myArry[i];
  if(diff <minDifference){
    minDifference = diff;
  }
}
    return minDifference;
  }
}
