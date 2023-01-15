package LinkedList;

import java.util.LinkedList;

public class RemoveCycleFromACycleLnkedList {

  public static class Node{
    int data;
    Node next;
    public Node(int data){
      this.data = data;
      this.next=null;
    }
  }



  public static Node head;

  public void printList() {
   Node temp = head;
   while (temp!=null){
     System.out.print(temp.data+" ->");
     temp = temp.next;
   }
    System.out.println();
  }

  public void removeCyle(){
    // 3 steps: DetectCycle -> remove cyle -> remove the last node.
    // Detect the cycle
    Node slow = head;
    Node fast = head;
    boolean isCycleExist = false;
    while(fast != null || fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow==fast){
        isCycleExist=true;
        break;
      }
    }

    if(isCycleExist ==false){
      return;
    }

    // Remove cyle - assign slow back to head and lopp through list by incrementing slow and
    // fast by 1 each time until both meet. This would
    // be the cycle point.
    slow = head;
    Node prev = fast;
    while (fast!=slow){
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    //to break the cycle.
    prev.next=null;

  }
  public static void main(String[] args) {
 head = new Node(1);
 Node temp = new Node(2);
 head.next = temp;
 head.next.next = new Node(3);
 head.next.next.next = temp;
    RemoveCycleFromACycleLnkedList obj = new RemoveCycleFromACycleLnkedList();
    //obj.printList();
    obj.removeCyle();
    obj.printList();

  }
}
