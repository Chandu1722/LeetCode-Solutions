class Solution {
    public long coloredCells(int n) {
        return ans(n);
    }

    public static long ans(int n) {
        if (n == 1)
            return 1;
        return ans(n - 1) + 4 * (n - 1);
    }
}
