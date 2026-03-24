package NeetCode150;
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
public class P47MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftH = maxDepth(root.left);
        int rightH = maxDepth(root.right);
        return Math.max(leftH, rightH)+1;
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

        int depth = maxDepth(root);

        System.out.println("Maximum Depth of Tree: " + depth);
    }

}
