class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            arr[i] = ans(queries[i][0], queries[i][1], queries[i][2], points);
        }
        return arr;
    }

    public static int ans(int x1, int y1, int r, int[][] point) {
        int x = 0;
        for (int i = 0; i < point.length; i++) {
            int n = Math.abs(x1 - point[i][0]) * Math.abs(x1 - point[i][0])
                    + Math.abs(y1 - point[i][1]) * Math.abs(y1 - point[i][1]);
            if (Math.sqrt(n) <= r) {
                x++;
            }
        }
        return x;
    }
}
