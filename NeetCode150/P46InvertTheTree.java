package NeetCode150;
/*
LEETCODE 226
TC = O(N)
SC = O(1)
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
public class P46InvertTheTree {
    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }
    // Helper method to print tree (Inorder traversal)
    public static void printInorder(TreeNode root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        /*
                Sample Tree:
                    4
                   / \
                  2   7
                 / \ / \
                1  3 6  9
        */

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.print("Original Tree (Inorder): ");
        printInorder(root);
        System.out.println();

        invertTree(root);

        System.out.print("Inverted Tree (Inorder): ");
        printInorder(root);
        System.out.println();
    }
}
