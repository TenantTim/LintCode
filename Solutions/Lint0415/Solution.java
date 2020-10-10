public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
            
        int sPivot = 0, ePivot = s.length() - 1;
        while (sPivot < ePivot)
        {
            while ((!isCharacter(s.charAt(sPivot))) && sPivot < s.length() - 1)
                sPivot++;
            
            while ((!isCharacter(s.charAt(ePivot))) && ePivot > 0)
                ePivot--;
                
            if (sPivot >= ePivot)
                return true;
                
            if (!isSameCharacter(s.charAt(ePivot), s.charAt(sPivot)))
                return false;
            
            sPivot++;
            ePivot--;
        }
        
        return true;
    }
    
    private boolean isCharacter(char c)
    {
        if (c >= 'a' && c <= 'z')
            return true;
            
        if (c >= 'A' && c <= 'Z')
            return true;
        
        if (c >= '0' && c <= '9')
            return true;

        return false;
    }
    
    private boolean isSameCharacter(char a, char b)
    {
        if (a >= 'A' && a <= 'Z')
            a += Math.abs('A' - 'a');
        
        if (b >= 'A' && b <= 'Z')
            b += Math.abs('A' - 'a');
        
        return (a==b);
    }
}