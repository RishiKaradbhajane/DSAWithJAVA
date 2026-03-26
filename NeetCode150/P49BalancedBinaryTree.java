package NeetCode150;
/*
LEETCODE 110
SC = O(1)
TC = O(N) */
public class P49BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int leftH = height(root.left);
        int rightH = height(root.right);

        if(Math.abs(leftH-rightH)>1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = height(root.left);
        int rightH = height(root.right);

        return Math.max(leftH, rightH)+1;
    }
    public static void main(String[] args) {

        /*
                Sample Tree:
                    1
                   / \
                  2   3
                 / \   \
                4   5   7
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);

        boolean flag = isBalanced(root);

        if(flag == true){
            System.out.println("Given binary tree is balanced Binary Tree");
        }else{
            System.out.println("Given binary tree is not balanced Binary Tree");
        }
    }
}
