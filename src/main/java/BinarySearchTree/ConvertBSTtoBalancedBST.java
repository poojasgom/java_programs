package BinarySearchTree;

import java.util.ArrayList;

//approach -find the inorder traversal for the array - > will give a sorted array.
//use sorted array to BST approach next to traverse the array and create nodes accordingly.
//print inorder traversal of array.
public class ConvertBSTtoBalancedBST {
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

    public static void inorderTraversal(Node root, ArrayList<Integer> al) {
        if (root == null) return;
        inorderTraversal(root.left, al);
        al.add(root.data);
        inorderTraversal(root.right, al);
    }

    public static Node createBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) return null;
        int mid = (st + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public static Node createBalancedBST(Node root) {

        ArrayList<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        root = createBST(inorder, 0, inorder.size() - 1);
        return root;
    }

    public static void printPreOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        printPreOrderTraversal(root.left);
        printPreOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        //left tree
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        //right tree
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        printPreOrderTraversal(root);
        System.out.println();
        Node root1 = createBalancedBST(root);
        printPreOrderTraversal(root1);
    }
}
