public class Solution {
    /**
     * @param s: input string
     * @return: a string as the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        int left = 0, right = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddLength = expandAroundCenter(s, i, i);
            int evenLength = expandAroundCenter(s, i, i + 1);
            
            int length = Math.max(oddLength, evenLength);
            
            if (length > right - left) {
                left = i - (length - 1) / 2;
                right = i + length / 2;
            }
        }
        
        return s.substring(left, right + 1);
    }

    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}