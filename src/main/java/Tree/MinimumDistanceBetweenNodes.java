package Tree;

//Approach - > FIND LCA for 2 nodes and then find the dist b/w node to LCA and then add that..
public class MinimumDistanceBetweenNodes {

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

  public Node findLCA(Node root, int n1, int n2) {
    if (root == null) {
      return null;
    }

    if (root.data == n1 || root.data == n2) {
      return root;
    }

    Node leftLCA = findLCA(root.left, n1, n2);
    Node rightLCA = findLCA(root.right, n1, n2);

    if (leftLCA == null) {
      return rightLCA;
    }
    if (rightLCA == null) {
      return leftLCA;
    }
    return root;
  }

  private int findDistance(Node root, int n1) {
    if (root == null) {
      return -1;
    }
    if (n1 == root.data) {
      return 0;
    }

    int leftDist = findDistance(root.left, n1);
    int rightDist = findDistance(root.right, n1);

    if (leftDist == -1 && rightDist == -1) {
      return -1;
    } else if (leftDist == -1) {
      return rightDist + 1;
    } else {
      return leftDist + 1;
    }
  }

  public int findMinDis(Node root, int n1, int n2) {
    Node myLCA = findLCA(root, n1, n2);
    int dist1 = findDistance(myLCA, n1);
    int dist2 = findDistance(myLCA, n2);
    return dist1 + dist2;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    MinimumDistanceBetweenNodes obj  = new MinimumDistanceBetweenNodes();
    System.out.println(obj.findMinDis(root, 4,5));
  }

}
