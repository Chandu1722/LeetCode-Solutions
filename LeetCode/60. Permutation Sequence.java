class Solution {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        for (int i = 1; i < k; i++) {
            nextPer(nums);
        }
        StringBuilder sb = new StringBuilder();
        for (int num : nums)
            sb.append(num);
        return sb.toString();
    }

    public static void nextPer(int[] nums) {
        int n = nums.length;
        int x = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                x = i;
                break;
            }
        }
        if (x == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[x]) {
                int t = nums[i];
                nums[i] = nums[x];
                nums[x] = t;
                break;
            }
        }
        reverse(nums, x + 1, n - 1);
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }
    }
}
