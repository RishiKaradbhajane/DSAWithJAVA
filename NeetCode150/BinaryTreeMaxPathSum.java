package NeetCode150;
/*
LEETCODE 124
TC = O(N)
SC = O(h) , h = height of the tree
 */
public class BinaryTreeMaxPathSum {
    int maxSum = Integer.MIN_VALUE;
    public int maxGain(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftGain = Math.max(maxGain(root.left),0);
        int rightGain = Math.max(maxGain(root.right),0);
        int sum = root.val + leftGain + rightGain;
        maxSum = Math.max(maxSum,sum);
        return root.val+Math.max(leftGain, rightGain);
    }
    public int maxPathSum(TreeNode root){
        maxGain(root);
        return maxSum;
    }
    public static void main(String[] args){
        BinaryTreeMaxPathSum obj = new BinaryTreeMaxPathSum();

        /*
                Sample Tree:
                      -10
                      /  \
                     9   20
                        /  \
                       15   7

            Expected Output: 42  (15 + 20 + 7)
        */

        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = obj.maxPathSum(root);

        System.out.println("Maximum Path Sum: " + result);
    }

}
