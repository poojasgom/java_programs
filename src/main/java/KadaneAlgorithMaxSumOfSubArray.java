// if the current sum is negative just make it as 0 and then compare currSum with MaxSubArraySum
// and take teh max.
public class KadaneAlgorithMaxSumOfSubArray {

  public static void getMaxSubArraySum(int[] arr){
    // if all elements are negative then print least of all the negatives.
   int currNeg  = 0;
   int maxNeg = Integer.MIN_VALUE;
   for(int i = 0; i< arr.length;i++){
     if(arr[i]<0){
       currNeg = currNeg + arr[i];
     }
     maxNeg = Math.max(currNeg, maxNeg);

   }
    System.out.println(maxNeg);
  /*  int currentSum = 0;
    int maxSubArraySum = Integer.MIN_VALUE;

    for(int i = 0; i<arr.length;i++){
      currentSum = currentSum+ arr[i];
    if(currentSum<0){
      currentSum = 0;
    }
    maxSubArraySum = Math.max(currentSum,maxSubArraySum);
    }
    System.out.println("Max subarray sum is "+ maxSubArraySum); */
  }

  public static void main(String[] args) {
//int[] arr = {-2, -3, 4, -1, -2, 1 , 5, -3};
int[] arr = {-2, -3, -4, -5};
     getMaxSubArraySum(arr);
  }
}
