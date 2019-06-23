public class Solution {
    /**
     * @param sticks: the length of each stick
     * @return: return a Integer array
     */
    public int[] CutTheSticks(int[] sticks) {
        if(sticks.length == 0) {
            return new int[0];
        }
        
        List<Integer> resultList = new ArrayList<Integer>();
        Integer previous = null;
        Arrays.sort(sticks);
        for(int i = 0; i < sticks.length; i++) {
            if(previous != null && previous.intValue() == sticks[i]) {
                continue;
            }
            else {
                resultList.add(sticks.length - i);
                previous = (Integer)sticks[i];
            }
        }
        
        int[] result = resultList.stream().mapToInt(i->i).toArray();
        return result;
    }
}