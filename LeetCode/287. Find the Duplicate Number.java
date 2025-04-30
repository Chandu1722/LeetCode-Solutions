class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = 1;
        int max = Integer.MIN_VALUE;
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                n++;
            if (n > max) {
                num = nums[i];
                max = n;
            }
        }
        return num;
    }
}
