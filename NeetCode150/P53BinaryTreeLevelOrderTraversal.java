package NeetCode150;
import java.util.*;
/*
LEETCODE 102
TC = O(N)
SC = O(h) height of the tree
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
public class P53BinaryTreeLevelOrderTraversal {
    List<List<Integer>> result = new ArrayList<>();

    public void order(TreeNode root, int level){
        if(result.size()==level){
            result.add(new ArrayList<Integer>());
        }
        result.get(level).add(root.val);
        if(root.left!=null){
            order(root.left,level+1);
        }
        if(root.right!=null){
            order(root.right,level+1);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return result;
        }
        order(root,0);
        return result;
    }
    public static void main(String[] args) {

        // Constructing the tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4   5 6   7

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Call level order traversal
        P53BinaryTreeLevelOrderTraversal obj = new P53BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = obj.levelOrder(root);

        // Print result
        System.out.println(result);
    }
}
