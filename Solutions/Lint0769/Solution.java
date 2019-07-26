public class Solution {
    /**
     * @param n: a Integer
     * @return: a spiral array
     */
    public int[][] spiralArray(int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 0;
            }
        }

        if (n == 1) {
            result[0][0] = 1;
            return result;
        }

        /*1 for right, 1 for down, 2 for left, 3 for up*/
        int direction = 0, x = 0, y = 0, val = 1;

        while(true) {
            if (result[x][y] != 0) {
                break;
            }

            result[x][y] = val;
            val++;

            if (direction == 0) {
                if (y < n - 1 && result[x][y + 1] == 0) {
                    y++;
                }
                else {
                    x++;
                    direction = 1;
                }
            }
            else if (direction == 1) {
                if (x < n - 1 && result[x + 1][y] == 0) {
                    x++;
                }
                else {
                    y--;
                    direction = 2;
                }
            }
            else if (direction == 2) {
                if (y > 0 && result[x][y - 1] == 0) {
                    y--;
                }
                else {
                    x--;
                    direction = 3;
                }
            }
            else if (direction == 3) {
                if (x > 0 && result[x - 1][y] == 0) {
                    x--;
                }
                else {
                    y++;
                    direction = 0;
                }
            }
        }
        return result;
    }
}