package LinkedList;

public class SwapLinkOfMandNinLL {

  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;
  //print a linkedList
  public void printLinkedList(Node head) {
    Node temp = head;
    if (head == null) {
      System.out.println("LL Is empty");
    }
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node newNode = new Node(1);
    Node head = newNode;
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
SwapLinkOfMandNinLL obj = new SwapLinkOfMandNinLL();
obj.printLinkedList(head);
    obj.swapLinkInLinkList(2,4);
    obj.printLinkedList(head);
  }

  private void swapLinkInLinkList(int m, int n) {
if(m==n){
  return;
}

//Reach to M point in list
    Node curr = head;
Node prevM = null;
while(curr!=null && curr.data !=m){
 prevM = curr;
 curr = curr.next;
}

//Reach to N point in list
    Node currN = head;
    Node prevN = null;
    while(currN!=null && curr.data !=n){
      prevN = currN;
      currN = currN.next;
    }

  if(curr==null || currN==null){
    return;
  }

if(prevM!=null){
  prevM.next = currN;
}else{ head = currN;}

if(prevN!=null) {
  prevN.next = curr;
}else{
  head = curr;
}

Node temp = curr.next;
curr.next = currN.next;
currN.next = temp; }

}
