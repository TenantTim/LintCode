public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        int maxSum = 0, currentSum = 0;

        for(int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if(currentSum < 0) {
                currentSum = 0;
            }
            else {
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        if(maxSum == 0) {
            maxSum = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > maxSum) {
                    maxSum = nums[i];
                }
            }
        }

        return maxSum;
    }
}