class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for (int n : nums)
            x ^= n;
        int y = x & -x;
        int a = 0, b = 0;
        for (int n : nums) {
            if ((n & y) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[] { a, b };
    }
}
