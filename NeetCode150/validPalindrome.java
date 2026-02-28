package NeetCode150;
// Leetcode 1125
// T.C. = O(n)
// S.C. = O(1)
public class validPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        boolean test = isPalindrome("A man, a plan, a canal: Panama");
        if(test == true) System.out.println("the given string is valid palindrome");
        else System.out.println("the given string is not valid palindrome");
    }
}
