package Queues;


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {

public static class Stack{
  static Queue<Integer> q1  = new LinkedList<>();
  static Queue<Integer> q2 = new LinkedList<>();
 static int rear = -1;
  static int front =-1;

  //empty
  public static boolean isEmpty(){
    return (q1.isEmpty() && q2.isEmpty());
  }
  //add to Queue
  public static void add(int data){
    if(!q1.isEmpty()){
      q1.add(data);
    }else{
      q2.add(data);
    }
  }

  //pop - Approach - at any point 1 queue is always empty , If q1 is having values then i remove
  // all elements satrting from frst and ikeep adding to q2 nd return the last element of the q1
  // as top which is actually removed.
  //
  public static int pop() {
    int top = -1;
    if (!q1.isEmpty()) {
      while (!q1.isEmpty()) {
         top = q1.remove();
        if (q1.isEmpty()) {
          break;
        }
        q2.add(top);
      }
    } else {
        while(!q2.isEmpty()){
           top = q2.remove();
          if(q2.isEmpty()){
            break;
          }
          q1.add(top);
        }
    }
    return top;
  }

    public static int peek(){
    int top = -1;
      if (!q1.isEmpty()) {
        while (!q1.isEmpty()) {
          top = q1.remove();

          q2.add(top);
        }
      } else {
        while (!q2.isEmpty()) {
          top = q2.remove();

          q1.add(top);
        }
      }
      return top;
  }


  public static void main(String[] args) {
Stack obj = new Stack();
obj.add(1);
obj.add(2);
obj.add(3);
while(!obj.isEmpty()){
  System.out.println(obj.peek());
  obj.pop();
}
  }
}
}
