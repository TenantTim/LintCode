public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers2(int[] A) {
        qSort(A, 0, A.length - 1);
    }

    private void qSort(int[] A, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivot = partition(A, startIndex, endIndex);
            qSort(A, startIndex, pivot - 1);
            qSort(A, pivot + 1, endIndex);
        }
    }

    private int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[endIndex];
        int i = startIndex;
        
        for(int j = startIndex; j < endIndex; j++) {
            if(nums[j] <= pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        int temp = nums[i];
        nums[i] = nums[endIndex];
        nums[endIndex] = temp;

        return i;
    }
}