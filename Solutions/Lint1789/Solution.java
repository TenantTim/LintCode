public class Solution {
    /**
     * @param names: a string array
     * @return: the string array
     */
    public String[] DistinguishUsername(String[] names) {
        List<String> resultList = new ArrayList<String>();
        Map<String, Integer> countTable = new Hashtable<String, Integer>();

        for(int i = 0; i < names.length; i++) {
            if(countTable.get(names[i]) == null) {
                countTable.put(names[i], 1);
                resultList.add(names[i]);
            }
            else {
                Integer count = countTable.get(names[i]);
                countTable.replace(names[i], count + 1);
                resultList.add(names[i].concat(count.toString()));
            }
        }

        String[] result = resultList.stream().toArray(String[]::new);
        return result;
    }
}