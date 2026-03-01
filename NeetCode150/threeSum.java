package NeetCode150;
import java.util.*;
public class threeSum {
    /*
    LEETCODE 15
     * APPROACH 1
     * TC = O(nlogn) + O(n^2)
     * SC = O(n)
     */
    public static List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0)
                    right--;
                else
                    left++;
            }
        }
        return new ArrayList<>(set);
    }

    /*
     * APPROACH 2 : Using two sum II approach
     * TC = O(nlogn) + O(n^2)
     * SC = O(1)
     */
    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                twoSum2(nums, i, result);
            }
        }
        return result;
    }

    private static void twoSum2(int[] nums, int i, List<List<Integer>> result) {
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum > 0)
                right--;
            else if (sum < 0)
                left++;
            else {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1])
                    ++left;
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result = threeSum1(new int[] { -1, 0, 1, 2, -1, -4 });
        System.out.println("with Approach 1: " + result);

        List<List<Integer>> result2 = threeSum2(new int[] { -1, 0, 1, 2, -1, -4 });
        System.out.println("with Approach 1: " + result2);
    }
}
