public class Solution {
    /**
     * @param seats: an array
     * @return: the maximum distance
     */
    public int maxDistToClosest(int[] seats) {
        int i = 0, j = 0, result = -1;
        while (i < seats.length) {
            while (i < seats.length && seats[i] == 1) {
                i++;
            }

            if (i == seats.length) {
                break;
            }

            j = i;
            while (j < seats.length && seats[j] == 0) {
                j++;
            }
            j--;

            int current = (i == 0 || j == seats.length - 1) ? j - i + 1 : (j - i + 2) / 2;
            result = current > result ? current : result;
            i = j + 1;
        }
        return result;
    }
}