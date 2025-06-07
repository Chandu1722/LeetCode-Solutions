class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (String s : words) {
            String l = s.toLowerCase();
            if (isInRow(l, s1) || isInRow(l, s2) || isInRow(l, s3)) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);

    }
    public static boolean isInRow(String str, String row) {
        for (char c : str.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
