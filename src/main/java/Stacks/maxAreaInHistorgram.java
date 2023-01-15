package Stacks;

import java.util.Stack;
//O(n)
public class maxAreaInHistorgram {

  public static void findMaxArea(int[] arr) {
    int maxArea = 0;
    int nsl[] = new int[arr.length];//nextSmallerLeftElement
    int nsr[] = new int[arr.length];//nextSmallerRightElement

    //find the nextSmallerRightElement - start from backwards as all eelements on right will be
    // smaller as it reaches the 1st element.
    Stack<Integer> stack = new Stack();
    for (int i = arr.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
        stack.pop();
      }
      if (stack.isEmpty()) {
        nsr[i] = arr.length;
      } else {

        nsr[i] = stack.peek();
      }
      stack.push(i);
    }
    stack = new Stack(); //empty the stack
    //find next smallest from left.
    for (int i = 0; i < arr.length;i++){
      while(!stack.isEmpty() && arr[stack.peek()] >=arr[i]){
stack.pop();
      }
      if (stack.isEmpty()){
        nsl[i] = -1; //as we traverse from left.
      }else{
        nsl[i] = stack.peek();
      }
      stack.push(i);
    }

    // find area
    // Width = j-i-1..  nsr[i]-nsr[i]-1
    for(int i=0; i<arr.length;i++){
        int height = arr[i];
        int width = nsr[i]-nsl[i]-1;
        int currArea = height* width;
        maxArea = Math.max(currArea, maxArea);
    }
    System.out.println("max area in histogram is "+maxArea);
  }

  public static void main(String[] args) {
    int arr[] = {2,1,5,6,2,3}; //heights in histogram
    findMaxArea(arr);
  }


}
