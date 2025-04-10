class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder str = new StringBuilder();
        for (String word : arr) {
            if (word.length() <= 2) {
                str.append(word.toLowerCase()).append(" ");
            } else {
                str.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return str.toString().trim();
    }
}
