public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] paths = new int[m + 1][n + 1];

        boolean metZero = false;
        for (int i = 1; i <= m; i++) {
            paths[i][1] = metZero || obstacleGrid[i - 1][0] == 1 ? 0 : 1;
            metZero = metZero || obstacleGrid[i - 1][0] == 1;
        }

        metZero = false;
        for (int i = 1; i <= n; i++) {
            paths[1][i] = metZero || obstacleGrid[0][i - 1] == 1 ? 0 : 1;
            metZero = metZero || obstacleGrid[0][i - 1] == 1;
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                paths[i][j] = obstacleGrid[i - 1][j - 1] == 1 ? 0 : paths[i-1][j] + paths[i][j-1];
            }
        }

        return paths[m][n];
    }
}