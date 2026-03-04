package NeetCode150;
import java.util.*;
public class PermutationInString {
    /*
    LEETCODE 567
    APPROACH 1 : Using hash arrays
    TC = O(N) SC = O(2N)
     */
    public static boolean checkInclusion1(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for(char ch : s1.toCharArray()){
            s1Map[ch-'a']++;
        }
        for(int i=0; i<s1.length(); i++){
            s2Map[s2.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length()-s1.length(); i++){
            if(matches(s1Map, s2Map)) return true;
            s2Map[s2.charAt(i)-'a']--;
            s2Map[s2.charAt(i+s1.length())-'a']++;
        }
        return matches(s1Map, s2Map);
    }
    public static boolean matches(int[] s1Map, int[] s2Map){
        if(s1Map.length!=s2Map.length) return false;
        for(int i = 0; i<26; i++){
            if(s1Map[i]!=s2Map[i]) return false;
        }
        return true;
    }
    /*
    APPROACH 2 USING HASHMAP
    TC = O(N) SC = O(2N) 
    */
    public static boolean checkInclusion2(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0; i<s1.length(); i++){
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i),0)+1);
        }
        for(int i=0; i<s2.length()-s1.length();i++){
            if(s1Map.equals(s2Map)) return true;
            
            char removeChar = s2.charAt(i);
            char addChar = s2.charAt(i+s1.length());

            s2Map.put(removeChar, s2Map.get(removeChar)-1);
            if(s2Map.get(removeChar)==0) s2Map.remove(removeChar);
            s2Map.put(addChar, s2Map.getOrDefault(addChar,0)+1);
        }
        return s1Map.equals(s2Map);
    }
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaoo";
        System.out.println("Using Approach 1");
        boolean res1 = checkInclusion1(s1, s2);
        if(res1==true) System.out.println("String "+s1+" is the permutation string of string "+s2);
        else System.out.println("String "+s1+" is not the permutation string of string "+s2);

        System.out.println("Using Approach 2");
        boolean res2 = checkInclusion2(s1, s2);
        if(res2==true) System.out.println("String "+s1+" is the permutation string of string "+s2);
        else System.out.println("String "+s1+" is not the permutation string of string "+s2);
    }
}
