package NeetCode150;
import java.util.*;
// leetcode 128
public class longestConsecutiveSubsequence {
    public static int longestConsecutive(int[] nums){
        if(nums.length==0) return 0;
        int maxLen = 0;
        int len = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(Integer element : set){
            int prevEl = element-1;
            if(!set.contains(prevEl)){
                len = 1;
                int nextEl = element + 1;
                while(set.contains(nextEl)){
                    len++;
                    nextEl++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int n = longestConsecutive(new int[]{1,3,3,4,5,6,8,9,1,2,});
        System.out.println("Longest consecutive subsequence is " + n);
    }
}
