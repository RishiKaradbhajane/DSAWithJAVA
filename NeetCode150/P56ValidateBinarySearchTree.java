package NeetCode150;
/*
LEETCODE 98
TC = O(N)
SC = O(N) */
class TreeNode{
    int val;
    TreeNode left; 
    TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class P56ValidateBinarySearchTree {
    public Integer prev;
    public boolean isValidBST(TreeNode root) {
        prev = null;
        return inOrder(root);
        
    }
    public boolean inOrder(TreeNode root){
        if(root == null){
            return true;
        }
        if(!inOrder(root.left)){
            return false;
        }
        if(prev != null && root.val<=prev){
            return false;
        }
        prev = root.val;
        return inOrder(root.right);
    }
    public static void main(String[] args) {
        P56ValidateBinarySearchTree obj = new P56ValidateBinarySearchTree();

        // ✅ Example 1: Valid BST
        /*
                5
               / \
              3   7
             / \   \
            2   4   8
        */
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);
        root1.right.right = new TreeNode(8);

        System.out.println("Is valid BST (Example 1): " + obj.isValidBST(root1));

        // ❌ Example 2: Invalid BST
        /*
                5
               / \
              3   7
                 /
                4   <-- invalid (should be >5)
        */
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);

        System.out.println("Is valid BST (Example 2): " + obj.isValidBST(root2));
    }

}
