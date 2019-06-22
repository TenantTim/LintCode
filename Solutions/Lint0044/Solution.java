public class Solution {
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        int length = nums.size();
        int currentSum = 0, minSum = 0;

        for(int i = 0; i < length; i++) {
            currentSum += nums.get(i);
            if(currentSum > 0) {
                currentSum = 0;
            }
            else if(currentSum < minSum) {
                minSum = currentSum;
            }
        }

        if(minSum == 0) {
            minSum = Integer.MAX_VALUE;
            for(int i = 0; i < length; i++) {
                if(nums.get(i) < minSum) {
                    minSum = nums.get(i);
                }
            }
        }

        return minSum;
    }
}