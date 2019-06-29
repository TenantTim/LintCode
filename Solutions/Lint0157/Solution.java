public class Solution {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        Set<Character> set = new HashSet<Character>();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (set.contains(charArray[i])) {
                return false;
            }
            else {
                set.add(charArray[i]);
            }
        }
        return true;
    }
}