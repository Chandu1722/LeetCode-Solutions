class Solution {
    public int maximumSwap(int num) {
        char[] nums = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < nums.length; i++) {
            last[nums[i] - '0'] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 9; j > nums[i] - '0'; j--) {
                if (last[j] > i) {
                    char temp = nums[i];
                    nums[i] = nums[last[j]];
                    nums[last[j]] = temp;
                    return Integer.parseInt(new String(nums));
                }
            }
        }
        return num;
    }
}
