package Queues;
//O(n)
public class QueueUsingLinkedList {

  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node head = null;
  public static Node tail = null;

  public static boolean isEmpty() {
    if (head == null) {
      return true;
    }
    return false;
  }

  //Add to list
    public static void addToList(int data) {
      Node newNode = new Node(data);
      if (isEmpty()) {
        head = tail = newNode;
        return;
      }
      tail.next = newNode;
      tail = newNode;
    }

    //Remove from list

  public static int removeFromList(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    }

    int front = head.data;

    //last element in list
    if(head == tail){
      head = tail = null;
    }else {
      head = head.next;
    }
    return front;
  }

  //peek
  public static int peek(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    }
   return head.data;
  }


  public static void main(String[] args) {
    QueueUsingLinkedList o = new QueueUsingLinkedList();
    o.addToList(10);
    o.addToList(20);
    o.addToList(30);

    while (!o.isEmpty()){
      System.out.println(o.peek());
      o.removeFromList();
    }
  }
  }
