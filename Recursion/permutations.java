import java.util.*;
/*
LEETCODE 46. PERMUTATIONS
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
*/
public class permutations {
    private static void findPermutation(int[] arr, boolean[] map, List<Integer> ds, List<List<Integer>> result){
        if(ds.size()==arr.length){
            result.add(new ArrayList<Integer>(ds));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(map[i]==true) continue;
            ds.add(arr[i]);
            map[i]=true;
            findPermutation(arr,map, ds, result);
            ds.remove(ds.size()-1);
            map[i]=false;
        }
    }
    private static void permutationUsingRecursion(int idx, int[] arr, List<List<Integer>> result){
        if(idx==arr.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                ds.add(arr[i]);
            }
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx ; i<arr.length; i++){
            swap(i, idx, arr);
            permutationUsingRecursion(idx+1, arr, result);
            swap(i, idx, arr);
        }
    }
    private static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {2,1,3};
        List<List<Integer>> result = new ArrayList<>();
        System.out.println("Permutations using extra space");
        findPermutation(arr, new boolean[arr.length], new ArrayList<Integer>(), result);
        System.out.println(result);

        System.out.println("Permutations using swapping :");
        List<List<Integer>> result2 = new ArrayList<>();
        permutationUsingRecursion(0, arr, result2);
        System.out.println(result2);
    }
}
