package BinarySearchTree;

import BinarySearchTree.BuildABinarySearchTree.Node;
import java.util.ArrayList;

// Print all paths from root to leaf.
public class RootToLeafPaths {

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

  public static void printPath(ArrayList<Integer> path){
    for(int i=0;i<path.size();i++){
      System.out.print(path.get(i)+"->");
    }
    System.out.print("null");
  }

  public static void findPathsFromRootTOLeaf(Node root, ArrayList<Integer> path){
    //arrayList - to store path as we traverse the tree.

    //First add root data to the AL
    // add all elements to path until i reach leaf node.
    //once i reach leaf node i print the path and remove entry from path
    // repeat until all leaf node path are printed.
if(root == null ){
  return;
}
    path.add(root.data);
    findPathsFromRootTOLeaf(root.left, path);
    findPathsFromRootTOLeaf(root.right, path);
    if(root.left==null && root.right == null)
    printPath(path);
    path.remove(path.size()-1); // assuming that by this step left and right elemnts are removed
    // and just root is left.

  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      root.left = insert(root.left, val);
    } else {
      root.right = insert(root.right, val);
    }
    return root;
  }

  public static void main(String[] args) {
    int[] values = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i=0; i<values.length;i++){
      root = RootToLeafPaths.insert(root,values[i]);
    }
    RootToLeafPaths.findPathsFromRootTOLeaf(root, new ArrayList<>());
  }
}
