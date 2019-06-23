public class Solution {
    /**
     * @param str: An array of char
     * @param left: a left offset
     * @param right: a right offset
     * @return: return a rotate string
     */
    public String RotateString2(String str, int left, int right) {
        StringBuilder sb = new StringBuilder();
        if(left == right) {
            return str;
        }
        else {
            int offset = Math.abs(left - right) % str.length();
            if(left > right) {
                sb.append(str.substring(offset));
                sb.append(str.substring(0, offset));
            }
            else {
                sb.append(str.substring(str.length() - offset));
                sb.append(str.substring(0, str.length() - offset));
            }
        }
        return sb.toString();
    }
}