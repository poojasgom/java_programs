package Tree;

import java.util.ArrayList;
//O(n) , space incr as we use AL .
//find the path of the 2 nodes and then traverse thru paths to find last common value.
public class LowestCommonAncestor {

  public static class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public boolean getPath(Node root, int n, ArrayList path) {
    if (root == null) {
      return false;
    }

    path.add(root);
    if (root.data == n) {
      return true;
    }

    boolean foundleft = getPath(root.left, n, path);
    boolean foundRight = getPath(root.right, n, path);
    if (foundleft || foundRight) {
      return true;
    }
    path.remove(path.size() - 1); //if does not exist then its not part of the path for the node we
// need to find, so remove it from list.
    return false;
  }

  public Node getLowestCommonAncestor(Node root, int n1, int n2) {

    //Approach
    //Find the path from root to the 2 nodes. USE AL to store path.

    ArrayList<Node> path1 = new ArrayList<>();
    ArrayList<Node> path2 = new ArrayList<>();

    getPath(root, n1, path1);
    getPath(root, n2, path2);

    // Find LCA by looping thru 2 paths and finding the last common value
    int i = 0;
    for (i = 0; i < path1.size() && i < path2.size(); i++) {
      if (path1.get(i) != path2.get(i)) {
        break;
      }
    }
    return path1.get(i - 1); // because at i we saw that the loop fails so i-1 has the last match
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    LowestCommonAncestor obj = new LowestCommonAncestor();
    System.out.println(obj.getLowestCommonAncestor(root, 4, 7).data);

  }
}
