class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        int ans = 0;
        int currSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currSum += nums[i];
            int rightSum = sum - currSum;
            if ((rightSum - currSum) % 2 == 0)
                ans++;
        }
        return ans;
    }
}
