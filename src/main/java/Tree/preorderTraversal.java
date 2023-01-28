package Tree;

public class preorderTraversal {

  public static class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
      this.data = data;
      this.left =null;
      this.right = null;
    }
  }


  public static class PreOrder{
    //Build Tree
    static int index = -1;
    public static  Node buildTree(int[] nodes){
       index++;
      if(nodes[index] == -1){
        return null;
      }
      Node newNode = new Node(nodes[index]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);
      return newNode;
    }

    //ROOT, LEFT, RIGHT
    public static void preOrderTraversal(Node root){
      if(root == null){
        System.out.print(-1+" ");
        return;
      }
      System.out.print(root.data+" ");
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
    }


  }

  public static void main(String[] args) {
    int[] nodes = {1,2,4,-1,-1, 5,-1,-1,3,-1,6,-1,-1};
    PreOrder obj = new PreOrder();
    Node root =obj.buildTree(nodes);
    obj.preOrderTraversal(root);
  }
}
