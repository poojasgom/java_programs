package Recursin;

/*)n(logn)
Given an array nums of size n, returnthe majority element.
Themajorityelementistheelementthatappearsmorethan⌊n/2⌋times.Youmayassumethat the majority element always exists in the array.
Sample Input 1: nums = [3,2,3]Sample Output 1: 3
Sample Input 2: nums = [2,2,1,1,1,2,2]Sample Output 2: 2
Constraints(extra Conditions):●n == nums.length●1 <= n <= 5 * 104●-109 <= nums[i] <= 109
 */
public class findMajorityElementInArray {

  public static int findOccuranceOfMajorityElement(int[] arr, int lo, int hi) {

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
    int rightCount = countOccurances(arr, rightMajor, mid+1, hi);;

    return leftCount > rightCount ? leftCount : rightCount;

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
int[] nums = {3,2,3,2,2,1,1,1,1};
    System.out.println(findOccuranceOfMajorityElement(nums,0,nums.length-1));
  }
}