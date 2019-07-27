public class Solution {
    /**
     * @param nums: a integer array
     * @return: nothing
     */
    public void reverseArray(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}