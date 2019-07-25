public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        if (nums.size() <= 1) {
            return;
        }

        while (nums.get(0) >= nums.get(nums.size() - 1)) {
            int first = nums.get(0);
            nums.remove(0);
            nums.add(first);
        }
    }
}