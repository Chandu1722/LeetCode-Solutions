class Solution {
    public boolean isGoodArray(int[] nums) {
        int g = nums[0];
        for (int n : nums) {
            g = gcd(g, n);
        }
        return g == 1;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
