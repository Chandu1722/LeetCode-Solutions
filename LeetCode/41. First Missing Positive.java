class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int x = 1;
        for (int n : nums) {
            if (n == x)
                x++;
        }
        return x;
    }
}
