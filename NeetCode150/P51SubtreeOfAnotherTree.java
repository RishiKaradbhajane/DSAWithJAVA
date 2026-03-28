package NeetCode150;
/*
LEETCODE 572
TC = O(m+n) m - height of tree  n - height of subtree 
SC = O(1)
*/
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(){}
    public TreeNode(int val){ this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class P51SubtreeOfAnotherTree {
    public static boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSame(p.left,q.left) || isSame(p.right, q.right);
    }
    public static boolean isSubTree(TreeNode root, TreeNode subroot){
        if(root==null){
            return true;
        }
        if(isSame(root, subroot)){
            return true;
        }
        return isSubTree(root.left, subroot) || isSubTree(root.left, subroot);
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
                Sample sub-Tree:
                  2   
                 / \   
                4   5   
        */

        TreeNode q = new TreeNode(2);
        q.left = new TreeNode(4);
        q.right = new TreeNode(5);

        boolean flag = isSubTree(p,q);

        if(flag == true){
            System.out.println("Tree q is subtree of Tree p");
        }else{
            System.out.println("Tree q is not subtree of Tree p");
        }
    }
}
