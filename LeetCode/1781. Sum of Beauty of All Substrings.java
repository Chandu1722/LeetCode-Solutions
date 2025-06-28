class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] count = new int[26];
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                count[ch - 'a']++;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int num : count) {
                    if (num > 0) {
                        max = Math.max(max, num);
                        min = Math.min(min, num);
                    }
                }
                ans += max - min;
            }
        }
        return ans;
    }
}
