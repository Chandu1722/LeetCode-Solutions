class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0)
            return m * n;
        // int[][] M = new int[m][n];
        // int max = 0;
        // for (int k = 0; k < ops.length; k++) {
        //     for (int i = 0; i < ops[k][0]; i++) {
        //         for (int j = 0; j < ops[k][1]; j++) {
        //             M[i][j]++;
        //             max = Math.max(max, M[i][j]);
        //         }
        //     }
        // }
        // int count = 0;
        // for (int[] row : M) {
        //     for (int num : row) {
        //         if (num == max)
        //             count++;
        //     }
        // }
        // return count;
        int minRow = m;
        int minCol = n;
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }
        return minRow * minCol;
    }
}
