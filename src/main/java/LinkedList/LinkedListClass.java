package LinkedList;

public class LinkedListClass {

  public static class Node {

    Node next;
    int data;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public static int count=0;
  //Add item in the first of linkedList
  public void addFirst(int data) {
    // Step1: Createnew node.-> assign new node next to head - new node becomes head.
    Node newNode = new Node(data);
    //case 2: If no elememts exist before the new nde is created.
    if (head == null) {
      head = tail = newNode;
      return;
    }
    //case 1: a node already exists before the new node is created.

    newNode.next = head;
    head = newNode;
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

  //Add item in mid of list
  //get the mid index insert at mid-1;
  public void addAtAnIndex(int data, int index){
    Node newNode = new Node(data);
    Node temp = head;
    int i =0;
    if(head==null && tail==null){
      head=tail=newNode;
      return;
    }
    if(index ==0){
      newNode.next = head;
      head = newNode;
    }
    // traverse until you reach the position before index as the addr of this needs to be changed to
// new node.
    while(i<index-1){
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  //print a linkedList
  public void printLinkedList() {
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

public int listSize(){
    Node temp = head;
    if(head == null){
      return -1;
    }
    while(temp!=null){
      count++;
      temp = temp.next;
    }
  System.out.println(count);
    return count;
}

  //remove element from last of LinkedList - remove last node
  public void removeLastNode(){
    Node temp = head;
    while(temp.next!=null){
      temp = temp.next;
    }
    temp = null;
  }

  //remove from First
  public void removeFirstNode(){
    Node temp = head;
    if(head == null){
      System.out.println("List is empty");
    }
    if(head.next == null){
      head = null;
    }

    head = temp.next;
  }

  public void removeAtAnIndex(int index){
  if(head == null){
    System.out.println("List is empty");
  }
  int i =0;
  Node temp= head;
  while(i<index-1){
  temp = temp.next;
  i++;
  }
    temp.next = temp.next.next;
  }

  //search by iteration in LL sp = O(1) TC = O(n)
  public boolean iterativeSearchInALinkedList(int data){
    Node temp = head;
    int i =0;
    while (temp!=null){
      if(temp.data==data){
        System.out.println(data +"found at index" +i);
        return true;
      }
      temp = temp.next;
      i++;
    }
    System.out.println("Element not found");
    return false;
  }

  //search by recursion

  public int helper(Node head, int key){
    int i=0;
    if(head==null){
      System.out.println("no element in list");
      return -1;
    }
    if(head.data == key){
     return 0;
    }
    int index = helper(head.next,key);
    if(index == -1){
      return -1;
    }
    else {
      return index+1;// recursive way - evry node thinks its the head and traverses so we do +1 so
      // when it reaches actual head in stack trace it has the right index.
    }
  }
  public int recursiveSearchInLinkdList(int data){
    return helper(head, data);
  }

  //Find and delete nth node from last.
  //always nth node from last is = sizeOfLL-n+1;
  public void deleteNthNodeFromLast(int nthNodeIndex){
    // first step : Calculate size of the LL.
    int sizeOfLL = 0;
    Node temp = head;
    while(temp!=null){
      sizeOfLL++;
      temp= temp.next;
    }
    // check if head itself is to be deleted.
    if(nthNodeIndex == sizeOfLL){
      head = head.next;
      return;
    }
   // 2nd step : calculate the index from first as LL cant be traversed from last.
    int indexFromStart = sizeOfLL-nthNodeIndex+1;
    int indexToDelete = sizeOfLL-nthNodeIndex;
   int i = 1;

    //3rd step : delete the node at indexToDelete and connect the rest of the LL.
    Node curr = head;
    while(i<indexToDelete){
      curr = curr.next;
      i++;
    }
    curr.next = curr.next.next;
    return;
  }

  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public boolean checkIsPalindrome(Node n){
    //3 steps:
    // 1 - find mid. - slow fast approach turtle =1 step , hare -2 steps. when hare reaches end
    // then turtle reaches mid .
    // 2 - reverse the right side of the mid.
    // 3 - compare left and right.

    if(head == null || head.next==null){
      return true;
    }
    Node mid = findMid(head);
    Node prev = null;
    Node curr = mid;
    Node next;
    while (curr!=null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;
    while (right!=null){
      if(left.data != right.data){
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }



  public static void main(String[] args) {
    LinkedListClass linkList = new LinkedListClass();
    linkList.addFirst(2);
    linkList.addFirst(1);
    linkList.addLast(3);
    linkList.addLast(4);
    //linkList.removeLastNode();

    linkList.addAtAnIndex(9,2);
    linkList.addAtAnIndex(10,0);
    //linkList.printLinkedList();
    //linkList.listSize();
  //  linkList.removeLastNode();
//linkList.removeFirstNode();
    //linkList.removeAtAnIndex(3);
    //linkList.printLinkedList();
    //linkList.iterativeSearchInALinkedList(20);
    System.out.println(linkList.recursiveSearchInLinkdList(14));
    linkList.printLinkedList();
    linkList.deleteNthNodeFromLast(4);
    linkList.printLinkedList();

  }
}
