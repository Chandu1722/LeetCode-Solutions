class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 0) {
                count++;
                ans += count;
            } else {
                count = 0;
            }
        }
        return ans;
    }
}
