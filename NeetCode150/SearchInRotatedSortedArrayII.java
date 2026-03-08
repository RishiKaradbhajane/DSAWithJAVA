package NeetCode150;
/*
LEETCODE 81
TC = O(logN)
SC =  O(1)
 */
public class SearchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(target == nums[mid]) return true;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left = left + 1;
                right = right - 1;
                continue;
            }
            
            if(nums[left]<=nums[mid]){
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        boolean flag = search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0);
        if(flag == true){
            System.out.println("The target element is present in an array ");
        }else{
            System.out.println("The target element is not present in an array ");
        }
    }
}
