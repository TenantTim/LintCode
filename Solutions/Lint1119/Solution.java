public class Solution {
    /**
     * @param nums: an integer array
     * @return: the maximum product
     */
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        if (len == 3) {
            return nums[0] * nums[1] * nums[2];
        }

        Arrays.sort(nums);
        int t1 = nums[len - 1] * nums[len - 2] * nums[len - 3],
            t2 = nums[len - 1] * nums[0] * nums[1];

        return t1 > t2 ? t1 : t2;
    }
}