public class Solution {
    /**
     * @param a: 
     * @param b: 
     * @param c: 
     * @param d: 
     * @return: return "Yes" or "No"
     */
    public String IsPossible(int a, int b, int c, int d) {
        while(c != 0 && d != 0) {
            if((a == c && b == d) || (a == d && b == c)) {
                return "Yes";
            }

            if(c >= d){
                c -= d;
            }
            else{
                d -= c;
            }
        }
        return "No";
    }
}