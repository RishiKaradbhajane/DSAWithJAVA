package NeetCode150;

import java.util.*;

/*
LEETCODE 739
APPROACH : Using stack 
TC = O(N) SC = O(N)
 */
public class DailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
        System.out.print("The next day temperatures are : \n");
        for (int num : ans) {
            System.out.print(num + ",");
        }
    }
}
