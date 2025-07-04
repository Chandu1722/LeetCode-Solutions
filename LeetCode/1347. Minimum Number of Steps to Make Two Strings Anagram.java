class Solution {
    public int minSteps(String s, String t) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        int ans = 0;
        for (int n : count) {
            if (n > 0) {
                ans += n;
            }
        }
        return ans;
    }
}
