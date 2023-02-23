package BinarySearchTree;

//O(n)
public class SortedArrayToBalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }


        public static void preOrderTraversal(Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public static Node sortedArrayToBalancedBinaryTree(int[] arr, int st, int end) {
            if (st > end) return null;

            int mid = (st + end) / 2;
            Node root = new Node(arr[mid]);
            root.left = sortedArrayToBalancedBinaryTree(arr, st, mid - 1);
            root.right = sortedArrayToBalancedBinaryTree(arr, mid + 1, end);
            return root;
        }

        public static void main(String[] args) {
            int arr[] = {3, 5, 6, 8, 10, 11, 12};
            Node root = sortedArrayToBalancedBinaryTree(arr, 0, arr.length - 1);
            preOrderTraversal(root);

        }

    }

}
