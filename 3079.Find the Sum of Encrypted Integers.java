class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += encrypt(nums[i]);
        }
        return sum; 
    }
    public static int encrypt(int x) {
        int j = 0;
        int max = Integer.MIN_VALUE;
        while (x != 0) {
            int r = x % 10;
            if (r > max)
                max = r;
            x /= 10;
            j++;
        }
        if (j == 2)
            return 11 * max;
        else if (j == 3)
            return 111 * max;
        else if (j == 4)
            return 1111 * max;
        return max;
    }
}
