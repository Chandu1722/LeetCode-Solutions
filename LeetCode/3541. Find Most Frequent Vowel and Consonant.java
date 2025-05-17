class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int a = 0, b = 0;
        String str = "aeiou";
        for (Character c : map.keySet()) {
            if (str.indexOf(c) != -1) {
                a = Math.max(a, map.get(c));
            } else {
                b = Math.max(b, map.get(c));
            }
        }
        return a + b;
    }
}
