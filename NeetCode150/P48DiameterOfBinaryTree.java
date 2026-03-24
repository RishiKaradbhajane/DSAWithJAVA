package NeetCode150;
/*
LEETCODE 543
TC = O(N)
SC (STACK SPACE) = O(h) h-> height of the tree
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class P48DiameterOfBinaryTree {
    static int maxDiameter = 0;
    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);
        maxDiameter = Math.max(maxDiameter, leftH + rightH);

        return 1+ Math.max(leftH, rightH);
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return maxDiameter;
    }
    public static void main(String[] args) {

        /*
                Sample Tree:
                    1
                   / \
                  2   3
                 / \
                4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        
        int diameter = diameterOfBinaryTree(root);

        System.out.println("Diameter of Binary Tree: " + diameter);
    }
}
