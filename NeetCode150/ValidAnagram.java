package NeetCode150;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
    if(s.length()!= t.length()) return false;
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        System.out.println();
        for(char ch : t.toCharArray()){
            freq[ch-'a']--;
        }
        for(int n : freq){
            if(n!=0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        boolean b = isAnagram("rat","cat");
        if(b==true){
            System.out.println("both strings are anagrams of each other");
        }else{
            System.out.println("both strings are not anagrams of each other");
        }
    }
}
