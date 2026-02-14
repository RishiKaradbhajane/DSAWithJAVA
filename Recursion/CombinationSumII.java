import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void combination(int[] arr, int target, ArrayList<Integer> ds, List<List<Integer>> result,int idx){
        if(target==0){
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx; i<arr.length; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(arr[idx]>target) break;
            ds.add(arr[idx]);
            combination(arr, target-arr[i], ds, result, i+1);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        combination(candidates,target, new ArrayList<>(),result, 1);
        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> result = combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        for(List<Integer> l : result){
            System.out.println(l);
        }
    }
}
