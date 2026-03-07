package NeetCode150;
import java.util.*;
/*
LEETCODE 84
SC = O(N)
TC = O(N)
 */
public class LargestRectangleInHistogram {
    public static  int largestRectangleArea(int[] heights){
        int n = heights.length;
        int maxRectangle = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i]){
                int element = stack.pop();
                int nsc = i;
                int psc = stack.isEmpty() ? -1 : stack.peek();
                maxRectangle = Math.max(maxRectangle, heights[element]*(nsc-psc-1));
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int element = stack.pop();
            int nsc = n;
            int psc = stack.isEmpty() ? -1 : stack.peek();
            maxRectangle = Math.max(maxRectangle, heights[element]*(nsc-psc-1));
        }
        return maxRectangle;
    }
    public static void main(String[] args){
        int maxRectangle = largestRectangleArea(new int[]{2,1,5,6,2,3});
        System.out.println("The maximum rectangle that can be formed using above histogram heights is : "+maxRectangle);
    }
}
