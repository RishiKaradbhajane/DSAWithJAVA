package NeetCode150;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        for(int i=0; i<nums.length; i++){
            ans[i] = prefix;
            prefix = prefix*nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            ans[i] = ans[i]*postfix;
            postfix = postfix*nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] ans = productExceptSelf(new int[]{-1,1,0,-3,3});
        for(int i : ans) System.out.print(i+" ");
    }
}
