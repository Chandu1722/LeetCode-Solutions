class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : target.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (char ch : map2.keySet()) {
            if (!map1.containsKey(ch)) {
                return 0;
            }
            int copy = map1.get(ch) / map2.get(ch);
            ans = Math.min(ans, copy);
        }
        return ans;
    }
}
