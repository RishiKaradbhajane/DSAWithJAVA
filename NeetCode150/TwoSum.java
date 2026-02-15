package NeetCode150;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{i,map.get(comp)};
            }
            map.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args){
        int[] arr = twoSum(new int[]{2,7,11,15},13);
        System.out.print("["+arr[0]+","+arr[1]+"]");
    }
}
