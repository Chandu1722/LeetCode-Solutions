class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i += k) {
            String sub = s.substring(i, i + k);
            int sum = 0;
            for (char c : sub.toCharArray()) {
                sum += c - 'a';
            }
            sum %= 26;
            str.append((char) ('a' + sum));
        }
        return str.toString();
    }
}
