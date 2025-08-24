class Solution {
    public int longestSubarray(int[] nums) {
        int ans = 0, prev = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            while (i < n && nums[i] == 1) {
                count++;
                i++;
            }
            ans = Math.max(ans, count + prev);
            prev = count;
        }
        return ans == n ? ans - 1 : ans;
    }
}
