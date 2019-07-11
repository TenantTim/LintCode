public class Solution {
    /**
     * @param nums: the given array
     * @return: if any value appears at least twice in the array
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }

        return false;
    }
}