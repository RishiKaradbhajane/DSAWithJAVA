package NeetCode150;
/*
LEETCODE 287
TC = O(N)
SC = O(1)
Tortoise and Hare Algorithm (Slow and fast pointer method)
 */
public class P42FindTheDuplicateNumber {
    public static int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[nums[0]];

        while(slow != fast){
            slow = nums[slow];
            fast= nums[nums[fast]];
        }
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args){
        int num = findDuplicate(new int[]{1,3,4,2,2});
        System.out.println("The duplicate number in above array is : "+ num);
    }
}
