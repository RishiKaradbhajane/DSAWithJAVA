package NeetCode150;

import java.util.*;

public class TopKFrequentELement {

    // Approach 1
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b)->map.get(a)-map.get(b));
        
        for(int n : map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
            ans[i]= heap.poll();
        }
        return ans;
    }

    // Approach 2
    public static int[] topKFrequent2(int[] nums, int k) {
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
        System.out.println();
        int[] ans2 = topKFrequent2(new int[]{1,1,1,2,2,3},2);
        for(int n : ans2){
            System.out.print(n+" ");
        }
    }
}
