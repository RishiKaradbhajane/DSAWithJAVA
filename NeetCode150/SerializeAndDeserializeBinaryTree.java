package NeetCode150;
import java.util.*;
/*
LEETCODE 297
Time Complexity: O(n) for both serialize and deserialize
Space Complexity:
O(n) for storing data
O(h) recursion stack
    Worst case: O(n)
    Balanced tree: O(log n)
 */
public class SerializeAndDeserializeBinaryTree {
    public String recSerialize(TreeNode root, String str){
        if(root==null){
            return str+="null,";
        }
        else{
            Integer rootval = root.val;
            str += rootval.toString()+",";
            str = recSerialize(root.left, str);
            str = recSerialize(root.right, str);
        }
        return str;
    }
    public String serialize(TreeNode root){
        return recSerialize(root, "");
    }
    public TreeNode recDeserialize(List<String> str){
        if(str.get(0).equals("null")){
            str.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str.get(0)));
        str.remove(0);
        root.left = recDeserialize(str);
        root.right = recDeserialize(str);
        return root;
    }
    public TreeNode deserialize(String data){
        String[] str = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(str));
        return recDeserialize(list);
    }
    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree obj = new SerializeAndDeserializeBinaryTree();

        // Create sample tree:
        //        1
        //       / \
        //      2   3
        //         / \
        //        4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Serialize
        String serialized = obj.serialize(root);
        System.out.println("Serialized Tree: " + serialized);

        // Deserialize
        TreeNode newRoot = obj.deserialize(serialized);

        // Serialize again to verify
        String check = obj.serialize(newRoot);
        System.out.println("After Deserialization: " + check);
    }
}
