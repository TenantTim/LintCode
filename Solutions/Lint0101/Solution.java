public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 0, j = 0, currentCount = 1;
        while (i < nums.length) {
            currentCount += (i > 0 && nums[i] == nums[i - 1]) ? 1 : (1 - currentCount);
            if (currentCount < 3) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        return j;
    }
}