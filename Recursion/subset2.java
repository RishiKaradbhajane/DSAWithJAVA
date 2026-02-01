import java.util.ArrayList;
import java.util.List;

public class subset2 {
    /*
    Subset II Leetcode (90)
    Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
    The solution set must not contain duplicate subsets. Return the solution in any order.
    */
    public static void findSet(int idx, int[] arr, List<Integer> ds, List<List<Integer>> result){
        result.add(new ArrayList<Integer>(ds));
        for(int i= idx; i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            findSet(i+1, arr, ds, result);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,2};
        System.out.print("all possible subsets of arr1 without duplicate is : ");
        List<List<Integer>> result = new ArrayList<>();
        findSet(0,arr,new ArrayList<>(), result);
        System.out.println(result);
    }
}
