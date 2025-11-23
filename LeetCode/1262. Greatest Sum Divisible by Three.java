class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[] { 0, Integer.MIN_VALUE, Integer.MIN_VALUE };
        for (int x : nums) {
            int[] next = dp.clone();
            int mod = x % 3;
            for (int i = 0; i < 3; i++) {
                int newMod = (mod + i) % 3;
                next[newMod] = Math.max(next[newMod], dp[i] + x);
            }
            dp = next;
        }
        return dp[0];
    }
}
