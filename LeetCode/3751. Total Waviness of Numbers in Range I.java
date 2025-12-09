class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int i = num1; i <= num2; i++) {
            ans += wave(i);
        }
        return ans;
    }

    public static int wave(int n) {
        String s = Integer.toString(n);
        int l = s.length();
        if (l < 3)
            return 0;
        int ans = 0;
        for (int i = 1; i < l - 1; i++) {
            int a = s.charAt(i - 1) - '0';
            int b = s.charAt(i) - '0';
            int c = s.charAt(i + 1) - '0';
            if ((b > a && b > c) || b < a && b < c) {
                ans++;
            }
        }
        return ans;
    }
}
