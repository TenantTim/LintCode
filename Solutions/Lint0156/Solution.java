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
     * @param intervals: interval list.
     * @return: A new interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1) {
            return intervals;
        }

        List<Interval> result = new ArrayList<Interval>();
        intervals.sort(new SortByStart());
        for (int i = 0; i < intervals.size(); i++) {
            if (result.size() == 0) {
                result.add(intervals.get(i));
                continue;
            }
            if (intervals.get(i).start <= result.get(result.size()-1).end) {
                int biggerEnd = intervals.get(i).end > result.get(result.size()-1).end ? intervals.get(i).end : result.get(result.size()-1).end;
                Interval merged = new Interval(result.get(result.size()-1).start, biggerEnd);
                result.remove(result.size()-1);
                result.add(merged);
            }
            else {
                result.add(intervals.get(i));
            }
        }
        return result;
    }

    class SortByStart implements Comparator<Interval> 
    {
        public int compare(Interval a, Interval b) 
        {
            return a.start - b.start;
        }
    }
}