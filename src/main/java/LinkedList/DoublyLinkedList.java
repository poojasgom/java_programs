package LinkedList;

public class DoublyLinkedList {

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
  public static int size =0;

  //add
  public void addFirst(int data){
    size++;
  Node newNode = new Node(data);
  if(head==null){
    head = tail = newNode;
    return;
  }
  newNode.next = head;
  head.prev= newNode;
  head =newNode;
  }
//add Last
  public void addLast(int data){
    Node newNode = new Node(data);
    if(head==null){
      head = tail = newNode;
    }
    tail.next = newNode;
    newNode.prev= tail;
    tail =newNode;
    size++;
  }

  // removeFirst
  public int removeFirst(int data){
    if(head == null){
      return -1;
    }
    if(size==1){
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    Node temp = head;
    head = temp.next;
    head.prev = null;
    size--;
    return size;
  }

  //remove Last
  public void removeLast(int data){
    if(head == null){
      return;
    }
    if(size==1){
      head = null;
    }
    Node temp = head;
while(temp.next!=null){
  temp = temp.next;
}


temp.prev.next =null;

    printDoubleList();
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

public void circularLinkList(){

}
  public static void main(String[] args) {
    DoublyLinkedList db = new DoublyLinkedList();
  db.addFirst(10);
  db.addFirst(20);
  db.addFirst(30);
    db.addLast(40);
    db.addLast(50);
  db.printDoubleList();
  //db.removeFirst(10);
  db.removeLast(50);

  }
}
