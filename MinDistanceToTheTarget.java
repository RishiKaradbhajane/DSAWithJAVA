/*
LEETCODE 1848
SC = O(1)
TC = O(N) */
public class MinDistanceToTheTarget {
    public int getMinDistance(int[] nums, int target, int start) {
        int minDist = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int dist = Math.abs(i-start);
                minDist = Math.min(dist, minDist);
            }
        }
        return minDist;
    }
    public static void main(String[] args){
        MinDistanceToTheTarget obj = new MinDistanceToTheTarget();
        int distance = obj.getMinDistance(new int[]{1,2,3,4,5},5,3);
        System.out.println("Minimum distance is "+distance);

    }
}
