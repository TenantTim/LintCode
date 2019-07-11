public class Solution {
    /**
     * @param nums: the given array
     * @param k: the given number
     * @return:  whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1) {
           return false; 
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int diff = i - map.get(nums[i]);
                if (diff <= k) {
                    return true;
                }
                map.replace(nums[i], i);
            }
            else {
                map.put(nums[i], i);
            }
        }

        return false;
    }
}