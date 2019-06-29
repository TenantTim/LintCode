public class Solution {
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            carry = (digits[i] == 9) ? 1 : 0;
            digits[i] += (digits[i] == 9) ? - 9 : 1;
            if(carry == 0) {
                return digits;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        for(int i = 1; i < result.length; i++) {
            result[i] = 0;
        }
        return result;
    }
}