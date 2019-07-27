public class Solution {
    /**
     * @param bits: a array represented by several bits. 
     * @return: whether the last character must be a one-bit character or not
     */
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length < 2) {
            return true;
        }

        int start = 0, last = 0;
        while (start < bits.length) {
            last = bits[start] == 1 ? 2 : 1;
            start += last;
        }
        return last == 1;
    }
}