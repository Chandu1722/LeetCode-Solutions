class Solution {
    public int alternatingSum(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; i += 2) {
            ans += nums[i];
        }
        for (int i = 1; i < n; i += 2) {
            ans -= nums[i];
        }
        return ans;
    }
}
