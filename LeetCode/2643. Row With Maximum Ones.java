class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int a = 0, b = 0;
        for (int i = 0; i < mat.length; i++) {
            int x = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    x++;
                }
            }
            if (x > b) {
                b = x;
                a = i;
            }
        }
        return new int[] { a, b };
    }
}
