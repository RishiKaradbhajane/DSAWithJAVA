public class LongestPalindromeSubstring{
    public String longestPalindrome(String s){
        int n = s.length();

        int start = 0, maxLen = 0;

        for(int i=0; i<n; i++){
            for(int j=0;j<=1;j++){
                int low = i;
                int high = i+j;

                while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                    int currLen = high-low+1;

                    if(currLen > maxLen){
                        start = low;
                        maxLen = currLen;
                    }
                    low--;
                    high++;
                }
            }
        }
        return s.substring(start, start+maxLen);
    }
    public static void main(String[] args){
        LongestPalindromeSubstring obj = new LongestPalindromeSubstring();
        String s = "forgeeksskeegfor";
        String LPS = obj.longestPalindrome(s);
        System.out.println("The longest palindrome substring of "+s+" is "+LPS);
    }
}