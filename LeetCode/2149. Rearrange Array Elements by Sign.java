class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n / 2];
        int[] arr2 = new int[n / 2];
        int x = 0, y = 0;
        for (int num : nums) {
            if (num > 0) {
                arr1[x++] = num;
            } else {
                arr2[y++] = num;
            }
        }
        x = 0;
        y = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = arr1[x++];
            } else {
                nums[i] = arr2[y++];
            }
        }
        return nums;
    }
}
