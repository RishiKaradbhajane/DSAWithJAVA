package NeetCode150;
// Leetcode 167
// T.C. O(NlogN)
// S.C  O(1)
public class twoSumIIWhenArrayIsSorted {
    //APPROACH 1
    // T.C. O(logn)
    public static int binarySearch(int[] nums,int target, int left, int right){
        while(left<=right){
            int mid = left +(right-left)/2;
            if(target == nums[mid]) return mid;
            if(target>nums[mid]) left = mid+1;
            if(target<nums[mid]) right = mid-1;
        }
        return -1;
    }
    public static int[] twoSum(int[] numbers, int target) {
        for(int i=0; i<numbers.length; i++){
            int remaining = target - numbers[i];
            int idx = binarySearch(numbers, remaining, i+1, numbers.length-1);
            if(idx != -1){
                return new int[]{i+1,idx+1};
            }
        }
        return null;
    }
    //APPROACH 2
    // T.C. O(N)
    public static int[] twoSum2(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum>target) right--;
            else if(sum<target) left++;
            else{
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }
    public static void main(String[] args){
        int[] result = twoSum(new int[]{1,3,5,6,7,8,9},11);
        for(int n : result){
            System.out.print(n+" ");
        }
        System.out.println();
        int[] result2 = twoSum2(new int[]{1,3,5,6,7,8,9},11);
        for(int n : result2){
            System.out.print(n+" ");
        }
    }
}
