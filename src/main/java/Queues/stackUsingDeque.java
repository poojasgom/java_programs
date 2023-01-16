package Queues;

import java.util.Deque;
import java.util.LinkedList;

public class stackUsingDeque {

Deque<Integer> deque = new LinkedList<>();
  public void push(int data){
    deque.addLast(data);
  }

  //pop
  public int  pop(){
   return deque.removeLast();
  }

  //peek
  public int peek(){
   return deque.getLast();
  }
  public static void main(String[] args) {
    stackUsingDeque obj = new stackUsingDeque();
    obj.push(3);
    obj.push(1);
    obj.push(2);

    obj.pop();
    System.out.println(obj.peek());

  }
}
