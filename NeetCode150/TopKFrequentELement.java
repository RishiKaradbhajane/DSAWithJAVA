package NeetCode150;

import java.util.*;

public class TopKFrequentELement {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int c : nums){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int n : map.keySet()){
            int freq = map.get(n);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(n);
        }
        int[] ans = new int[k];
        int counter = 0;
        for(int i=bucket.length-1; i>=0 && counter<k; i--){
            if(bucket[i]!=null){
                for(Integer num : bucket[i]){
                    ans[counter++] = num;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] ans = topKFrequent(new int[]{1,1,1,2,2,3},2);
        for(int n : ans){
            System.out.print(n+" ");
        }
    }
}
