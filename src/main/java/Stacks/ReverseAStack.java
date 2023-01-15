package Stacks;

import java.util.Stack;

//without using exta memory. O(n)
public class ReverseAStack {

  public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
  }

  public static void reverseStack(Stack<Integer> st){
   if(st.isEmpty()){
     return;
   }
    int top = st.pop();
    reverseStack(st); //run until its empty.
    pushAtBottom(st, top);
  }

  public static void main(String[] args) {
    Stack obj = new Stack();
    obj.push(1);
    obj.push(2);
    obj.push(3);
   reverseStack(obj);
   printStack(obj);
  }

  public static void printStack(Stack<Integer> s){
    while (!s.isEmpty()){
      System.out.println(s.pop());
    }
  }
}