package NeetCode150;
/*
LEETCODE 704
TC = O(log(N))
SC = O(1)
*/
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start) / 2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int idx = search(new int[]{1,0,3,5,9,12},9);
        if(idx != -1){
            System.out.println("The element is found at index : "+(idx+1));
        }
        else {
            System.out.println("The element is not in the given array");
        }
    }
}
