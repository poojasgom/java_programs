package Stacks;

import java.util.ArrayList;

public class StackImplementationUsingArrayList {

  static class Stack{
    static ArrayList<Integer> list = new ArrayList<>();
    public boolean isEmpty(){
      return list.size() == 0;
    }

    //push function O(1)
    public static void push(int data){
      list.add(data);
    }

    //pop O(1)
    public static int pop(){
      int top = list.get(list.size()-1);
      list.remove(list.size()-1);
      return top;
    }

    //peek = search
    public static int peek(){
      return list.get(list.size()-1);
    }
  }

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    while ((!s.isEmpty())){
int s1  =s.peek();
      System.out.println(s1);
      s.pop();
    }
  }

}
