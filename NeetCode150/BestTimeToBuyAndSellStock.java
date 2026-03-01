package NeetCode150;

public class BestTimeToBuyAndSellStock {
    /*
    LEETCODE 121
    TC = O(N) SC = O(1)
     */
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }
    public static void main(String[] args){
        int profit = maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println("The profit over the given days is : "+profit);
    }
}
