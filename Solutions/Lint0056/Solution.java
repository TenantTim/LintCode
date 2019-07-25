public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> valueIndexMapping = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            valueIndexMapping.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (valueIndexMapping.containsKey(target - numbers[i])) {
                result[0] = i;
                result[1] = valueIndexMapping.get(target - numbers[i]);
                return result;
            }
        }

        return result;
    }
}