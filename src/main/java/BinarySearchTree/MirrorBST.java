package BinarySearchTree;

public class MirrorBST {

  public static class Node {

    Node left;
    Node right;
    int data;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node mirrorMyBST(Node root){
    if(root == null){
      return null;
    }
    Node left = mirrorMyBST(root.left);
    Node right = mirrorMyBST(root.right);
    root.left = right;
    root.right = left;
    return root;
  }

  //preorder Traversal
  public static void preOrder(Node root){
    if(root==null){
      return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }
  public static void main(String[] args) {
  /*       8
        /  \
       5    10
      / \    \
     3   6    11*/
    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right.right = new Node(11);

    mirrorMyBST(root);
    preOrder(root);
  }

}
