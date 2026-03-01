package NeetCode150;

public class trappingRainwater {
    /*
    LEETCODE 42 (VERY VERY IMPORTANT QUESTIONS WITH INTERVIEW PERSPECTIVE)
    Approach 1
    TC = O(N) SC = O(2N)
     */
    public static int trap1(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for(int i=1; i<n; i++){
            int max = Math.max(leftMax[i-1],height[i]);
            leftMax[i] = max;
        }
        for(int i=n-2; i>=0; i--){
            int max = Math.max(rightMax[i+1],height[i]);
            rightMax[i] = max;
        }
        int maxWater = 0;
        for(int i=0; i<n; i++){
            int water = Math.min(leftMax[i],rightMax[i]) - height[i];
            if(water>0) maxWater += water; 
        }
        return maxWater;
    }
    /*
    Approach 1
    MOST PREFERRED APPROACH
    TC = O(N) SC = O(1)
     */
    public static  int trap2(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftMax = height[0];
        int rightMax = height[n-1];
        int total = 0;
        while(left<right){
            if(height[left]<height[right]){
                leftMax = Math.max(leftMax, height[left]);
                int water = leftMax - height[left];
                if(water>0) total += water;
                left++;
            }
            else{
                rightMax = Math.max(rightMax, height[right]);
                int water = rightMax - height[right];
                if(water > 0) total += water;
                right--;
            }
        }
        return total;
    }
    public static void main(String[] args){
        int capacity1 = trap1(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println("The capacity to trap rainwater is : "+capacity1);

        int capacity2 = trap2(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
        System.out.println("The capacity to trap rainwater is : "+capacity2);
    }
}
