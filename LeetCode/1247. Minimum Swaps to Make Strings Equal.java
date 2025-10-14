class Solution {
    public int minimumSwap(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return -1;
        }
        int x = 0, y = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 == c2) {
                continue;
            }
            if (c1 == 'x') {
                x++;
            } else {
                y++;
            }
        }
        if ((x + y) % 2 != 0) {
            return -1;
        }
        int ans = x / 2 + y / 2;
        if (x % 2 == 1) {
            ans += 2;
        }
        return ans;
    }
}
