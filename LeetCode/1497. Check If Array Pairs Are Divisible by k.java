class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] nums = new int[k];
        for (int num : arr) {
            int r = ((num % k) + k) % k;
            nums[r]++;
        }
        if (nums[0] % 2 != 0)
            return false;
        for (int i = 1; i <= k / 2; i++) {
            if (nums[i] != nums[k - i]) {
                return false;
            }
        }
        return true;
    }
}
