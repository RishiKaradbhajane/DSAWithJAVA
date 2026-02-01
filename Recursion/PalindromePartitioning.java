import java.util.*;
public class PalindromePartitioning {
    public static boolean isPalindrome(String s){
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static void partition(String s, int idx, List<String> ds, List<List<String>> ans){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i<s.length(); i++){
            if(isPalindrome(s.substring(idx,i+1))){
                ds.add(s.substring(idx,i+1));
                partition(s,i+1,ds, ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    public static void main(String[] args){
        String s = "aabb";
        List<List<String>> result = new ArrayList<>();
        partition(s,0, new ArrayList<>(), result);
        System.out.println(result);
    }
}
