package LinkedList;

public class DoublyLLreverse {

  public static class Node{
    Node next;
    Node prev;
    int data;
    public Node(int data){
      this.next = null;
      this.prev = null;
      this.data = data;
    }
  }

  public static Node head;
  public static Node tail;

  public void reverseDoublyLinkedList(){
    Node curr =  head;
    Node prev = null;
    Node next;
    while(curr!=null){
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void addFirst(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    //Node temp = head;
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }

  public void printDoubleList(){
    Node temp = head;
    while (temp!=null){
      System.out.print(temp.data+" <->");
      temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
  }

  public static void main(String[] args) {
    DoublyLLreverse db = new DoublyLLreverse();
    db.addFirst(10);
    db.addFirst(20);
    db.addFirst(30);
    db.printDoubleList();
    db.reverseDoublyLinkedList();
    db.printDoubleList();


  }
}
