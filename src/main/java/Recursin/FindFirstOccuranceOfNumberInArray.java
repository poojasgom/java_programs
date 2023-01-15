package Recursin;

//first check the first number then checj the rest as we need first occurance.
public class FindFirstOccuranceOfNumberInArray {

  public static int findNum(int[] arr, int key, int index){
    if(key == arr[index]){
      return index;
    }

    if(index==arr.length-1){
      return -1;
    }

   return findNum(arr, key,index+1);

  }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println(findNum(arr, 0, 0));
  }

  }
