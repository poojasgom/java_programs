package Stacks;

import java.util.ArrayList;
import java.util.Stack;
import org.omg.PortableInterceptor.INACTIVE;

public class NextGreaterElement {

  private static void mynextGreatest(int[] arr) {
  Stack<Integer> stack = new Stack<>();
  int nextGreatest[] = new int[arr.length];

  for(int i=arr.length-1;i>=0; i--){

    while (!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
      stack.pop();
    }
    if(stack.isEmpty()){
      nextGreatest[i] = -1;
    }
    else {
      nextGreatest[i] = arr[stack.peek()];
    }
    stack.push(i);
  }

  for(int i=0;i<nextGreatest.length;i++){
    System.out.println(nextGreatest[i] +" ");
  }
  }

  public static void main(String[] args) {
  int arr[] = {6,8,0,1,3};
    mynextGreatest(arr);

  }
}
