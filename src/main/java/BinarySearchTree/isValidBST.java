package BinarySearchTree;

public class isValidBST {


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

  public static boolean isValid(Node root, Node min, Node max){
    if(root == null) return true;
    //leftpart - min should always be less than root.
    if(min!=null && root.data<min.data){
      return false;
    }
    //right part  - max should always be more than root.
    if(max!=null && root.data>max.data){
      return false;
    }
    //validate for rest of the subtree when root is good.
    return isValid(root.left, min, root) && isValid(root.right, root, max);
  }

  public static Node insert(Node root, int val){
    if(root == null){
      root = new Node(val);
      return root;
    }

    if(val>root.data){
      insert(root.right, val);
    }
    else if (val<root.data){
      insert(root.left, val);
    }
    return root;
  }
  public static void main(String[] args) {
    int[] values = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i=0; i<values.length;i++){
      isValidBST.insert(root, values[i]);
    }
    System.out.println(isValid(root, null, null));
  }
}
