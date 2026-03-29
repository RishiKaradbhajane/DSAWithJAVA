package NeetCode150;

import java.util.*;
/*
LEETCODE 199
TC = O(N)
SC = O(N)
*/
public class P54BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            for(int i=0; i<levelsize; i++){
                TreeNode currNode = queue.poll();
                if(i==levelsize-1){
                    result.add(currNode.val);
                }
                if(currNode.left!=null){
                    queue.add(currNode.left);
                }
                if(currNode.right!=null){
                    queue.add(currNode.right);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        // Constructing the tree:
        //         1
        //       /   \
        //      2     3
        //     / \     
        //    6   5     
        //   /
        //  7
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(7);

        P54BinaryTreeRightSideView obj = new P54BinaryTreeRightSideView();
        List<Integer> result = obj.rightSideView(root);
        System.out.print("right side view of the give binary tree is : ");
        System.out.println(result);
    }

}
