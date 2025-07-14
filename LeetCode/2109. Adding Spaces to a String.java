class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        str.append(s.substring(0, spaces[0]));
        int i = 1;
        for (i = 1; i < spaces.length; i++) {
            str.append(" ");
            str.append(s.substring(spaces[i - 1], spaces[i]));
        }
        str.append(" ");
        str.append(s.substring(spaces[i - 1]));
        return str.toString();
    }
}
