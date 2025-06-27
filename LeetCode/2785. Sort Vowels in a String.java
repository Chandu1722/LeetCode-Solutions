class Solution {
    public String sortVowels(String s) {
        StringBuffer str = new StringBuffer();
        for (char c : s.toCharArray()) {
            char ch = Character.toLowerCase(c);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                str.append(c);
            }
        }
        char[] chr = str.toString().toCharArray();
        Arrays.sort(chr);
        char[] ans = s.toCharArray();
        int k = 0;
        for (int i = 0; i < ans.length; i++) {
            char ch = Character.toLowerCase(ans[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ans[i] = chr[k++];
            }
        }
        return new String(ans);

    }
}
