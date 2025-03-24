class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
                if (nums[i + 1] == 0)
                    nums[i + 1] = 1;
                else
                    nums[i + 1] = 0;
                if (nums[i + 2] == 0)
                    nums[i + 2] = 1;
                else
                    nums[i + 2] = 0;
                c++;
            }

        }
        for (int num : nums) {
            if (num != 1) {
                c = -1;
                break;
            }
        }

        return c;
    }
}
