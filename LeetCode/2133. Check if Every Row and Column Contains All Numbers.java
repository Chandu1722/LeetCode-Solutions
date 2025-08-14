class Solution {
    public boolean checkValid(int[][] matrix) {
        return rows(matrix) && cols(matrix);
    }

    public boolean rows(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                set.add(matrix[i][j]);
            }
            if (set.size() == n) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean cols(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                set.add(matrix[j][i]);
            }
            if (set.size() == n) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
