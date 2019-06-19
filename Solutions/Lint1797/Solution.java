public class Solution {
    /**
     * @param A: a integer sorted array
     * @param B: a integer sorted array
     * @param K: a integer
     * @return: return a pair of index
     */
    public int[] optimalUtilization(int[] A, int[] B, int K) {
        // Corner cases
        if(A.length == 0 || B.length == 0 || A[0] + B[0] > K) {
            return new int[0];
        }

        // Initialize result
        int[] result = new int[2];

        // Iterate in A, find minimum B with maximum sum
        int currentMax = Integer.MIN_VALUE;
        int j = B.length - 1;
        for(int i = 0; i < A.length; i++) {
            while(A[i] + B[j] > K) {
                j--;
                if(j < 0) {
                    return result;
                }
            }
            if(A[i] + B[j] > currentMax && A[i] + B[j] <= K) {
                while(j > 0 && B[j] == B[j-1]) {
                    j--;
                }
                currentMax = A[i] + B[j];
                result[0] = i;
                result[1] = j;
            }
        }

        return result;
    }
}