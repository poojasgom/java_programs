package BinarySearchTree;

public class SearchInABST {


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
  //build a tree
public static Node buildTree(Node root, int val){
    if(root == null){
      root  = new Node(val);
      return root;
    }

    if(root.data>val){
      root.left  = buildTree(root.left, val);
    }
    if(root.data < val){
      root.right = buildTree(root.right, val);
    }
    return root;
}

//search = O(H)
  public static boolean searchInABinaryTree(Node root, int key){
    if(root==null){
      return false;
    }

    if(root.data == key){
      return true;
    }

    if(root.data>key){
      return searchInABinaryTree(root.left, key);
    }
    else{
      return searchInABinaryTree(root.right, key);
    }

  }

  public static void inOrder(Node root){
    if(root == null ){
      return;
    }
    inOrder(root.left);
    System.out.println(root.data);
    inOrder(root.right);
  }

  public static void main(String[] args) {
    int[] values = {5,1,3,4,2,7};
    Node root = null;
    for(int i=0; i<values.length;i++){
      root = buildTree(root,values[i]);
    }
    System.out.println(searchInABinaryTree(root, 9));
  }
  }

