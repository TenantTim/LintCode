public class Solution {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            paths[i][1] = 1;
        }
        for (int i = 1; i <= n; i++) {
            paths[1][i] = 1;
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                paths[i][j] = paths[i-1][j] + paths[i][j-1];
            }
        }

        return paths[m][n];
    }
}