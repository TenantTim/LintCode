public class Solution {
    /**
     * @param nums: an array
     * @return: the sum of min(ai, bi) for all i from 1 to n
     */
    public int arrayPairSum(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        else {
            int sum = 0;
            Arrays.sort(nums);
            for(int i = 0; i < nums.length; i++) {
                if(i % 2 == 0) {
                    sum += nums[i];
                }
            }
            return sum;
        }
    }
}