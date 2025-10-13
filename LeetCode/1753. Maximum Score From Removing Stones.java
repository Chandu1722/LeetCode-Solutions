class Solution {
    public int maximumScore(int a, int b, int c) {
        int ans = 0;
        while ((a != 0 || b != 0) && (b != 0 || c != 0) && (c != 0 || a != 0)) {
            if (a >= c && b >= c) {
                a--;
                b--;
            } else if (b >= a && c >= 0) {
                b--;
                c--;
            } else if (a >= b && c >= b) {
                a--;
                c--;
            }
            ans++;
        }
        return ans;
    }
}
