/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */
 class ContainsDuplicate {

  public static void main(String[] args) {
    int[] myArray = {1,1,1,3,3,4,3,2,4,2};
  boolean x =   containsDuplicates(myArray);
    System.out.println("Is there a duplicate ? "+x );
  }

  private static boolean containsDuplicates(int[] myArray) {
    for(int i = 0;i<myArray.length;i++){
      for(int j=i+1;j<myArray.length;j++){
               if(myArray[i] == myArray[j]){
          return true;
        }
      }
    }
    return false;
  }


}
