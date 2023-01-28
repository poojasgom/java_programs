package Tree;

public class HeightOfATree {

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

  public int height(Node root){
    if(root == null){
      return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    int heightOfTree = Math.max(lh,rh)+1;
    return heightOfTree;
  }

  public static void main(String[] args) {

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    HeightOfATree obj = new HeightOfATree();
    System.out.println(obj.height(root));
  }

}
