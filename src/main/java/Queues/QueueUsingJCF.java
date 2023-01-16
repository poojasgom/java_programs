package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {

  public static void main(String[] args) {
    //snce Queue is an interface we use classes that implement QUEUE to create objects. It can be
    // linked list or Deque.
    //Queue<Integer> obj= new LinkedList<>();
    Queue<Integer> obj = new ArrayDeque<Integer>();

    obj.add(1);
    obj.add(2);
    obj.add(3);

    while (!obj.isEmpty()){
      System.out.println(obj.peek());
      obj.remove();
    }
  }
}
