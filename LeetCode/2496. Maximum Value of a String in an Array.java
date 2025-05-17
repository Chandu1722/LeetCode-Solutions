class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for (String s : strs) {
            int x = 0;
            if (isNumeric(s)) {
                x = Integer.parseInt(s);
            } else {
                x = s.length();
            }
            ans = Math.max(ans, x);
        }
        return ans;
    }

    public boolean isNumeric(String str) {
        if (str == null || str.isEmpty())
            return false;
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
