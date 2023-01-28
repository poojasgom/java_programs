package Tree;

import Tree.InOrderTraversal.BuildTree;
import Tree.InOrderTraversal.Node;

public class PostOrderTraversal {

  public static void postOrder(Node root){
    if(root == null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data);
  }

  public static void main(String[] args) {
    int[] nodes = {1,2,4,-1,-1, 5,-1,-1,3,-1,6,-1,-1};
    BuildTree obj = new BuildTree();
    Node rootNode = obj.buildTrees(nodes);
    PostOrderTraversal obj1 = new PostOrderTraversal();
    obj1.postOrder(rootNode);

  }
}
