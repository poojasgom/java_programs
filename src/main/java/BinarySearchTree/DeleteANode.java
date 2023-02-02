package BinarySearchTree;

public class DeleteANode {
  static class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static Node deleteNode(Node root, int val) {

    if (root == null) {
      return null;
    }
//search for val to be deleted
    if(root.data < val){
      root.right = deleteNode(root.right, val);
    }else if(root.data>val){
      root.left = deleteNode(root.left, val);
    }
else {
      //case 1: Leaf node deletion
      if (root.left == null && root.right == null) {
        return null;
      } else if (root.left == null) { //case 2 : delete a node with single child
        return root.right;
      }
      if (root.right == null) {
        return root.left;
      } else {
        //case 3 : delete a node with 2 child. (Step 1: FInd inorder successor, update value of node
        // to be deleted to the inordersuccessor value, Delete the node.
        Node IS = inorderSuccessor(root.right);
        root.data = IS.data;
        root.right = deleteNode(root.right, IS.data);
      }
    }
    return root;
  }

  // INorder successor is the left most node of the right subtree where the key was found.
  public static Node inorderSuccessor(Node root){
    while (root.left!=null){
      root = root.left;
    }
    return root;
  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      root.left = insert(root.left, val);
    } else {
      root.right = insert(root.right, val);
    }
    return root;
  }

  public static void inOrder(Node root){
    if(root == null ){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }

  public static void main(String[] args) {
    int[] values = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i=0; i<values.length;i++){
      root = insert(root,values[i]);
    }

    inOrder(root);
    System.out.println();
    deleteNode(root, 5);
    inOrder(root);
  }
}
