class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        int m = String.valueOf(nums[0]).length();
        long ans = 0;
        while (m > 0) {
            int[] digits = new int[10];
            for (int i = 0; i < n; i++) {
                int r = nums[i] % 10;
                digits[r]++;
                nums[i] /= 10;
            }
            for (int c : digits) {
                ans += (long) c * (n - c);
            }
            m--;
        }
        return ans / 2;
    }
}
