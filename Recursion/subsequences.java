import java.util.*;

public class subsequences {

    public static List<List<Integer>> powerSet(int[] nums) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            ArrayList<Integer> num = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0)
                    num.add(nums[i]);
            }
            arr.add(num);
        }
        return arr;
    }
    public static List<String> powerSetForString(String str){
        ArrayList<String> result = new ArrayList<>();
        int n = str.length();
        for(int mask = 0; mask<=(1<<n)-1;mask++) {
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i<=n-1; i++){
                if((mask & (1<<i)) != 0){
                    sb.append(str.charAt(i));
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

    public static void subsequenceUsingRecursion(String str, int idx, StringBuilder sb, List<String> result) {
        if (idx == str.length()) {
            result.add(sb.toString());
            if(sb.equals(" ")) result.add("{}");
            return;
        }
        sb.append(str.charAt(idx));
        subsequenceUsingRecursion(str, idx + 1, sb, result);
        sb.deleteCharAt(sb.length() - 1);
        subsequenceUsingRecursion(str, idx + 1, sb, result);
    }
    // Print all subsequences where sum is equal to K
    public static void subsequencesInteger(int[] arr,int k,int sum, int idx, List<Integer> result){
        if(idx == arr.length){
            if(sum==k){
                System.out.println(result);
            }
            return;
        }
        result.add(arr[idx]);
        sum += arr[idx];
        subsequencesInteger(arr,k,sum,idx+1,result);
        result.removeLast();
        sum -=arr[idx];
        subsequencesInteger(arr,k,sum,idx+1,result);
    }
    // Print any subsequence whose sum is sum
    public static boolean subsequenceAnyOne(int[] arr, int k, int sum, int idx, List<Integer> result){
        if(idx == arr.length){
            if(sum==k){
                System.out.println(result);
                return true;
            }
            return false;
        } 
 
        result.add(arr[idx]);
        sum += arr[idx];
        if(subsequenceAnyOne(arr,k,sum,idx+1,result)==true) return true;
        result.removeLast();
        sum -= arr[idx];
        if(subsequenceAnyOne(arr,k,sum,idx+1,result)== true) return true;

        else return false;
    }
    //count the subsequences with sum = k
    public static int countOfSubsequences(int[] arr, int k, int sum,int idx, List<Integer> result){

        //base case
        if(idx == arr.length){
            if(sum==k) return 1;
            else return 0;
        }
        // one more base case
        if(sum>k) return 0;
        result.add(arr[idx]);
        sum += arr[idx];
        int l = countOfSubsequences(arr, k, sum, idx+1, result);
        result.removeLast();
        sum -= arr[idx];
        int r = countOfSubsequences(arr, k, sum, idx+1, result);
        return l+r;
    }

    public static void main(String[] args) {
        System.out.println("Print all the subsequences using powerset ");
        List<List<Integer>> arr = powerSet(new int[] { 1, 2, 5 });
        System.out.println(arr);
        System.out.println("Print all the subsequences using recursion ");
        List<String> result = new ArrayList<>();
        subsequenceUsingRecursion("abcd", 0, new StringBuilder(), result);
        System.out.println(result);
        System.out.println("Print all the subsequences with sum is k");
        int k = 6;
        subsequencesInteger(new int[]{1,4,2,3,5},k,0, 0, new ArrayList<>());
        System.out.println("Print only one subsequence with sum is k");
        System.out.println(subsequenceAnyOne(new int[]{1,2,3,4,5},k,0,0,new ArrayList<>()));
        System.out.println("Count of number of subsequences are ");
        int count = countOfSubsequences(new int[]{1,4,2,3,5},k,0, 0, new ArrayList<>());
        System.out.println(count);
        List<String> str = powerSetForString("abc");
        System.out.println(str);

        
    }
}