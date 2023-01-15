package ArrayList;

import java.util.ArrayList;

public class swapTwoNumbers {
  public static void swapItemsInarray(int index1, int index2, ArrayList<Integer> arr){

    //check valid indexes
    if(index1<arr.size() && index2<arr.size()&&index1<index2){
     int value1 = arr.get(index1);
     int val2 = arr.get(index2);
     arr.set(index1, val2);
     arr.set(index2,value1);
    }

  }
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(10);
    arr.add(15);
    arr.add(20);
    arr.add(5);
    System.out.println(arr.get(2));
    System.out.println(arr.get(3));
    swapItemsInarray(2,3, arr);
    System.out.println(arr.get(2));
    System.out.println(arr.get(3));

  }
}
