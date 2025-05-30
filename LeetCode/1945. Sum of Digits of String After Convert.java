class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i) - 'a' + 1;
        }
        int x = 0;
        while (x < k) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }
            str = String.valueOf(sum);
            x++;
        }
        return Integer.valueOf(str);
    }
}
