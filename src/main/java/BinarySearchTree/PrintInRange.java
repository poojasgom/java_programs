package BinarySearchTree;

//Print all numbers that are in range n1 - n2 in the binary tree
public class PrintInRange {

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

  //Create a BST

  public static Node createABST(Node root, int val){
  if(root == null){
  root = new Node(val);
    return root;
  }

  if(root.data>val){
   root.left =  createABST(root.left, val);
  }
  else if(root.data<val){
    root.right= createABST(root.right, val);
  }
  return root;
}

//Search in BST

  public static boolean searchInBST(Node root, int key){
  if(root == null) return false;

  if(root.data==key){
    return true;
  }
  if(root.data >key){
    searchInBST(root.left, key);
  }else if (root.data <key){
    searchInBST(root.right, key);
  }
  return false;
}

// Inorder Successor =  Leftmost node of the right node where we find the match

  public static Node findInorderSuccessor(Node root){
  while (root.left!=null){
    root = root.left;
  }
  return root;
}

// Delete a node

  public static Node deleteNode(Node root, int val) {
    if (root == null) {
      return null;
    }
    if (root.data < val) {
      root.right = deleteNode(root.right, val);
    } else if (root.data > val) {
      root.left = deleteNode(root.left, val);
    } else {

      // case 1 = delete in a leaf node.
      if (root.left == null && root.right == null) {
        return null;
      } else if (root.left == null) {
        //case 2: Delete a node with 1 child (left or right)
        return root.right;
      } else {
        if (root.right == null) {
          return root.left;
        } else {
          Node IS = findInorderSuccessor(root.right);
          root.data = IS.data;
          root.right = deleteNode(root.right, IS.data);
          //case 3 - Delete node with 2 child
        }
      }
    }
    return root;
  }

  public static void findNumbersInRange(Node root, int k1, int k2) {

    if (root == null) {
      return;
    }
    //case 1: k1 <root and k2> root.-> traverse both left and right sides of the tree.
    if (root.data <= k2 && root.data >= k1) {
      findNumbersInRange(root.left, k1, k2);
      System.out.print(root.data+" ");
      findNumbersInRange(root.right, k1, k2);
    } else if (root.data < k1) {
      //case 2: root<k1
      findNumbersInRange(root.left, k1, k2);
    } else {
      findNumbersInRange(root.right, k1, k2);
    }
  }

  public static void inOrder(Node root){
    if(root == null ){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data+ " ");
    inOrder(root.right);
  }
    public static void main(String[] args){
      int[] values = {8,5,3,1,4,6,10,11,14};
      Node root = null;
      for(int i=0; i<values.length;i++){
        root = createABST(root,values[i]);
      }
     // findNumbersInRange(root, 5, 12);
      deleteNode(root, 5);
      inOrder(root);

    }

  }
