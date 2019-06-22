public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int current = m + n - 1;
        m--;
        n--;

        while (current >= 0) {
            if (m == -1) {
                A[current] = B[n];
                n--;
            }
            else if (n == -1) {
                A[current] = A[m];
                m--;
            }
            else {
                if(A[m] > B[n]) {
                    A[current] = A[m];
                    m--;
                }
                else {
                    A[current] = B[n];
                    n--;
                }
            }
            current--;
        }
    }
}