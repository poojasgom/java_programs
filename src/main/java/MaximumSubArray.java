/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
A subarray is a contiguous part of an array.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

Input: nums = [1]
Output: 1
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23

Approach - The approach here is to go through the array one by one and add the elements to the total sum and
check if it exceeds the current max value and if so, update the max value. See inline comments on what each line does.
 */
public class MaximumSubArray {

  public static void main(String[] args) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

    int maxSumTillNow =arr[0];
    int currsum =arr[0];
    for(int i = 0; i<arr.length;i++){
     currsum = Math.max(currsum+arr[i], arr[i]);
     maxSumTillNow = Math.max(maxSumTillNow, currsum);
    }
    System.out.println(maxSumTillNow);
  }
}
