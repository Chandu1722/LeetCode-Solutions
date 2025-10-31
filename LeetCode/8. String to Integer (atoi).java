class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int sign = 1;
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            if (ans > Integer.MAX_VALUE / 10 ||
                    (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + (digit);
            i++;
        }
        return sign * ans;
    }
}
