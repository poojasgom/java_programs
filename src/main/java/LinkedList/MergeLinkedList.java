package LinkedList;

import java.util.LinkedList;

public class MergeLinkedList {
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
  private Node findMid(Node head) {
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next!=null){
    slow = slow.next;
    fast = fast.next.next;
    }
    return slow;
  }

  private Node mergeLeftAndRightList(Node leftHead, Node rightHead) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;
    while (leftHead!=null && rightHead!=null){
      if(leftHead.data<rightHead.data){
        temp.next = leftHead; //point temp to leftHead and then increment left and temp pointers.
        leftHead = leftHead.next;
        temp = temp.next;
      }else{
        temp.next = rightHead;
        rightHead = rightHead.next;
        temp = temp.next;
      }
    }
    //for extra elements in left or right when there is nothing to compare.
    while (leftHead!=null){
      temp.next = leftHead; //point temp to leftHead and then increment left and temp pointers.
      leftHead = leftHead.next;
      temp = temp.next;
    }
    while (rightHead!=null){
      temp.next = rightHead;
      rightHead = rightHead.next;
      temp = temp.next;
    }
    return mergedLL.next; //as the first node is -1 dummy node
  }

public Node mergeSort(Node head){

    //BASE CASE : if list is empty or has just 1 node.
  if(head==null || head.next == null){
    return head;
  }
  //3 steps: 1- find mid.
  Node midNode = findMid(head);
  //2 split the list with mid Node being last of Left list and right head - mid.next
  Node rightHead = midNode.next;
  midNode.next = null;

  //run recursion until both list are sorted.
  Node leftSort = mergeSort(head);
  Node rightSort = mergeSort(rightHead);

  // compare left and right List and form a merged list
 return mergeLeftAndRightList(leftSort,rightSort);
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

  public void addFirst(int data){
    Node newNode = new Node(data);
    if(head ==null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public static void main(String[] args) {
MergeLinkedList obj1 = new MergeLinkedList();
    obj1.addFirst(10);
    obj1.addFirst(20);
    obj1.addFirst(30);
    obj1.addFirst(40);
    obj1.addFirst(50);
    obj1.addFirst(60);

obj1.printlinkList();
 obj1.head = obj1.mergeSort(obj1.head);
 obj1.printlinkList();
  }
}
