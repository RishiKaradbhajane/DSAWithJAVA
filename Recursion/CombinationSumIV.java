import java.util.Arrays;

public class CombinationSumIV {
    public static int[][] mem = new int[201][1001];
// Approach 1
    public static int combination(int[] nums, int target, int idx){
        if(target==0) return 1;
        if(idx==nums.length) return 0;
        int take_idx = 0;
        if(mem[idx][target]!=-1) return mem[idx][target];
        if(nums[idx]<=target){
            take_idx = combination2(nums, target-nums[idx],0);
        }
        int reject_idx = combination(nums, target, idx+1);
        return mem[idx][target] = take_idx+reject_idx;
    }
// Approach 2
public static int combination2(int[] nums, int target, int idx){
        if(target==0) return 1;
        if(idx==nums.length) return 0;
        int result = 0;
        if(mem[idx][target]!=-1) return mem[idx][target];
        for(int i=idx; i<nums.length; i++){
            if(nums[i]<=target){
                int take_idx = combination2(nums, target-nums[i],0);
                result += take_idx;
            }
        }
        return mem[idx][target] = result;
    }
    public static int combinationSum4(int[] nums, int target) {
        for (int[] row : mem) {
            Arrays.fill(row, -1);
        }
        int count = combination2(nums, target, 0); 
        return count;
    }
    public static void main(String[] args){
        int count = combinationSum4(new int[]{1,2,3},4);
        System.out.println(count);
    }
}
