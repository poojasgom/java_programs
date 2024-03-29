package Recursin;

/*)n(logn)
Given an array nums of size n, returnthe majority element.
Themajorityelementistheelementthatappearsmorethan⌊n/2⌋times.Youmayassumethat the majority element always exists in the array.
Sample Input 1: nums = [3,2,3]Sample Output 1: 3
Sample Input 2: nums = [2,2,1,1,1,2,2]Sample Output 2: 2
Constraints(extra Conditions):●n == nums.length●1 <= n <= 5 * 104●-109 <= nums[i] <= 109
 */
public class findMajorityElementInArray {

  /*public static int findOccuranceOfMajorityElement(int[] arr, int lo, int hi) {

    //if arr has 1 elem then return the count 1 for that element.
    if (lo==hi) {
      return arr[lo];
    }

    // more than 1 element
    int mid = lo + (hi - lo) / 2;
    int leftMajor = findOccuranceOfMajorityElement(arr, lo, mid);
    int rightMajor = findOccuranceOfMajorityElement(arr, mid + 1, hi);
//if both halves have same major then return that
    if (leftMajor == rightMajor) {
      return leftMajor;
    }

    // find which element is highest count and return that for each elem in array.
    int leftCount = countOccurances(arr, leftMajor, lo, mid);
    int rightCount = countOccurances(arr, rightMajor, mid+1, hi);

    return leftCount > rightCount ? leftCount : rightCount;

  }*/

   static class Solution {
    private int countInRange(int[] nums, int num, int lo, int hi) {
      int count = 0;
      for (int i = lo; i <= hi; i++) {
        if (nums[i] == num) {
          count++;
        }
      }
      return count;
    }

    private   int majorityElementRec(int[] nums, int lo, int hi) {
      // base case; the only element in an array of size 1 is the majority
      // element.
      if (lo == hi) {
        return nums[lo];
      }

      // recurse on left and right halves of this slice.
      int mid = (hi-lo)/2 + lo;
      int left = majorityElementRec(nums, lo, mid);
      int right = majorityElementRec(nums, mid+1, hi);

      // if the two halves agree on the majority element, return it.
      if (left == right) {
        return left;
      }

      // otherwise, count each element and return the "winner".
      int leftCount = countOccurances(nums, left, lo, hi);
      int rightCount = countOccurances(nums, right, lo, hi);

      return leftCount > rightCount ? left : right;
    }


  }
  private static int countOccurances(int[] arr, int numToSearch, int lo, int hi) {
    int count = 0;
    for (int i = lo; i <= hi; i++) {
      //System.out.println(numToSearch);
      if (arr[i] == numToSearch) {
        count++;
      }
    }
   return count;
  }


  public static void main(String[] args) {
int[] nums = {3,2,3};
    Solution obj = new Solution();

    System.out.println(obj.majorityElementRec(nums,0,nums.length-1));
  }
}