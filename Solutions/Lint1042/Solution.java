public class Solution {
    /**
     * @param matrix: the given matrix
     * @return: True if and only if the matrix is Toeplitz
     */
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length <= 1 || matrix[0].length <= 1) {
            return true;
        }

        for (int i = 2 - matrix.length; i < matrix[0].length - 1; i++) {
            int x = i <= 0 ? 0 - i : 0, y = i <= 0 ? 0 : i;
            int first = matrix[x][y];
            while (x < matrix.length && y < matrix[0].length) {
                if (matrix[x][y] != first) {
                    return false;
                }
                x++;
                y++;
            }
        }

        return true;
    }
}