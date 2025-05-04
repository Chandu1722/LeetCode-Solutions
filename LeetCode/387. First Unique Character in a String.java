class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> arr = new HashMap<>();
        for (char ch : s.toCharArray()) {
            arr.put(ch, arr.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
