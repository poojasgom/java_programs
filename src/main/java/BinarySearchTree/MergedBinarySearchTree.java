package BinarySearchTree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.ArrayList;

//Approach
//BST 1 => get inorder sequence and store in al1.
//BST 2 => get inorder sequence and store in al2.
//sort and merge al1 an al2 into single al.
// Now create a BST using the merged list.
//O(n+m)
public class MergedBinarySearchTree {

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

    public static void getInorder(ArrayList<Integer> al, Node root) {
        if (root == null) return;

        getInorder(al,root.left);
        al.add(root.data);
        getInorder( al, root.right);
    }

    public static Node createBST(ArrayList<Integer> al, int st, int end) {
        if(st>end)return null;
        int mid = (st + end) / 2;
        Node root = new Node(al.get(mid));
        root.left = createBST(al, st, mid - 1);
        root.right = createBST(al, mid + 1, end);
        return root;
    }

    public static Node mergedBST(Node root1, Node root2) {

        ArrayList<Integer> al1 = new ArrayList<>();
        getInorder(al1, root1);

        ArrayList<Integer> al2 = new ArrayList<>();
        getInorder(al2, root2);

        //sort and merge 2 bst.
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < al1.size() && j < al2.size()) {
            if (al1.get(i) < al2.get(j)) {
                mergedList.add(al1.get(i));
                i++;
            } else {
                mergedList.add(al2.get(j));
                j++;
            }
        }

        while(i<al1.size()){
            mergedList.add(al1.get(i));
                    i++;
        }
        while (j<al2.size()){
            mergedList.add(al2.get(j));
            j++;
        }

        // create bst
return createBST(mergedList, 0, mergedList.size()-1);
    }

    public static void preOrderTraversal(Node root){
        if(root == null)return;

        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root1 = new Node (2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node (9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        Node root = mergedBST(root1, root2);
        preOrderTraversal(root);
    }

}
