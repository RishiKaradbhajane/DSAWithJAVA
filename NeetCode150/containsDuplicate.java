package NeetCode150;
//LEETCODE 217
import java.util.*;

public class containsDuplicate {
//Approach 1
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++){
            if(nums[i]==nums[i-1]) return true;
        }
        return false;
    }

//Approach 2
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
    public static void main(String[] args){
        boolean b = containsDuplicate2(new int[]{1,2,3,3,4,5});
        System.out.println(b);
    }
}
