package Tree;


import java.util.IdentityHashMap;

//GIven the roots of 2 binary tree root and subroot, return true if thereis a subtree of root
// with same structure and node values of subroot and false otherwise.
// tree -
public class IsIdenticalSubtreeInATree {

  public static class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
      this.data = data;
      this.left = null;
      this.right =null;
    }
  }
  //Check if the root node exists in the main tree and then match the structure.
  public static boolean isSubTree(Node root, Node subRoot){

    if(root.data == subRoot.data){
      return (isIdentical(root, subRoot));
    }
    //search in left and right subtree and return true if found.
    return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
  }

  public static boolean isIdentical(Node node, Node subRoot){

    if(node == null && subRoot == null){
      return true;
    }else if(node ==null || subRoot == null || node.data!=subRoot.data){
      return false;
    }

    //check left subtree for identical
    if(!isIdentical(node.left, subRoot.left)){
      return false;
    }

    //check if right subtree for identical
    if(!isIdentical(node.right,subRoot.right)){
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    Node subroot = new Node(2);
    subroot.left = new Node(4);
    subroot.right = new Node(5);
    System.out.println(isSubTree(root, subroot));
  }
}
