class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ");
        String[] word = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            str.append(word[i]).append(" ");
        }
        return str.toString().trim();
    }
}
