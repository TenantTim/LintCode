public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        else if (nums.length == 1) {
            return nums[0];
        }
        else {
            return findMedian(nums, 0, nums.length - 1, (nums.length - 1) / 2);
        }
    }

    private int findMedian(int[] nums, int startIndex, int endIndex, int targetIndex) {
        if(startIndex == endIndex) {
            return nums[startIndex];
        }
        else {
            int pivot = partition(nums, startIndex, endIndex);
            if(targetIndex == pivot) {
                return nums[pivot];
            }
            if(targetIndex > pivot) {
                return findMedian(nums, pivot + 1, endIndex, targetIndex);
            }
            else {
                return findMedian(nums, startIndex, pivot - 1, targetIndex);
            }
        }
    }

    private int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[endIndex];
        int i = startIndex - 1;
        
        for(int j = startIndex; j < endIndex; j++) {
            if(nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[endIndex];
        nums[endIndex] = temp;

        return i + 1;
    }
}