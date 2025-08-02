class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            int x = 0;
            int sum = 0;
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;
                    if (d1 == d2) {
                        sum += d1;
                        x++;
                    } else {
                        sum += d1 + d2;
                        x += 2;
                    }
                }
                if (x > 4)
                    break;
            }
            if (x == 4) {
                ans += sum;
            }
        }
        return ans;
    }
}
