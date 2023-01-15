package LinkedList;

public class ZigZagLnkedList {

  public static class Node{
    Node next;
    int data;
    public Node(int data){
      this.data = data;
      this.next=null;
    }
  }

  public static Node head;
  public static Node tail;

  public Node findMid(Node head){
    Node slow = head;
    Node fast = head.next;
    while(fast!=null && fast.next!=null){
      slow= slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
  //3 steps:
  // 1st find mid.
  //Reverse the right list
public void zigzag(Node head){
    Node midNode = findMid(head);
  //Reverse right list
  //reverse
  Node prev = null;
  Node curr = midNode.next;
  midNode.next = null; //split
  Node next = null;

  while (curr!=null){
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
  }

  Node left= head;
  Node right = prev;
  Node nextLeft , nextRight;
  while (left!=null && right!=null){
    nextLeft = left.next;
    left.next = right;
    nextRight = right.next;
    right.next = nextLeft;

    left = nextLeft;
    right = nextRight;
  }
}

  //Add item in last
  public void addLast(int data) {
    Node newNode = new Node(data);
    //case 1: Where there is no data in the list and te new node is the first node.
    if (head == null) {
      head = tail = newNode;
      return;
    }
    //rest when there data exists.
    tail.next = newNode;
    tail = newNode;
  }

  public void addFirst(int data){
    Node newNode = new Node(data);
    if(head ==null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void printlinkList(){
    Node temp = head;
    while (temp!=null){
      System.out.print(temp.data+" ->");
      temp = temp.next;
    }
    System.out.print("null");
    System.out.println();
  }

  public static void main(String[] args) {
    ZigZagLnkedList obj1 = new ZigZagLnkedList();
    obj1.addFirst(10);
    obj1.addFirst(20);
    obj1.addFirst(30);
    obj1.addFirst(40);
    obj1.printlinkList();
    obj1.zigzag(obj1.head);
    obj1.printlinkList();
  }
}
