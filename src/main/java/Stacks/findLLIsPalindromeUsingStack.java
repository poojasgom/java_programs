package Stacks;

import Stacks.StackImplementationUsingArrayList.Stack;
import java.util.LinkedList;
import org.w3c.dom.CDATASection;

public class findLLIsPalindromeUsingStack {

  public static class Node{
    char data;
    Node next;
    public Node(char data){
      this.data= data;
      this.next = null;
    }
  }

  public static Node head;

  public void addToList(char data){
    Node temp = head;
    Node newNode = new Node(data);
    if(head == null){
      newNode = head;
    }else{
      while(temp.next!=null){
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public void checkIfPalindrome(LinkedList<Integer> list){
    Node temp = head;
    java.util.Stack<Character> stack = new java.util.Stack<Character>();
    if(list.isEmpty()){
      System.out.println("List is empty");
    }
    if(list.size() == 1){
      System.out.println("List is a palindrome");
    }

    if(list.size()>1){
      while (temp.next!=null) {
        stack.push(temp.data);
      }



    }
  }
}
