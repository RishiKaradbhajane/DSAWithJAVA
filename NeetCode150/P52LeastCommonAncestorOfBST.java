package NeetCode150;
/*
LEETCODE 235
Approach      TC(Skewed BST)  TC(Balanced BST)  SC(Skewed BST)  SC(Balanced BST)
Recursive :    O(N)            O(log(N))         O(N)            O(log(N))
Iterative :    O(N)            o(log(N))         O(1)            O(1)
*/
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
public class P52LeastCommonAncestorOfBST {
    // Approach 1 : Iterative
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null){
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }
            else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
    //Approach 2 : Recursive
    public static TreeNode lowestCommonAncestor2(TreeNode root,TreeNode p, TreeNode q){
        if(p.val < root.val && q.val < root.val){
            lowestCommonAncestor2(root.left, p, q);
        }
        if(p.val > root.val && q.val > root.val){
            lowestCommonAncestor2(root.right, p, q);
        }
        else{
            return root;
        }
        return null;
    }
    public static void main(String[] args) {

        /*
                 6
               /   \
              2     8
             / \   / \
            0   4 7   9
               / \
              3   5
        */

        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left;        // Node with value 2
        TreeNode q = root.left.right;  // Node with value 4

        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println("Using Iterative Approach");
        if (lca != null) {
            System.out.println("LCA: " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
        System.out.println("Using Recursive Approach");
        TreeNode lca2 = lowestCommonAncestor2(root, p, q);
        if (lca2 != null) {
            System.out.println("LCA: " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
    }

}
