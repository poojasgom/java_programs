package Tree;

import java.util.regex.Matcher;

//O(n)
//make class info return both dia and height so we dont have 2 make 2 separate calls for dia and
// height.
public class DiameterOfATreeOptimized {

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

  public static class Info{
    int ht;
    int diam;
    public Info(int diam, int ht){
      this.ht = ht;
      this.diam = diam;
    }
  }

  public static Info diameter(Node root){
    if(root == null){
      return new Info(0,0);
    }

    Info leftInfodia = diameter(root.left);
    Info rightInfoDia = diameter(root.right);

    int selfDia = Math.max(Math.max(leftInfodia.diam, rightInfoDia.diam),
        (leftInfodia.ht+rightInfoDia.ht+1));
    int ht = Math.max(leftInfodia.ht, rightInfoDia.ht)+1;
    return new Info(selfDia, ht);
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    DiameterOfATreeOptimized obj = new DiameterOfATreeOptimized();
    Info obj1 = obj.diameter(root);
    System.out.println(obj1.diam);
    System.out.println(obj1.ht);
  }
}
