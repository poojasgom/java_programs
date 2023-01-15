package LinkedList;

public class DeleteNNodesAfterMNodes {
  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  public static Node head;

  public void oddEven(Node head){
    Node end = head;
    Node nextNode =null;
    Node curr = head;
    while (end.next!=null){ //go to end node.
      end = end.next;
    }

    while(curr.data%2!=0){
nextNode = curr.next;
nextNode = curr;
curr = nextNode;

    }
  }

  public  void deleteNNodeAfterM(Node head, int m, int n){
int indexAfterWhichToDeleteFrom =1;
    Node temp = head;
    int size =1;
    if(head == null){
      System.out.println("III");
      return;
    }
    while (temp!=null){
      System.out.println(temp.data);
      if(indexAfterWhichToDeleteFrom != m){
        temp = temp.next;
        indexAfterWhichToDeleteFrom++;
      }
      else{
        break;
      }
      size++;
    }

    if(m>size){
      return;
    }
    Node nodeToDelete;
    Node newNode = temp;
    while (n!=0 && temp!=null){

       nodeToDelete = newNode.next;

       if(newNode.next !=null){
      newNode.next = newNode.next.next;}
      n--;
      nodeToDelete = null;

    }
  }
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
    DeleteNNodesAfterMNodes obj = new DeleteNNodesAfterMNodes();
    //obj.printLinkedList(head);
   // obj.deleteNNodeAfterM(head,4,2);
    obj.printLinkedList(head);
    obj.oddEven(head);
    obj.printLinkedList(head);
  }
}
