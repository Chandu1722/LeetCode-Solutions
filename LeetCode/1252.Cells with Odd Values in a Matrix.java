class Solution { 
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for (int x = 0; x < indices.length; x++) {
            int i = indices[x][0];
            int j = indices[x][1];
            for (int p = 0; p < n; p++) {
                mat[i][p]++;
            }
            for (int q = 0; q < m; q++) {
                mat[q][j]++;
            }
        }
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0)
                    c++;
            }
        }
        return c;
    }
}
