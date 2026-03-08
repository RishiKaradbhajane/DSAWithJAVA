package NeetCode150;
/*
LEETCODE 875
TC = O(N*logN)
SC = O(1)
 */
public class KokoEatingBanana {
    public static int minEatingSpeed(int[] piles, int h){
        int min = 0;
        int max = 0;
        for(int banana : piles){
            max = Math.max(banana, max);
        }
        int ans = 0;
        while(min<=max){
            int mid = min + (max-min)/2;
            long midValue = minimumRateOfEatingBanana(piles, mid);
            if(midValue<=h){
                ans = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return ans;
    }
    public static long minimumRateOfEatingBanana(int[] piles, int speed){
        long totalHr = 0;
        for(int banana : piles){
            totalHr += (banana+speed-1)/speed;
        }
        return totalHr;
    }
    public static void main(String[] args){
        int ans = minEatingSpeed(new int[]{30,11,23,4,20},5);
        System.out.println("The minimum speed to finish all bananas is : "+ ans);
    }
}
