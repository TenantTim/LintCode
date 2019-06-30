public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int i = 0, j = 0;
        while (j < nums.length) {
            while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
            nums[i] = nums[j];
            i++;
            j++;
        }

        return i;
    }
}