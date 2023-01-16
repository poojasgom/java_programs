package Queues;

public class CircularQueueUsingArray {

  public static class Queue {

    static int arr[];
    static int size;
    static int front;
    static int rear;

    Queue(int n) {
      arr = new int[n];
      size = n;
      front = -1;
      rear = -1;
    }

    //is empty queue
    public static boolean isEmpty() {
      return rear == -1;
    }

    //is queue full
    public static boolean isFull() {
      return (rear + 1) % size == front;
    }

    //Add to QUeue
    public static void addQueue(int data) {
      if (rear == size - 1) {
        System.out.println("Queue is full");
      }

      //if queue is fullfrom end but it has some empty places at start then
      if (isFull()) {
        System.out.println("Queue is full");
        return;
      }
      //if first element is added to the queue rear = front =-1; but we need to change
      // front
      // to 0;
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % size;
      arr[rear] = data;
    }

    //Remove
    public static int removeELement() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      int result = arr[front];
      //if we are deleting last element then assign front and rear = -1
      if (rear == front) {
        rear = front = -1;
      } else {
        front = (front + 1) % size;
      }
      return result;
    }

    public static int peek(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return 0;
      }
      return arr[front];
    }

  }


  public static void main(String[] args) {
   Queue o = new Queue(3);

    o.addQueue(10);
    o.addQueue(20);
    o.addQueue(30);

    System.out.println(o.removeELement());
    o.addQueue(40);
    System.out.println(o.removeELement());
    o.addQueue(50);
    while (!o.isEmpty()){
      System.out.println(o.peek());
      o.removeELement();
    }
  }
}
