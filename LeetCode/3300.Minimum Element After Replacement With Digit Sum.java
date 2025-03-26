class Solution {
    public int minElement(int[] nums) {
        int min = 10001;
        for (int i = 0; i < nums.length; i++) {
            int num = sumDigit(nums[i]);
            if (num < min)
                min = num;
        }
        return min;
    }

    public static int sumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }
}
