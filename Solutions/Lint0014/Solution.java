public class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        return searchInRange(nums, target, 0, nums.length - 1);
    }

    private int searchInRange(int[] nums, int target, int startIndex, int endIndex) {
        if(startIndex > endIndex || target < nums[startIndex] || target > nums[endIndex]) {
            return -1;
        }
        else if(startIndex == endIndex) {
            return nums[startIndex] == target ? startIndex : -1;
        }
        else {
            int middle = (startIndex + endIndex) / 2, result = -1;
            
            if(target <= nums[middle]) {
                result = searchInRange(nums, target, startIndex, middle);
            }
            else {
                result = searchInRange(nums, target, middle + 1, endIndex);
            }

            return result;
        }
    }
}