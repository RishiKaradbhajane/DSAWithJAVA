package NeetCode150;
/*
LEETCODE 153
TC = O(log(N))
SC = O(1)
 */
public class FindMinimumInRotatedSortedArray {
    public static int findMin(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int ans = nums[0];
        while(left<=right){
            if(nums[left] < nums[right]){
                ans = Math.min(ans, nums[left]);
            }
            int mid = left + (right-left) / 2;
            ans = Math.min(ans, nums[mid]);
            if(nums[left]<nums[mid]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int min = findMin(new int[]{3,4,5,1,2,0});
        System.out.println("the minimum of all the elements in the given array is : "+min);
    }
}
