package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {


  public static void reverseQueueUsingStack(Queue<Integer> q1){
    Stack<Integer> obj = new Stack();

    while(!q1.isEmpty()){
      obj.push(q1.remove());
    }

    while(!obj.isEmpty()) {
      q1.add(obj.pop());
    }
  }


  public static void main(String[] args) {
    Queue<Integer> obj = new LinkedList<>();
    obj.add(1);
    obj.add(2);
    obj.add(3);
    obj.add(4);
    obj.add(5);
    obj.add(6);
    obj.add(7);
    obj.add(8);
    obj.add(9);
    obj.add(10);

    reverseQueueUsingStack(obj);
    while(!obj.isEmpty()){
      System.out.println(obj.remove());
    }
  }
}
