package NeetCode150;

import java.util.*;

/*
LEETCODE 105
TC = O(N)
SC = O(N)
 */
public class P58ConstructBinaryTreeUsingInorderAndPreOrder {
    int preorderIndex;
    Map<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return arrayToTree(preorder, 0, preorder.length - 1);
    }

    public TreeNode arrayToTree(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootVal = preorder[preorderIndex];
        preorderIndex++;
        TreeNode root = new TreeNode(rootVal);
        root.left = arrayToTree(preorder, left, inorderMap.get(rootVal) - 1);
        root.right = arrayToTree(preorder, inorderMap.get(rootVal) + 1, right);
        return root;
    }

    // Level order traversal with nulls
    public void levelOrderWithNulls(TreeNode root) {
        List<String> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                result.add("null");
                continue;
            }

            result.add(String.valueOf(current.val));
            queue.offer(current.left);
            queue.offer(current.right);
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        P58ConstructBinaryTreeUsingInorderAndPreOrder obj = new P58ConstructBinaryTreeUsingInorderAndPreOrder();

        // Sample input
        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };

        TreeNode root = obj.buildTree(preorder, inorder);

        System.out.println("constructed tree:");
        obj.levelOrderWithNulls(root);
    }

}
