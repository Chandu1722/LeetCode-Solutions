class Solution {
    public String getHint(String s, String g) {
        int x = 0, y = 0;
        int[] s1 = new int[10];
        int[] s2 = new int[10];
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = g.charAt(i);
            if (a == b) {
                x++;
            } else {
                s1[a - '0']++;
                s2[b - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            y += Math.min(s1[i], s2[i]);
        }
        return x + "A" + y + "B";
    }
}
