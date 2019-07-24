public class Solution {
    /*
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        if (nums.length <= 1)
            return;

        int i = 0, j = 0;
        while (true) {
            while (i < nums.length && nums[i] % 2 != 0) {
                i++;
            }
            if (i >= nums.length) {
                break;
            }

            j = i;

            while (j < nums.length && nums[j] % 2 == 0) {
                j++;
            }
            if (j >= nums.length) {
                break;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}