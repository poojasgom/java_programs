package Queues;

public class ArrayDigitsumAndElementSum {

  public static void main(String[] args) {
    int arr[] = {1,15};
    int x = differenceOfSum(arr);
    System.out.println(x);
  }
        public static int differenceOfSum(int[] nums) {
    int elementSum = elementSum(nums);
    int digitSum = getDigitSume(nums);
        return Math.abs(elementSum-digitSum);
      }

      public static int getDigitSume(int[] nums){
        int digsum = 0,digit=0;int n=0;
        if(nums.length==0){
          digsum=0;
        }
        for(int i=0; i<=nums.length-1;i++) {

          while (nums[i] > 0) {
            digit = nums[i] % 10;
            digsum = digit + digsum;
            nums[i] = nums[i] / 10;
          }
        }
          //System.out.println(digsum);

        return digsum;
      }
      public static int elementSum(int[] nums){
        int sum =0;
        System.out.println(nums.length+"LENGTH");
        if(nums.length==0){
          sum=0;
        }
        for(int i=0; i<=nums.length-1;i++){
          sum = sum+ nums[i];
          System.out.println("num"+nums[i]);
        }
        System.out.println(sum);
        return sum;
      }
    }