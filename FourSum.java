import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(i>0 && nums[i]==nums[i-1]) continue;
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                twoSum(i,j,nums,target, result);
            }
        }
        return result;
    }
    public static void twoSum(int i, int j, int[] nums, int target,List<List<Integer>> result){
        int left = j+1;
        int right = nums.length-1;
        while(left<right){
            long sum = (long)nums[i]+nums[j]+nums[left]+nums[right];
            if(sum>target) right--;
            else if(sum<target) left++;
            else{
                result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                left++;
                right--;
                while(left < right && nums[left] == nums[left-1]) left++;
                while(left < right && nums[right] == nums[right+1]) right--;
                
            }
        }
    }
    public static void main(String[] args) {
    FourSum obj = new FourSum();

    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;

    List<List<Integer>> result = obj.fourSum(nums, target);

    System.out.println("Quadruplets that sum to " + target + ":");
    for (List<Integer> quad : result) {
        System.out.println(quad);
    }
}

}
