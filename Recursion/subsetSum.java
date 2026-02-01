import java.util.*;
public class subsetSum {

    //gfg
    public static void subsetsums(int idx, int[] arr,int sum, ArrayList<Integer> result){
        if(idx==arr.length){
            result.add(sum);
            return;
        }
        sum+=arr[idx];
        subsetsums(idx+1,arr,sum,result);
        sum-=arr[idx];
        subsetsums(idx+1,arr,sum,result);
    }
    /*
    Given an array of positive integers arr[] and a value sum, determine if there is a subset of arr[] with sum equal to given sum. 
     */
    private static boolean subsetsum(int idx, int[] arr, int sum, int target){
        if(idx==arr.length){
            if(target==0){
                return true;
            }
            return false;
        }
        if(arr[idx]<=target){
            sum += arr[idx];
        if(subsetsum(idx+1, arr, sum, target-arr[idx])==true) return true;
        sum -= arr[idx];
        }
        
        if(subsetsum(idx+1, arr, sum, target)==true) return true;
        return false;
        
    }
    public static void main(String[] args){
        int[] arr = {3,1,2};
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print("Sum of all the subsets of an array is : ");
        subsetsums(0,arr,0,result);
        System.out.println(result);
        int [] arr1 = {3, 34, 4, 12, 5, 2};
        int target = 9;
        System.out.println(subsetsum(0,arr1, 0, target));


    }
}
