class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int rmin = Integer.MAX_VALUE;
            int cmax = Integer.MIN_VALUE;
            int colIndex = -1;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < rmin) {
                    rmin = matrix[i][j];
                    colIndex = j;
                }
            }
            for (int k = 0; k < m; k++) {
                if (matrix[k][colIndex] > cmax)
                    cmax = matrix[k][colIndex];
            }
            if (rmin == cmax)
                arr.add(rmin);
        }
        return arr;
    }
}
