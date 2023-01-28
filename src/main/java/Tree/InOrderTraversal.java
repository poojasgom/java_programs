package Tree;

public class InOrderTraversal {
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

public static class BuildTree{
  static int index = -1;

  public static Node buildTrees(int[] nodes){
    index++;
    if(nodes[index] == -1){
      return null;
    }
    Node newNOde = new Node(nodes[index]);
    newNOde.left = buildTrees(nodes);
    newNOde.right = buildTrees(nodes);
  return newNOde;
  }

  //Left root right
  public static void inOrderTraversal(Node root){
    if(root == null){
      return;
    }

    inOrderTraversal(root.left);
    System.out.print(root.data);
    inOrderTraversal(root.right);
  }
}


  public static void main(String[] args) {
    int[] nodes = {1,2,4,-1,-1, 5,-1,-1,3,-1,6,-1,-1};
    BuildTree obj = new BuildTree();
    Node rootNode = obj.buildTrees(nodes);
    obj.inOrderTraversal(rootNode);
  }
}
