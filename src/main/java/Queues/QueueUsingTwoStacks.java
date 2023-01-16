package Queues;

import java.util.Stack;

//Approach - Declare 2 stacks, when you add first element add to S1 , for rest move all elements
// of s1 to S2, put new element to S1 and then again move all elements from S2 to S1.
public class QueueUsingTwoStacks {

  public static class Queue{

    static Stack<Integer> s1 = new Stack<>();
    static  Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty(){
      return s1.isEmpty();
    }

    //add to Stack - O(n)
    public void addData(int data){


      //If not empty MOve all elements from S1 to S2
      while (!s1.isEmpty()){
        s2.push(s1.pop());
      }

      //now push new element to s1
      s1.push(data);

      //move elements back to s1
      while (!s2.isEmpty()){
        s1.push(s2.pop());
      }
    }


    //remove from stack - O(1)
    public static int removeElement(){
      if(isEmpty()){
        System.out.println("Is empty");
        return -1;
      }
     return s1.pop();
    }

    //peek stack O(1)
    public static int peek(){
      if(isEmpty()){
        System.out.println("Is empty");
        return -1;
      }
      return s1.peek();
    }
  }

  public static void main(String[] args) {
    Queue obj = new Queue();
    obj.addData(10);
    obj.addData(20);
    obj.addData(30);

    while (!obj.isEmpty()){
      System.out.println(obj.peek());
      obj.removeElement();
    }
  }

}
