class Solution {
    public int minDeletionSize(String[] str) {
        int ans = 0;
        for (int i = 0; i < str[0].length(); i++) {
            ans += helper(str, i);
        }
        return ans;
    }

    public int helper(String[] str, int j) {
        for (int i = 1; i < str.length; i++) {
            if (str[i].charAt(j) < str[i - 1].charAt(j)) {
                return 1;
            }
        }
        return 0;
    }
}
