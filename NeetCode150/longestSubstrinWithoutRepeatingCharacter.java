package NeetCode150;
import java.util.*;

public class longestSubstrinWithoutRepeatingCharacter {
    /*
    LEETCODE 3
    VERY VERY IMPORTANT PROBLEM WITH INTERVIEW PERSPECTIVE
    APPROACH 1 : USING ArrayList
    TC = O(n)
     */
    public static int lengthOfLongestSubstring1(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int start = 0, end = 0;
        int subStr = 0;
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                subStr = Math.max(subStr,list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return subStr;
    }
    /*
    APPROACH 2 : USING HashSet
    TC = O(n)
     */
    public static int lengthOfLongestSubstring2(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int len = 0;
        while(end<s.length()){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            len = Math.max(len,end-start+1);
            end++;
        }
        return len;
    }
    public static void main(String[] args){
        String str = "pwwkenw";
        int length = lengthOfLongestSubstring1(str);
        System.out.println("The longest substring without repeating character of "+ str + " is : "+length);
        int length2 = lengthOfLongestSubstring2(str);
        System.out.println("The longest substring without repeating character of "+ str + " is : "+length2);
    }
}
