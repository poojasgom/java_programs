package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintNodesInkthLevelOfTreeIteratively {

  public static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static void printNodeInKthLevel(Node root, int level, int k){
    if(root == null){
      return;
    }
    if(level == k){
      System.out.println(root.data);
    }
    printNodeInKthLevel(root.left,level+1,k);
    printNodeInKthLevel(root.right, level+1, k);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    printNodeInKthLevel(root,1,2);
  }

}
