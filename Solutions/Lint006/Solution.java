public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {

        int lengthA = A.length, lengthB = B.length;
        int result[] = new int[lengthA + lengthB];

        int i = 0, j = 0, p = 0;
        while(p < result.length)
        {
            int input = 0;
            if(i == lengthA)
            {
                input = B[j];
                j++;
            }
            else if(j == lengthB)
            {
                input = A[i];
                i++;
            }
            else
            {
                if(A[i] < B[j])
                {
                    input = A[i];
                    i++;
                }
                else
                {
                    input = B[j];
                    j++;
                }
            }
            result[p] = input;
            p++;
        }

        return result;
    }
}