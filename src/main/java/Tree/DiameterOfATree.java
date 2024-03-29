package Tree;

public class DiameterOfATree {
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

  public int diamter(Node root){
    if(root == null){
      return 0;
    }

    int leftDia = diamter(root.left);
    int leftht = height(root.left);
    int rightDia = diamter(root.right);
    int rightht = height(root.right);

    int selfDia = leftht+rightht +1;
    return Math.max(selfDia, Math.max(leftDia, rightDia));
  }

  public int height(Node root){
    if(root == null){
      return 0;
    }

    int lh = height(root.left);
    int rh = height(root.right);
    return lh+rh+1;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    DiameterOfATree obj = new DiameterOfATree();
    System.out.println(obj.diamter(root));
  }

}
