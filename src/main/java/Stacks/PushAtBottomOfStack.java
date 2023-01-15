package Stacks;

//steps:using recursion  -
// store current value in a variable.
// run recursion for remoaning until the stack is empty.
// Now push new element and then push the variable back in stack;

import java.util.Stack;

public class PushAtBottomOfStack {

  public static void pushAtBottom(Stack<Integer> s, int data){

    if(s.empty()){
      s.push(data);
      return;
    }

    int top = s.pop();
    pushAtBottom(s,data);
    s.push(top);
  }
  public static void main(String[] args) {
    Stack obj = new Stack();
    obj.push(1);
    obj.push(2);
    obj.push(3);

    pushAtBottom(obj, 4);
    while (!obj.empty()){
      System.out.println(obj.pop());
    }

  }
}
