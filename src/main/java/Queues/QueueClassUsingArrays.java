package Queues;

public class QueueClassUsingArrays {

  public static void main(String[] args) {

    Queue obj = new Queue(5);
    obj.isEmpty();
    obj.addtoQueue(10);
    obj.addtoQueue(20);
    obj.addtoQueue(30);
   while (!obj.isEmpty()){
     System.out.println(obj.peek());
     obj.removeElement();
   }
  }
//using array
  public static class Queue {

  static int arr[];
  static int size;
  static int front;//point to front of queue
  static int rear; // point to rear of queue

  //Constructor
  Queue(int n) {
    arr = new int[n];
    size = n;
    rear = -1;
    front = -1;
  }

  public boolean isEmpty() {
    return rear == -1;
  }

  public void addtoQueue(int data){
    if(rear == size-1){
      System.out.println("Array is full");
    }
    rear++;
   arr[rear] = data;
  }


  public int peek(){
    if(!isEmpty())
    {
      return arr[0];
    }else{
      System.out.println("queue is empty");
      return -1;
    }
  }

  public int removeElement(){
    if(!isEmpty()){
    //remove first element and then move all elements to left.
      int front = arr[0];
      for(int i=0; i<rear;i++ ){
        arr[i] = arr[i+1];
      }
      rear = rear-1;
      front = arr[0];
      return front;
  }
    else{
      System.out.println("queue is empty");
      return -1;
    }
}
}
}
