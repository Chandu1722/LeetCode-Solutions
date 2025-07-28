class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];
        int x = 0;
        for (int i = 0; i < m + n - 1; i++) {
            int row, col;
            if (i % 2 == 0) {
                row = (i < m) ? i : m - 1;
                col = i - row;
                while (row >= 0 && col < n) {
                    arr[x++] = mat[row--][col++];
                }
            } else {
                col = (i < n) ? i : n - 1;
                row = i - col;
                while (col >= 0 && row < m) {
                    arr[x++] = mat[row++][col--];
                }
            }
        }
        return arr;
    }
}
