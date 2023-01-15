package Stacks;

import java.util.Stack;

public class StackImplUsingCollectionFramework {

  public static void main(String[] args) {
    Stack obj = new Stack();
    obj.push(1);
    obj.push(2);
    obj.push(3);
    while (!obj.isEmpty()) {
      System.out.println(obj.peek());
      obj.pop();
    }
  }
}
