package Queues;

import java.util.LinkedList;

//Double ended queue = allows operations fron bth ends of the queue.
public class Deque {

  public static void main(String[] args) {
    java.util.Deque<Integer> deque = new LinkedList<>();
    deque.addFirst(10);
    deque.addFirst(20);
    deque.addFirst(30);
    System.out.println(deque);
    deque.removeFirst();
    System.out.println(deque);
    deque.removeLast();
    System.out.println(deque);
  }

}
