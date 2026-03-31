package NeetCode150;

import java.util.ArrayList;

/*
LEETCODE 230
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
public class P57KthSmallestElementInBST {
    public ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> arr){
        if(root==null){
            return arr;
        }
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
        return arr;
    }
    public int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root,arr);
        return arr.get(k-1);
    }
    public static void main(String[] args){
        P57KthSmallestElementInBST obj = new P57KthSmallestElementInBST();

        /*
                5
               / \
              3   7
             / \   \
            2   4   8
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);

        int k = 3;

        int result = obj.kthSmallest(root, k);
        System.out.println("Kth smallest element (k = " + k + "): " + result);
    }
}
