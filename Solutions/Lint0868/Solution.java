public class Solution {
    /**
     * @param nums: an array
     * @param k: an integer
     * @return: the maximum average value
     */
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i];
            currentSum -= nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return (double)maxSum / (double)k;
    }
}