public class Solution {
    /**
     * @param nums: a integer array
     * @return: the index of the largest element
     */
    public int dominantIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        else if (nums.length == 1) {
            return 0;
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, index1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                index1 = i;
            }
            else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return max1 >= 2 * max2 ? index1 : -1;
    }
}