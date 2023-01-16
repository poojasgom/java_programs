package Queues;

import java.util.LinkedList;
import java.util.Queue;

//1234 = 1324
//create a 2nd queue of size - size of mainqueue/2. and remove elements from main queue to put in
// 2nd  queue for the size calculated.
// Move items to end of main queue in an intereave fashion.
public class InterleaveTwoHalvesOfQueue {

  public static void interLeaveTheQueue(Queue<Integer> mainQueue){
    Queue<Integer> firstHalf = new LinkedList<>();
  int size = mainQueue.size()/2;

  for(int i=0; i<size;i++){
    firstHalf.add(mainQueue.remove());
  }

  while(!firstHalf.isEmpty()){
    mainQueue.add(firstHalf.remove());
    mainQueue.add(mainQueue.remove());
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
    interLeaveTheQueue(obj);
    while(!obj.isEmpty()){
      System.out.println(obj.remove() +" ");
    }
  }
}
