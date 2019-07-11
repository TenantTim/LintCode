public class Solution {
    /**
     * @param nums: the given array
     * @param k: the given k
     * @param t: the given t
     * @return: whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length <= 1) {
            return false;
        }

        HashMap<Integer, Integer> recentMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i] - t; j <= nums[i] + t; j++) {
                if (recentMap.containsKey(j) && i - recentMap.get(j) <= k) {
                    return true;
                }
            }

            if (recentMap.containsKey(nums[i])) {
                recentMap.replace(nums[i], i);
            }
            else {
                recentMap.put(nums[i], i);
            }
        }

        return false;
    }
}