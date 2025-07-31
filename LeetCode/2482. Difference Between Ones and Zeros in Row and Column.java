class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        int[] row = new int[m];
        int[] col = new int[n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            int x = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1)
                    x++;
            }
            row[k++] = x;
        }
        k = 0;
        for (int i = 0; i < n; i++) {
            int x = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 1)
                    x++;
            }
            col[k++] = x;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j] = 2 * row[i] + 2 * col[j] - m - n;
            }
        }
        return diff;
    }
}
