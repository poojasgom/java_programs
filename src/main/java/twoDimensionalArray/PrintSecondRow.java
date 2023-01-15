package twoDimensionalArray;

//Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
public class PrintSecondRow {

  public static void main(String[] args) {
    int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    int count =0;
    for(int i=0; i<nums.length;i++){
      for(int j=0; j<nums[0].length;j++){
        if(i==1){
          count+=nums[i][j];
        }
      }
    }
    System.out.println("sum of 2nd row is" +count);
  }
}

