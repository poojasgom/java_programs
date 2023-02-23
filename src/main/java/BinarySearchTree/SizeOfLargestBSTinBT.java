package BinarySearchTree;
//calculate these 4 for each node
//isValidBST,   size of bst, min value , maxValue of the BT.
public class SizeOfLargestBSTinBT {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data  = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }

    public static int maxBST = 0;
    public static Info findLargestBST(Node root){
        if(root == null) return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        Info leftInfo = findLargestBST(root.left);
        Info rightInfo = findLargestBST(root.right);
        int size = leftInfo.size+rightInfo.size+1; // +1 => self
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        //check for invalid condition => not BST
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false, size, min, max);
        }

        //check that left and right subtree is a BST
        if(leftInfo.isBST && rightInfo.isBST){
            maxBST= Math.max(maxBST, size);
           return new Info(true, size, min, max);
        }
// if any condition fails then at last return false
        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info = findLargestBST(root);
        System.out.println("Largest BST Size" +maxBST);
    }
}
