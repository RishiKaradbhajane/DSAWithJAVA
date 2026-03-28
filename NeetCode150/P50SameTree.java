package NeetCode150;
/*
LEETCODE 100
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
public class P50SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val==q.val){
            return true;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args){
        /*
                Sample Tree:
                    1
                   / \
                  2   3
                 / \   \
                4   5   7
        */

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left.left = new TreeNode(4);
        p.left.right = new TreeNode(5);
        p.right.right = new TreeNode(7);

        /*
                Sample Tree:
                    1
                   / \
                  2   3
                 / \   \
                4   5   7
        */

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left.left = new TreeNode(4);
        q.left.right = new TreeNode(5);
        q.right.right = new TreeNode(7);

        boolean flag = isSameTree(p,q);

        if(flag == true){
            System.out.println("Both Binary trees are same");
        }else{
            System.out.println("Both Binary trees are not same");
        }
    }
}
