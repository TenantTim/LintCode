public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }

        int longest = 0, current = 1, previousDiff = 0, currentDiff = 0;
        for (int i = 1; i < A.length; i++) {
            currentDiff = A[i] - A[i - 1] > 0 ? 1 : -1;
            if (currentDiff == previousDiff) {
                current ++;
                if (current > longest) {
                    longest = current;
                }
            }
            else {
                current = 1;
            }
            previousDiff = currentDiff;
        }

        return longest + 1;
    }
}