package NeetCode150;
/*
LEETCODE 1448
SC = O(N)
TC = O(N)
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
public class P55CountGoodNodesInBinaryTree {
    static int counter = 0;
    public int goodNodes(TreeNode root){
        counter = 0;
        countGoodNodes(root, Integer.MIN_VALUE);
        return counter;
    }
    public void countGoodNodes(TreeNode root, int maxVal){
        if(root==null){
            return;
        }
        if(maxVal<=root.val){
            counter++;
            maxVal=root.val;
        }
        countGoodNodes(root.left, maxVal);
        countGoodNodes(root.right, maxVal);
    }
    public static void main(String[] args) {

        // Constructing the tree:
        //         3
        //        / \
        //       1   4
        //      /     \
        //     3       5

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(5);
        P55CountGoodNodesInBinaryTree obj = new P55CountGoodNodesInBinaryTree();
        int result = obj.goodNodes(root);

        System.out.println("Good Nodes Count: " + result);
    }

}
