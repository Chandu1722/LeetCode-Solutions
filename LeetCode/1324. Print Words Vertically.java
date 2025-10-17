class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int n = 0;
        for (String str : words) {
            n = Math.max(n, str.length());
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (String word : words) {
                str.append((i < word.length() ? word.charAt(i) : " "));
            }
            ans.add(str.toString().stripTrailing());
        }
        return ans;
    }
}
