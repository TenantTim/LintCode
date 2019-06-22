public class Solution {
    /**
     * @param nums: a integer array
     * @return: return an integer denoting the number of non-unique(duplicate) values
     */
    public List<Integer> CountDuplicates(List<Integer> nums) {
        // Initialize result
        List<Integer> resultList = new ArrayList<Integer>();

        // Map to store numbers' Count
        Map<Integer, Integer> countTable = new HashMap<Integer, Integer>();
        for(int num:nums) {
            Integer count = countTable.get(num);
            if (count != null) {
                if (count != 1) {
                    continue;
                }
                else {
                    countTable.put(num, 2);
                    resultList.add(num);
                }
            }
            else {
                countTable.put(num, 1);
            }
        }

        return resultList;
    }
}