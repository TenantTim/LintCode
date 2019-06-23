public class Solution {
    /**
     * @param sales: a integer array
     * @return: return a Integer
     */
    public int BalancedSalesArray(int[] sales) {
        int length = sales.length, sum = 0, pivot = 0;
        
        for(int i = 0; i < length; i++) {
            sum += sales[i];
        }

        sum -= sales[0];
        while(pivot < length) {
            if(sum == 0) {
                return pivot;
            }
            else {
                if(pivot != length - 1) {
                    sum -= sales[pivot + 1];
                }
                sum -= sales[pivot];
                pivot++;
            }
        }

        return -1;
    }
}