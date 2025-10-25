class Solution {
    public int totalMoney(int n) {
        int last = 0;
        int ans = 0;
        while (n > 0) {
            for (int i = 1; i <= 7 && n > 0; i++) {
                ans += last + i;
                n--;
            }
            last++;
        }
        return ans;
    }
}
