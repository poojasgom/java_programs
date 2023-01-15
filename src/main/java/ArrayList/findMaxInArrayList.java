package ArrayList;

import java.util.ArrayList;

public class findMaxInArrayList {

  public static void findMaxInArayList(ArrayList<Integer> arr){
    int MAX_VALUE = Integer.MIN_VALUE;
    for(int i=0;i<arr.size();i++){
      if(MAX_VALUE<arr.get(i)){
        MAX_VALUE=arr.get(i);
      }
    }
    System.out.println("greatest element in my arr list is " +MAX_VALUE);
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(10);
    arr.add(15);
    arr.add(20);
    arr.add(5);
    findMaxInArayList(arr);
  }
}
