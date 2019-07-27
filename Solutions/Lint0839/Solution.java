/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param list1: one of the given list
     * @param list2: another list
     * @return: the new sorted list of interval
     */
    public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {
        List<Interval> result = new ArrayList<Interval>();

        int i = 0, j = 0, current = -1;
        while (true) {
            if (i >= list1.size() && j >= list2.size()) {
                break;
            }

            Interval toMerge = null;
            if (i >= list1.size()) {
                toMerge = list2.get(j);
                j++;
            }
            else if (j >= list2.size()){
                toMerge = list1.get(i);
                i++;
            }
            else {
                if (list1.get(i).start < list2.get(j).start) {
                    toMerge = list1.get(i);
                    i++;
                }
                else {
                    toMerge = list2.get(j);
                    j++;
                }
            }

            if (current == -1) {
                result.add(toMerge);
                current++;
                continue;
            }

            Interval currentInterval = result.get(current);
            if (toMerge.start > currentInterval.end) {
                result.add(toMerge);
                current++;
            }
            else {
                currentInterval = new Interval(currentInterval.start, currentInterval.end > toMerge.end ? currentInterval.end : toMerge.end);
                result.set(current, currentInterval);
            }
        }

        return result;
    }
}