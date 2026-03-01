package NeetCode150;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;
        
        while(left<right){
            int currWater=0;
            currWater = Math.min(height[left],height[right])*(right-left);
            maxWater = Math.max(maxWater,currWater);
            if(height[left]<=height[right]){
                left++;
            }
            else if(height[left]>height[right]){
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args){
        int maxWater = maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println("the maximum water that container could store is : "+ maxWater);
    }
}
