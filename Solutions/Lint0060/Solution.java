public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        if (A.length == 0) {
            return 0;
        }

        return searchInsertIndex(A, 0, A.length - 1, target);
    }

    private int searchInsertIndex(int[] A, int startIndex, int endIndex, int target) {
        if(startIndex == endIndex) {
            if(target <= A[startIndex]) {
                return startIndex;
            }
            else {
                return startIndex + 1;
            }
        }

        int middle = (startIndex + endIndex) / 2;
        if(target <= A[middle]) {
            return searchInsertIndex(A, startIndex, middle, target);
        }
        else {
            return searchInsertIndex(A, middle + 1, endIndex, target);
        }
    }
}