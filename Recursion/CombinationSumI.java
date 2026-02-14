import java.util.*;
public class CombinationSumI {
    public static void combination(int[] arr, int target, ArrayList<Integer> ds, List<List<Integer>> result, int idx) {
        if (idx == arr.length) {
            if (target == 0)
                result.add(new ArrayList<>(ds));
            return;
        }
        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            target -= arr[idx];
            combination(arr,target, ds, result, idx);
            ds.remove(ds.size()-1);
            target += arr[idx];
        }
        combination(arr, target, ds, result, idx +  1);
        /* 
        if (arr[idx] <= target) {
            ds.add(arr[idx]);
            combination(arr,target - arr[idx], ds, result, idx);
            ds.remove(ds.size()-1);
        }
        combination(arr, target, ds, result, idx +  1);
        */
    }
  
    

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = combinationSum(new int[]{2, 3, 6, 7}, 7);
        for(List<Integer> l : result){
            System.out.println(l);
        }
    }
}