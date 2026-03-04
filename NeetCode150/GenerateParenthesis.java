package NeetCode150;

import java.util.*;
/*
LEETCODE 22
APPROACH :Using DP and Backtracking
TC = O(2^N)
 */
public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTracking(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }
    public static void backTracking(List<String> ans, StringBuilder sb, int open, int close, int max){
        if(sb.length()==max*2){
            ans.add(sb.toString());
            return;
        }
        if(open<max){
            sb.append("(");
            backTracking(ans, sb, open+1, close, max);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            backTracking(ans, sb, open, close+1, max);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String[] args){
        int n = 1;
        List<String> list = generateParenthesis(n);
        System.out.println("Number of parenthesis pair generated using " +n+ " parenthesis is : "+list);
    }
}
