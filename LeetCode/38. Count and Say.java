class Solution {
    public String countAndSay(int n) {
        String ans = "1";
        for (int i = 0; i < n - 1; i++) {
            ans = count(ans);
        }
        return ans;
    }

    public static String count(String s) {
        StringBuilder str = new StringBuilder();
        int count = 1;
        char curr = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                count++;
            } else {
                str.append(count).append(curr);
                count = 1;
                curr = s.charAt(i);
            }
        }
        str.append(count).append(curr);
        return str.toString();
    }
}
